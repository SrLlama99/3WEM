duracion = 9374

horas = duracion // 3600
minutos = (duracion//60) - (horas * 60)
segundos = (duracion - (horas * 3600) - (minutos * 60))

print(f"a) {horas} horas, {minutos} minutos y {segundos} segundos")

hora_inicio = 22
minutos_inicio = 45
segundos_inicio = 30

segundos_total = ((hora_inicio * 3600) + (minutos_inicio * 60) + segundos_inicio + duracion) % (24*3600)
hora_fin = (segundos_total // 3600)
minutos_fin = (segundos_total//60) - ((hora_fin) * 60)
segundos_fin = (segundos_total - ((hora_fin) * 3600) - (minutos_fin * 60))

print(f"b) {hora_fin}:{minutos_fin}:{segundos_fin}")