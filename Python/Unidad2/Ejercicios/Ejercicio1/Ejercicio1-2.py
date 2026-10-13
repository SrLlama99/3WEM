nota = float(input("Introduzca la nota:\n"))

if nota < 5:
    print(f"La nota {nota} es SUSPENSO")
elif nota <= 5:
    print(f"La nota {nota} es SUFICIENTE")
elif nota <= 6:
    print(f"La nota {nota} es BIEN")
elif nota <= 7:
    print(f"La nota {nota} es NOTABLE")
elif nota <= 10:
    print(f"La nota {nota} es SOBRESALIENTE")
else:
    print(f"NOTA NO VALIDA")