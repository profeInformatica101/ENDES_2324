print("Introduzca la base del rectángulo:")
base = float(input())
while base <= 0:
    print("Por favor, introduzca un número positivo para la base:")
    base = float(input())

print("Introduzca la altura del rectángulo:")
altura = float(input())
while altura <= 0:
    print("Por favor, introduzca un número positivo para la altura:")
    altura = float(input())

area = base * altura
print("El área del rectángulo es:", area)
