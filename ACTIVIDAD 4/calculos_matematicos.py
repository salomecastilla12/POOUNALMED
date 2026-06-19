import tkinter as tk
import math

def calcular():
    """
    Función encargada de recolectar el dato de la interfaz, 
    validar los errores (Excepciones) y mostrar el resultado.
    """
    valor_ingresado = entrada_valor.get()
    
    try:
        # Equivale a InputMismatchException: Validar que sea un número
        valor = float(valor_ingresado)
        
        # Equivale a ArithmeticException: Validar que no sea negativo
        if valor < 0:
            raise ValueError("aritmético")
            
        # Cálculo del Logaritmo Neperiano
        # Nota: En Python math.log(0) da error, en Java da -Infinity. 
        # Lo adaptamos para que actúe exactamente como el comportamiento de Java.
        if valor == 0:
            res_log = "-Infinity"
        else:
            res_log = f"{math.log(valor):.4f}"
            
        # Cálculo de la Raíz Cuadrada
        res_raiz = f"{math.sqrt(valor):.4f}"
        
        # Si todo sale bien, mostramos los resultados en color verde
        lbl_resultado_log.config(text=f"Resultado Logaritmo = {res_log}", fg="#1b5e20")
        lbl_resultado_raiz.config(text=f"Resultado Raíz = {res_raiz}", fg="#1b5e20")
        
    except ValueError as e:
        # Separamos el tipo de error según lo ocurrido
        if str(e) == "aritmético":
            # Mensajes para números negativos
            lbl_resultado_log.config(text="El valor debe ser un número positivo para calcular el logaritmo", fg="#b71c1c")
            lbl_resultado_raiz.config(text="El valor debe ser un número positivo para calcular la raíz cuadrada", fg="#b71c1c")
        else:
            # Mensaje para ingresos no numéricos (letras, símbolos)
            lbl_resultado_log.config(text="El valor debe ser numérico para calcular el logaritmo", fg="#b71c1c")
            lbl_resultado_raiz.config(text="El valor debe ser numérico para calcular la raíz cuadrada", fg="#b71c1c")

# ==========================================
# CONFIGURACIÓN DE LA INTERFAZ GRÁFICA (GUI)
# ==========================================

# 1. Crear la ventana principal
ventana = tk.Tk()
ventana.title("Cálculos Numéricos - Ejercicio 6.6")
ventana.geometry("500x280")
ventana.config(padx=20, pady=20)

# 2. Etiquetas e Input de texto
lbl_instruccion = tk.Label(ventana, text="Valor numérico:", font=("Arial", 12, "bold"))
lbl_instruccion.pack(anchor="w", pady=5)

entrada_valor = tk.Entry(ventana, font=("Arial", 12), width=20)
entrada_valor.pack(fill="x", pady=5)

# 3. Botón para ejecutar la acción
# Al hacer clic, llama a la función 'calcular' definida arriba
btn_calcular = tk.Button(ventana, text="Calcular", command=calcular, font=("Arial", 11, "bold"), bg="#1976D2", fg="white", cursor="hand2")
btn_calcular.pack(fill="x", pady=15)

# 4. Marcos y etiquetas para mostrar las respuestas
lbl_resultado_log = tk.Label(ventana, text="Resultado Logaritmo = Un asignado aún", font=("Arial", 10, "italic"), wraplength=450, justify="left")
lbl_resultado_log.pack(anchor="w", pady=5)

lbl_resultado_raiz = tk.Label(ventana, text="Resultado Raíz = Un asignado aún", font=("Arial", 10, "italic"), wraplength=450, justify="left")
lbl_resultado_raiz.pack(anchor="w", pady=5)

# 5. Mantener la ventana activa esperando interacciones
ventana.mainloop()