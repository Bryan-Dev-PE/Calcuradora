n1= float(input("Ingrese el primer numero: "))
n2= float(input("Ingrese el segundo numero: "))

suma= n1+n2
resta= n1-n2
multiplicacion= n1*n2
division= n1/n2

operacion= input("\n Ingrese la operación que desea realizar: \n suma \n resta \n multiplicacion \n division \nOperación: ")
if operacion == "suma" or operacion == "Suma":
    print("El resultado de la suma es: ", suma)
elif operacion == "resta" or operacion == "Resta":
    print("El resultado de la resta es: ", resta)
elif operacion == "multiplicacion" or operacion == "Multiplicacion":
    print("El resultado de la multiplicación es: ", multiplicacion)
elif operacion == "division" or operacion == "Division":
    print("El resultado de la división es: ", division)
else:
    print("Operación no válida")