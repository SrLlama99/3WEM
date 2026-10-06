horas = 2
minutos = 35
segundos = 48

print(f"a) Total segundos: {(horas * 3600) + (minutos * 60) + segundos}")

segs = 36000
new_horas = segs//3600
new_mins = (segs//60) - (new_horas * 60)
new_segs = (segs - (new_horas * 3600) - (new_mins * 60))

print(f"b) Horas, minutos y segundos: {new_horas} horas, {new_mins} minutos y {new_segs} segundos")