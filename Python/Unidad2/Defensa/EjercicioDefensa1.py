fallo = 0
adivinado = False
palabra = input("Introduce la palabra secreta: \n")
palabra = palabra.upper()
longitud = len(palabra)
palabraHash = "_" * longitud

letrasUsadas = ""

while adivinado is False:
    print("La palabra secreta es: " + palabraHash)
    print("Letras usadas: " + letrasUsadas)
    letra = input("Introduce la letra a comprobar: ")
    letra = letra.upper()
    letrasUsadas += letra + ","

    if letra not in palabra or letra in palabraHash:
        fallo += 1
        match fallo:
            case 1:
                muñeco = """O"""
            case 2:
                muñeco = """O
                            |"""
            case 3:
                muñeco = """                        O
                           -|"""
            case 4:
                muñeco = """O
                           -|-"""
            case 5:
                muñeco = """O
                           -|-
                           /"""
            case 6:
                muñeco ="""O
                           -|-
                           /\ """
            case _:
                muñeco = ""

        print(muñeco)
    else:
        for i in range(longitud):
            if palabra[i] == letra:
                palabraHash = palabraHash[:i] + letra + palabraHash[i+1:]  

    if palabraHash == palabra:
        adivinado = True
        print("Has ganado :) !!!!")

    if fallo >= 6:
        print("Te han ahoracado :(.  La palabra era " + palabra)
        break