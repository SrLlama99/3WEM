precio = 125.50
descuento = 15
iva = 21

importe = precio * (descuento/100)
calculoIVA = precio * (iva/100)

print(f"El importe del descuento: {importe:.2f}")
print(f"El precio después del descuento: {(precio - importe):.2f}")
print(f"El IVA es: {calculoIVA:.2f}")
print(f"El precio final: {(precio + calculoIVA - importe):.2f}")