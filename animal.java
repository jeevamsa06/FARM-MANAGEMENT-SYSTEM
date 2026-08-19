import java.util.Scanner;
public class animal {
    public void menu(){
        Scanner sc=new Scanner(System.in);
        //String choice="add", "view", "search", "update", "delete";
        System.out.print("Enter the number of space in your farm:");
        int n=sc.nextInt();
        String animal[]=new String[n];
        int count=0;
        do{
        System.out.println("Enter your choice: add, view, search, update, delete,exit");
        String user=sc.nextLine();
         boolean found=false;
        switch(user){
            case "add":
                System.out.println("How many animal are need to be add:");
                int no_of_animal=sc.nextInt();
                sc.nextLine();
                int start = count;

                if (count + no_of_animal > animal.length) {
                System.out.println("No space available in the farm.");
                break;}

                for(int i = start; i < start + no_of_animal; i++){
                System.out.print("Enter the animal name: ");
                animal[i]=sc.nextLine();
                }
                count += no_of_animal;
                System.out.println("The animal in your farm are:");
                for(String animals:animal){
                    if(animals!=null)
                    System.out.println(animals+" ");
                }
                break;
             case "view":
               if (count == 0) {
                System.out.println("No animals in the farm.");
                break;
                    }

                  System.out.println("Animals in the farm:");

                for (int i = 0; i < count; i++) {
                System.out.println(animal[i]);
                        }
                break;
            case "search":
                System.out.print("Searching animal:");
                String search=sc.nextLine();
               
                for(String animalname:animal){
                    if(animalname!=null&&animalname.equals(search)){
                        System.out.println("The animal is in our farm"+animalname);
                        found=true;
                        break;
                    }
                     }
                if(!found){
                    System.out.println("The animal is not in our farm");
                }
                break;
            
            case "update":
                  System.out.print("Enter the animal you want to replace: ");
                  String name=sc.nextLine();
                  
                  for(int i=0;i<animal.length;i++){
                      if(animal[i]!=null&&animal[i].equals(name)){
                          found=true;
                          System.out.print("Enter the new animal name: ");
                          String newName=sc.nextLine();
                          animal[i]=newName;
                          System.out.println("Animal name updated successfully.");
                          System.out.println("The updated animal list in your farm are:");
                          for(String animals:animal){      
                              if(animals!=null)
                              System.out.println(animals+" ");
                            
                          }
                          break;
                    }
                  }
                  if(!found){
                      System.out.println("The animal is not in our farm");
                  }
                  break;
            case "delete":
                System.out.print("Enter animal name you want to delete:");
                String names=sc.nextLine();
                for(int i=0;i<animal.length;i++){
                    if(animal[i]!=null&&animal[i].equals(names)){
                        found=true;
                        System.out.println("The animal is deleted from our farm"+animal[i]);
                        
                        for(int j=i;j<count-1;j++){
                            animal[j]=animal[j+1];
                        }
                        count--;
                        animal[count]=null;
                        System.out.println("The updated animal list in your farm are:");
                        for(String animals:animal){
                            if(animals!=null)
                            System.out.println(animals+" ");
                        }
                    }
                }
                if(!found){
                    System.out.println("The animal is not in our farm");
                }
                break;
            case "exit":
                  sc.close();
                System.exit(0); 
               

       }}
        while(true);

    
}

}
