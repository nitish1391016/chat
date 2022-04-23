package LinkedList.ass1;
import java.util.Random;
import java.util.Scanner;

public class ChatBot {
    public static void main(String args[]) {
    	int[] fee= {1200,500,300,320,400,230,320,500,600};
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------WELCOME TO MEDICAL CHATBOT -----------------------");
        System.out.println("Hey there! 👋Good to see you here. I'm Specter - a chatbot for Doctor's lab.");
        System.out.println("please enter your good name:");
        String name = sc.nextLine();
        System.out.println("Hey!! " + name);
        System.out.println("-------------------------------------------------------");
        System.out.println("please select your problem for consulting doctor");
        System.out.println(
                "1.headache\n2.fever\n3.joint pains\n4.breathing problems\n5.heart problem\n6.diabetics\n7.sugar\n8.BP\n9.dental\n10.others");
        int op = sc.nextInt();
        switch (op) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            System.out.println("General practitioners available are-->");
            System.out.println("1.ravi shankar(phd)-12y of exp");
            System.out.println("2.mohammad shakir(rrb)-5y of exp");
            System.out.println("3.imran shabir(general ward)-2y of exp");
            break;
        case 10:
            System.out.println("sorry for  inconvenience😔😔😔😔😔!!! \n you can reach us at....");
            System.out.println("    📞 040-9213483923");
            System.out.println("    ✉ info@pranaamhospitals.in");
            System.out.println("    🌎 www.pranaamhospitals.in");
            System.out.println("    📍Plot No. 40/41");
            System.out.println("      Madinaguda");
            System.out.println("      Hyderabad - 500 050");
            System.out.println("      Andhra Pradesh, India");
            // 
            // Hyderabad - 500 050
            // Andhra Pradesh, India");
        
            break;

        }
        System.out.println("----------------------------------------------------------------");
        Random time=new Random();
        int docop;
        if(op<10) {
        	System.out.println("Please select the doctor");
        	docop=sc.nextInt();
        	System.out.println("Your consultant fee is:"+fee[op-1]);
        	System.out.print("Your doctor available at:");
        	int t=time.nextInt(24);
        	if(t<12 && t>9)
        		System.out.println(" "+t+":00 am");
        	else
        		System.out.println(" "+t+":00 pm");
        }
        System.out.println("--------------Thank You For Choosing Us---------------");
        
    }
}