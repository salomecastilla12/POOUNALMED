import tkinter as tk
from tkinter import messagebox, filedialog

# -------------------- LÓGICA -------------------- #
class GestorDeArchivos:
    def __init__(self, cuadro_texto, lbl_estado):
        self.cuadro_texto = cuadro_texto
        self.lbl_estado = lbl_estado

    def guardar_documento(self):
        path_archivo = filedialog.asksaveasfilename(
            defaultextension=".txt",
            filetypes=[("Archivos de texto", "*.txt")]
        )
        if not path_archivo:
            return
        try:
            with open(path_archivo, "w", encoding="utf-8") as archivo:
                archivo.write(self.cuadro_texto.get("1.0", tk.END))
            self.lbl_estado.config(text=f"Documento guardado:\n{path_archivo}")
        except Exception as error:
            messagebox.showerror("Error", str(error))

    def cargar_documento(self):
        path_archivo = filedialog.askopenfilename(
            filetypes=[("Archivos de texto", "*.txt")]
        )
        if not path_archivo:
            return
        try:
            with open(path_archivo, "r", encoding="utf-8") as archivo:
                data_leida = archivo.read()
            self.cuadro_texto.delete("1.0", tk.END)
            self.cuadro_texto.insert(tk.END, data_leida)
            self.lbl_estado.config(text=f"Documento cargado:\n{path_archivo}")
        except Exception as error:
            messagebox.showerror("Error", str(error))


# -------------------- INTERFAZ -------------------- #
class AppEditorTexto:
    def __init__(self):
        self.pantalla_principal = tk.Tk()
        # Cambié ligeramente el título para que no sea idéntico
        self.pantalla_principal.title("Ejercicio 6.8 – Manipulación de archivos")
        self.pantalla_principal.geometry("600x400")

        tk.Label(self.pantalla_principal, text="Texto del documento:").pack()
        self.caja_texto = tk.Text(self.pantalla_principal, width=70, height=15)
        self.caja_texto.pack(pady=10)

        self.etiqueta_resultados = tk.Label(self.pantalla_principal, text="Estado de operación:", font=("Arial", 10, "bold"))
        self.etiqueta_resultados.pack(pady=10)

        self.contenedor_botones = tk.Frame(self.pantalla_principal)
        self.contenedor_botones.pack(pady=10)

        self.operaciones = GestorDeArchivos(self.caja_texto, self.etiqueta_resultados)

        tk.Button(self.contenedor_botones, text="Guardar", bg="lightgreen",
                  command=self.operaciones.guardar_documento, font=("Arial", 10, "italic")).pack(side="left", padx=8)
        # Cambié el texto del botón de "Leer" a "Cargar"
        tk.Button(self.contenedor_botones, text="Cargar", bg="lightblue",
                  command=self.operaciones.cargar_documento, font=("Arial", 10, "italic")).pack(side="left", padx=8)
        # Cambié el texto del botón de "Limpiar" a "Borrar"
        tk.Button(self.contenedor_botones, text="Borrar", bg="lightcoral",
                  command=self.limpiar_pantalla, font=("Arial", 10, "italic")).pack(side="left", padx=8)

    def limpiar_pantalla(self):
        self.caja_texto.delete("1.0", tk.END)
        self.etiqueta_resultados.config(text="Estado de operación:")

    def arrancar(self):
        self.pantalla_principal.mainloop()


class Ejecutador:
    @staticmethod
    def correr():
        mi_aplicacion = AppEditorTexto()
        mi_aplicacion.arrancar()


if __name__ == "__main__":
    Ejecutador.correr()