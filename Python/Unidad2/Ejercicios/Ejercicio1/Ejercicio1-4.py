salario = float(input("Introduzca su salario: \n"))

if salario < 12450:
    print(f"El IRPF es: {salario * 0.19}€")
elif salario > 20200:
    print(f"El IRPF es: {salario * 0.24}€")
elif salario > 35200:
    print(f"El IRPF es: {salario * 0.30}€")    
elif salario > 60000:
    print(f"El IRPF es: {salario * 0.37}€")
elif salario > 300000:
    print(f"El IRPF es: {salario * 0.45}€")
else:
    print(f"El IRPF es: {salario * 0.47}€")