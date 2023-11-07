class DemoSwitch2 {
    public static void main(String[] args) {
        int a = 2, b;
        switch (a) {
            case 1:
                b = a + 1;
                break;
            case 2:
                b = a + 2;
                break;
            case 3:
                b = a + 3;
                break;
            case 4:
                b = a + 4;
                break;
            case 5:
                b = a + 5;
                break;
            default:
                b = 0;
                break;
        }
        System.out.println("Nilai b: " + b);
    }
}
