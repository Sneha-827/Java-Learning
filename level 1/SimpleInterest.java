public class SimpleInterest {
    public static void main(String[] args){
        double principle = 10000;
        double rate = 5;
        double time = 2;

        double si = (principle * time * rate) /100;
        System.out.println(si);
    }
}
