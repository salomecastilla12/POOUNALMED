import tkinter as tk
from tkinter import scrolledtext

def iniciar_simulacion():
    # Limpiar la caja de texto antes de escribir
    txt_consola.config(state='normal')
    txt_consola.delete('1.0', tk.END)
    
    txt_consola.insert(tk.END, "[INICIO] Ejecutando método main()...\n\n")
    
    # --- Primer bloque ---
    try:
        txt_consola.insert(tk.END, "Ingresando al primer try\n")
        cociente = 10000 / 0
    except ZeroDivisionError:
        txt_consola.insert(tk.END, "División por cero\n")
    finally:
        txt_consola.insert(tk.END, "Ingresando al primer finally\n")
        
    txt_consola.insert(tk.END, "\n" + "-"*40 + "\n\n")
    
    # --- Segundo bloque ---
    try:
        txt_consola.insert(tk.END, "Ingresando al segundo try\n")
        objeto = None
        objeto.split() # Provoca error al ser None
    except ZeroDivisionError:
        txt_consola.insert(tk.END, "División por cero\n")
    except Exception:
        txt_consola.insert(tk.END, "Ocurrió una excepción\n")
    finally:
        txt_consola.insert(tk.END, "Ingresando al segundo finally\n")
        
    txt_consola.insert(tk.END, "\n[FIN] Ejecución finalizada.")
    txt_consola.config(state='disabled')

# Ventana Principal
ventana = tk.Tk()
ventana.title("Simulador de Excepciones - Ejercicio 6.4")
ventana.geometry("450x380")
ventana.config(padx=15, pady=15)

btn_ejecutar = tk.Button(ventana, text="Ejecutar Programa", command=iniciar_simulacion, bg="#2e7d32", fg="white", font=("Arial", 11, "bold"))
btn_ejecutar.pack(fill='x', pady=10)

lbl_output = tk.Label(ventana, text="Salida de Pantalla (Consola):", font=("Arial", 10, "bold"))
lbl_output.pack(anchor='w')

txt_consola = scrolledtext.ScrolledText(ventana, width=50, height=12, font=("Consolas", 11), bg="#1e1e1e", fg="#ffffff")
txt_consola.pack(fill='both', expand=True, pady=5)
txt_consola.insert(tk.END, "Presiona el botón de arriba para iniciar...")
txt_consola.config(state='disabled')

ventana.mainloop()