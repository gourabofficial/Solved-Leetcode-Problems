public class rec_number {
    public static void main(String[] args) {
        print_num(1);
    }
    static void print_num(int num){
        System.out.println(num);
        if(num == 10){
            return;
        }
        print_num(num + 1);
    }
}
