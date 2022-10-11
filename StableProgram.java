

import java.util.Scanner;


class main {
  public static void main(String[]args){

   // Horses Horsess = new Horses();
    Stable Stabble = new Stable();
    Scanner in = new Scanner(System.in);

      System.out.println("What is the address of the stable?");
        Stabble.address = in.nextLine();
    
    do{
      System.out.println("Do you wish to add a horse to the stable?");
        Stabble.input = in.next().charAt(0);

    if(Stabble.input == 'y'){
        
      System.out.println("What is the name of the horse?");
          //Horsess.name = in.nextLine();
          String name = in.nextLine();
      
      System.out.println();
      
        System.out.println("What is the weight of your horse?");
          //Horsess.weight = in.nextDouble();
          Double weight = in.nextDouble();
      
        System.out.println("Enter true if the horse is tame or false if it is not.");
         // Horsess.tame = in.nextBoolean();
          boolean tame = in.nextBoolean();

      Horses h = new Horses (name, weight, tame);
   
      Stabble.HorsesInfo.add(h);
      
    }
      else {
        break;
      }
    } while(true);
     for (int i = 0; i < Stabble.HorsesInfo.size(); i++){

      System.out.println(Stabble.HorsesInfo.get(1));
    }
  }
  
}

 