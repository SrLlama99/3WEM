# Variables necesarias para funcionamiento
fallo = 0
intentos = 0
adivinado = False
palabra = input("Introduce la palabra secreta: \n")
palabra = palabra.upper()
longitud = len(palabra)
palabraHash = "_" * longitud
abecedario = "ABCDEFGFHIJKLMNÑOPQRSTUVWXYZ"
tildes = "ÁÉÍÓÚ"
sinTilde = "AEIOU"
letrasUsadas = ""

# Depurar la palabra para que no tenga tildes (utilizo j porque lo creo despues de tener ya creado i)
for j in range(longitud):
    for k in range(len(tildes)):
        if palabra[j] in tildes[k]:
            palabra = palabra[:j] + sinTilde[k] + palabra[j+1:]
        
# LÓGICA
while adivinado is False:
    print("La palabra secreta es: " + palabraHash)
    print("Letras usadas: " + letrasUsadas)
    letra = input("Introduce la letra (SOLO UNA!!!) a comprobar: ")
    letra = letra.upper()
    if len(letra) == 1:
        letrasUsadas += letra + ","
        if letra not in palabra or letra in palabraHash:
            fallo += 1
            intentos += 1
            match fallo:
                case 1:
                    muñeco = """O"""
                case 2:
                    muñeco = """                            O
                                |"""
                case 3:
                    muñeco = """                            O
                            -|"""
                case 4:
                    muñeco = """                            O
                            -|-"""
                case 5:
                    muñeco = """                            O
                            -|-
                            /"""
                case 6:
                    muñeco ="""                            O
                            -|-
                            /\ """
                case _:
                    muñeco = ""

            print(muñeco)
        else:
            for i in range(longitud):
                if palabra[i] == letra:
                    palabraHash = palabraHash[:i] + letra + palabraHash[i+1:]
                    intentos += 1
    else:
        fallo += 1
        intentos += 1
        match fallo:
            case 1:
                muñeco = """O"""
            case 2:
                muñeco = """                            O
                            |"""
            case 3:
                muñeco = """                            O
                        -|"""
            case 4:
                muñeco = """                            O
                        -|-"""
            case 5:
                muñeco = """                            O
                        -|-
                        /"""
            case 6:
                muñeco ="""                            O
                        -|-
                        /\ """
            case _:
                muñeco = ""

        print(muñeco)  

    if palabraHash == palabra:
        adivinado = True
        print("Has ganado, la palabra era" + palabra + ":) !!!! Has necesitado " + str(intentos) + " intentos")

    if fallo >= 6:
        print("Te han ahoracado :(.  La palabra era " + palabra)
        break