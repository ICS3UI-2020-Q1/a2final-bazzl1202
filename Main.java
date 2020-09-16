import java.util.Scanner;
/**
 * Asks the user diameter of pizza, calculates their subtotal, taxes and total and then tells the user a message about the size of their pizza.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user what size they want their pizz
    System.out.println("What is the size of the pizza (in cm):");
    
    // declare and initialize variable for the size of the pizza
    int sizePizza = input.nextInt();

    //declare and initialize constant for pizza labor
    double PIZZA_LABOUR = 0.75;

    //declare and initialize constant for pizza power
    double PIZZA_POWER = 0.99;

    //declare and initialize variable for pizza ingredients
    double pizzaIngredients = (0.50*sizePizza);

    // declare and calculate subtotal
    double subtotal = (PIZZA_LABOUR+PIZZA_POWER+pizzaIngredients);

    // tell the user the subtotal
    System.out.println("Subtotal: $" + subtotal);

    // declare and calculate taxes
    double taxes = (subtotal*0.13);

    // tell the user the taxes
    System.out.println("Taxes: $" + taxes);

    // declare and calculate total 
    double total = (subtotal+taxes);

    // tell the user their total
    System.out.println("Total: $" + total);

    // tells the user a message about their pizz sixe
    if( sizePizza >= 1 && sizePizza <= 20 ){
      System.out.println("We are going to make you a cute little pizza!");
    } else if( sizePizza > 20 && sizePizza <= 40 ){
      System.out.println("This will be delicious!");
    } else if( sizePizza > 40 ){
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }


    
  }
}
