package classwork.day6;

public class PrintColorRunner {

    public static void main(String[] args) {
        PrintColorRunner constant = new PrintColorRunner();
        constant.printColor("black");
    }

    public void printColor(String color){

        switch(color){
            case ConstantContainer.RED:
                System.out.println(ConstantContainer.RED);
                break;
            case ConstantContainer.BLUE:
                System.out.println(ConstantContainer.BLUE);
                break;
            case ConstantContainer.GREEN:
                System.out.println(ConstantContainer.GREEN);
                break;
            case ConstantContainer.YELLOW:
                System.out.println(ConstantContainer.YELLOW);
                break;
            case ConstantContainer.PURPLE:
                System.out.println(ConstantContainer.PURPLE);
                break;
            default:
                System.out.println("Нет такого цвета");
        }

    }

}
