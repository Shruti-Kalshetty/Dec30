
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        System.out.println("welcome to addrrss book");
        System.out.println("Choose your opeartion form list ");
        while(true)
        {
            System.out.println("1)add new contact \n 2) display contact \n3) delete contact \n4) edit contact \n5)exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    addressBook.createContact();
                }
                case 2 ->{
                    addressBook.display();
                }
                case 3 -> {
                    addressBook.delete();
                }
                case 4 ->{
                    addressBook.edit();
                }
                case 5 ->{
                    System.exit(0);
                }
            }
        }
    }
}