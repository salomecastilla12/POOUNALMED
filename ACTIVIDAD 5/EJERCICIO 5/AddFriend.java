package com.mycompany.actividad5_1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class AddFriend {
    public static void main(String[] data) {

        // ┌─ NIVEL 1: try-catch envuelve TODO ──────────────────┐
        try {

            // ── PASO 2: recibir argumentos ────────────────────
            String newName = data[0];
            long newNumber = Long.parseLong(data[1]);

            // ── PASO 3: abrir el archivo ──────────────────────
            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                file.createNewFile();       // lo crea si no existe
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            // ── PASO 4: recorrer buscando duplicados ──────────
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                String linea = raf.readLine();
                String[] partes = linea.split("!");
                String nombre = partes[0];
                long numero = Long.parseLong(partes[1]);

                if (nombre.equals(newName) || numero == newNumber) {
                    found = true;
                    break;
                }
            }

            // ── PASO 5: escribir o avisar ─────────────────────
            if (!found) {
                String registro = newName + "!" + newNumber;
                raf.writeBytes(registro);
                raf.writeBytes(System.lineSeparator());
                System.out.println("Friend added.");
            } else {
                System.out.println("Already exists.");
            }

            raf.close();    // siempre cerrar al final

        // └─ NIVEL 1: aquí terminan los pasos 2-5 ─────────────┘

        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }

    }  // fin main
}  // fin clase