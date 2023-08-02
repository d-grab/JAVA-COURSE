import java.time.LocalDate;

class Main {
    public static void main(String[] args) {  
  //initialising object User 
      
      

    //   User user = new User("Daniel Grabinski","1994-09-20");

      Book Father = new Book("Rich Father","Robert Kiosaki", 270);  
      AudioBook sleep = new AudioBook("Earn when You sleep", "Sleeper",30000);
      Ebook richer = new Ebook("Getting reach", "Adam Browley", 280, "pdf");

      System.out.println(Father.toString());
      System.out.println(sleep.toString());
      System.out.println(richer.toString());
    // System.out.printf("%s was born in %s and is %d years old \n",user.getName(),user.getBirthDate(),user.age());
    // System.out.printf("%s Has borrowed these books: %s",user.getName(), user.borrowedBooks());
  

        
    }}