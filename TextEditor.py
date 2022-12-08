import os

while(True):
    print('Hello in my project, a text editor written in PYTHON')
    print('What you want to do?')
    print('1. Open a text file')
    print('2. Edit a text file')
    print('3. Delete a text file')
    print('4. Open the file and save the text in it')
    menu = input('Enter 1, 2, 3 or 4')
    menu_1 = int(menu)
    if menu_1 == 1:
        print('Enter the path to the file you want to open, Example: C:\\python_test.txt')
        path = input('Enter the path to the file you want to read')
        try:
            f = open(path, "r")
            content = f.read()
            print(content)
        except FileNotFoundError:
            print("Something went wrong, possibly the file does not exist")
        except NameError:
            print('Something went wrong')
        finally:
            f.close()
    if menu_1 == 2:
        print('Enter the path to the file you want to edit, Example: C:\\python_test.txt')
        path = input('Enter the path to the file you want to edit')
        f = open(path, "w")
        txt_for_edit = input("Enter the contents of the text file")
        f.write(txt_for_edit)
        f.close()
        print("Now file looks like this:")
        print('  ')
        f = open(path, "r")
        print(f.read())
    if menu_1 == 3:
        path_to_delete = input('Enter the path to the file you want to delete, Example: C:\\python_test.txt')
        os.remove(path_to_delete)
        print('You delete file!')
    if menu_1 == 4:
        print('Remember if the file with the given name and extension already exists, it will be overwritten!')
        directory = input('Enter the path to the folder where the file is to be located and after last slash name of files (creates the file if it does not exist) dont forget about .* (!), (for example: "C:\\programing" use two times \, because python cant see double slash)')
        directory_str = str(directory)
        content = input('Enter the text you want in the file')
        try:
            f = open(directory_str, "w")
            f.write(content)
        finally:
            f.close()
    else:
        print('Enter the correct value')