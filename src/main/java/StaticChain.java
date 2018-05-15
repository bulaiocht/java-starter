
public class StaticChain {

    public static void main(String[] args) {

        final int result = Chain.initiateData(10, 15)
                                .chainLink()
                                .chainLink()
                                .chainLink()
                                .chainLink()
                                .endChain();

        System.out.println(result);

    }
}

class Chain{

    private static int firstNumber;

    private static int secondNumber;

    private static int result;

    private final static Chain INSTANCE = new Chain();

    private Chain(){
        System.out.println("=I am the first link=");
    }

    static Chain initiateData(int first, int second){
        firstNumber = first;
        secondNumber = second;
        return INSTANCE;
    }

    static Chain chainLink(){
        System.out.println("=I'm a chain link=");
        result += firstNumber*secondNumber;
        return INSTANCE;
    }

    static int endChain(){
        System.out.println("=I am the last link=");
        return result;
    }

}