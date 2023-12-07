import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
/*        int marks;
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the marks: ");
        marks=inp.nextInt();
        switch (marks) {
            case 31:
                System.out.println("fail bro");
                break;//break lagana isliye jaruri hai kyuki sara case ka statement na print ho jaye
            case 45:
                System.out.println("thikthak bro");
                break;
            default:
                System.out.println("bro");
        }*/
        String name;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your bad name bro");
        name=inp.next();
        switch (name){
            case "Joker":
                System.out.println("Acha to hai yaar");
                break;
            case "Baklol":
                System.out.println("Ha ye to ganda hai");
                break;
            case "Pagal":
                System.out.println("Ye to naam hi nahi hai");
                break;
            default:
                System.out.println("mera time waste kara tune");
        }


    }
}
