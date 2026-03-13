package day8;

public class Printer<T> {
    T data;
    Printer(T data){
        this.data=data;
    }
    void printValue(){
        System.out.println("Data: "+data);
    }
    public static void main(String[] args) {
        Printer<Integer> IntegerPrinter=new Printer<>(1);
        IntegerPrinter.printValue();
        Printer<String> IntegerPrinter1=new Printer<>("Rishab");
        IntegerPrinter1.printValue();
        Printer<Float> IntegerPrinter2=new Printer<>(1.07878f);
        IntegerPrinter2.printValue();

    }
}
