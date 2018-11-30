public class add {
    public static void main(String[] args) {
        int i = 10;
        int b=54;
        int result;

        String n="+";
        String c="-";
        String d="*";
        String h="/";
        switch(args[0]) {
            case "n":
                result=i+b;
                System.out.println(result);
                break;
            case"c":
                result=i-b;
                System.out.println(result);
                break;
            case"d":
                result=i*b;
                System.out.println(result);
                break;
            case"h":
                result=i/b;
                System.out.println(result);
                break;
                default:
                    System.out.println("your losser");
            }
        }
    }