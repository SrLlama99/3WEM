numero = 5837

print(f"{numero // 1000}")
print(f"{(numero % 1000) // 100}")
print(f"{(numero % 100) // 10}")
print(f"{numero % 10}")

print(f"b) {(numero // 1000) + ((numero % 1000) // 100) + ((numero % 100) // 10) + (numero % 10)}")