public class Main {
    public static void main(String[] args) {
        int j = 7;
        for(int i = 1; i<=9; i+=2){
            System.out.println("I="+i+" J="+j--);
            System.out.println("I="+i+" J="+j--);
            System.out.println("I="+i+" J="+j--);
            j = j + 5;
        }
    }
}
