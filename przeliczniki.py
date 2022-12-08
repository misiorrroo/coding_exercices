print('Siema to program, kóry przelicza rzeczy, powiedz co chcesz zrobić')
print('Wpisz liczbę, którą chcesz przelczyc liczbe na inny system')
try:
    liczba = input('Podaj liczbę ')
    liczba2 = int(liczba)
    print(f'Ta liczba w kodzie dwójkowym to: {liczba2:b}')
    print(f'Ta liczba w kodzie ósemkowym to: {liczba2:o}')
    print(f'Ta liczba w kodzie szesnastkowym to: {liczba2:X}')
except ValueError:
    print('Podaj liczbe')