import java.util.Scanner;

public class Game {
    public  Weapon  selectWeapon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");
        int score = sc.nextInt();
        if(score<=400){
            System.out.println("You got knife");
            Knife k = new Knife();
            return k;

        }
        
        else if(score<=800){
            System.err.println("Press 1 for knife and Press 2 for Gun"); 
            int choice = sc.nextInt();
            if (choice==1) {
                System.out.println("You got knife");
            Knife k = new Knife();
            return k;
            }
            else if(choice==2){
                System.out.println("You got Gun");
                Gun g = new Gun();
                return g;
            }
            else{
                System.out.println("Not a vaild choice");
                return selectWeapon();
            }
        }
        else{
            System.err.println("Press 1 for knife and Press 2 for Gun and 3 for Bomb"); 
            int choice = sc.nextInt();
            if (choice==1) {
                System.out.println("You got knife");
            Knife k = new Knife();
            return k;
            }
            else if(choice==2){
                System.out.println("You got Gun");
                Gun g = new Gun();
                return g;
            }
            else if(choice==3){
            System.out.println("You got Bomb");
            Bomb b = new Bomb();
            return b;
            }
            else{
                System.out.println("Not a vaild choice");
                return selectWeapon();
        }
    }

    }
}
