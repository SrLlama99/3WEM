producto = "Teclado"
precio = 45.90
unidades = 3
descuento = 10
iva = 21

subtotal = precio * unidades
importe_descuento = subtotal * descuento/100
base_imponible = subtotal - importe_descuento
importe_iva = base_imponible * (iva/100)
total = precio + importe_iva - importe_descuento

print(f"Producto: {producto}")
print(f"Unidades: {unidades}")
print(f"Precio unitario: {precio}€")
print(f"Subtotal: {subtotal:.2f}€")
print(f"Descuento: {importe_descuento:.2f}€")
print(f"Base imponible: {base_imponible:.2f}€")
print(f"IVA: {importe_iva:.2f}€")
print(f"TOTAL: {total:.2f}€")
