class Test1 { // definicja klasy, PascalCase, klasy to rzeczowniki a, metdoy to czasowniki

    public static int sum(int a, int b) { // definicja metody, camelCase, ona sumuje
        int result = a + b;
        return result;
    }

    public static int substract(int a, int b) { 
        int result = a - b;
        return result;
    }

    public static float divide(int a, int b) { 
        float result = (float) a / b;
        return result;
    }

    public static void main(String args[]) {
        int a = 22;
        int b = 7;
        int c = sum(a, b); // to jest to samo co int c = Test1.sum(a, b), ale w obrebie tej samej klasy nie musisz pisac nazwy klasy, jak wywolujesz metode statyczna
        System.out.println(c);

        int d = substract(a, b); // to jest to samo co int c = Test1.sum(a, b), ale w obrebie tej samej klasy nie musisz pisac nazwy klasy, jak wywolujesz metode statyczna
        System.out.println(d);

        float e = divide(a, b); // to jest to samo co int c = Test1.sum(a, b), ale w obrebie tej samej klasy nie musisz pisac nazwy klasy, jak wywolujesz metode statyczna
        System.out.println(e);
    }
}

// kompilowanie: otworz konsole (terminal), javac test1.java, java Test1
