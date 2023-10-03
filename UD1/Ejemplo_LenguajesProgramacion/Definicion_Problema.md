# Problema
```texto
Desarrollar un programa que solicite al usuario las dimensiones de un rectángulo (base y altura) y calcule su área.
```
# Análisis (del Problema)
Para resolver este problema, se necesita desarrollar un programa que realice los siguientes pasos:
```

1. Entrada de Datos: El programa debe solicitar al usuario que introduzca dos valores: la base y la altura de un rectángulo.
2. Validación de Datos: Debería haber una validación para asegurar que los valores introducidos son números positivos.
3. Cálculo del Área: Una vez que se han recibido y validado estos dos valores, el programa debe calcular el área del rectángulo utilizando la fórmula:   
                              Área=base×altura 
4. Salida de Datos: Finalmente, el programa debe mostrar el resultado del cálculo al usuario.
```

# Diseño (del Problema)

```
1. Especificación de Entradas
Dos números reales positivos: base y altura del rectángulo.

2. Especificación de Salidas
Un número real positivo: el área del rectángulo.

3. Especificación de Proceso
Solicitar al usuario la base del rectángulo.
Validar que la base sea un número real positivo, si no, solicitar de nuevo.
Solicitar al usuario la altura del rectángulo.
Validar que la altura sea un número real positivo, si no, solicitar de nuevo.
Calcular el área del rectángulo multiplicando base por altura.
Mostrar el resultado al usuario.

```

En pseudocodigo:

```
Inicio
   Escribir "Introduzca la base del rectángulo:"
   Leer base
   Mientras base <= 0
      Escribir "Por favor, introduzca un número positivo para la base:"
      Leer base
      
   Escribir "Introduzca la altura del rectángulo:"
   Leer altura
   Mientras altura <= 0
      Escribir "Por favor, introduzca un número positivo para la altura:"
      Leer altura
   
   área ← base × altura
   
   Escribir "El área del rectángulo es:", área
Fin

```
