import util.Input;
import java.util.*;

public class GroceryListApplication {
    static Input inputter = new Input();
    static HashMap<String, HashMap> groceryList = new HashMap<>();

    /*
    * Create a grocery list command line application. You will use your input class from previous exercises.
    * A user should be prompted if they would like to create a grocery list.
    *
    * If they pick yes, they will be prompted if they would like to enter a new item.
    * they should be given the following three prompts:
    *    Given an ordered list of grocery categories to choose from, select the category
    *    Enter name of the item
    *    Enter how many
    *
    * The user will then be given the choice to finalize the list or add an additional item.
    *
    * Once the user finalizes the list, they will be presented with a complete list
    * organized alphabetically and grouped by category, and including quantity.
    *
    * For an extra bonus, allow users to filter the results by only one category of items at a time
    *
    * For a super gold star bonus, allow users to edit the list items
    *
    * Consider before coding how the data should be organized. Using ArrayLists and HashMaps will be helpful.
    * */

    public static void main(String[] args) {
        //initialize grocery list with categories + arraylist for items
        //    Beverages – coffee/tea, juice, soda
        //    Bread/Bakery – sandwich loaves, dinner rolls, tortillas, bagels
        //    Canned/Jarred Goods – vegetables, spaghetti sauce, ketchup
        //    Dairy – cheeses, eggs, milk, yogurt, butter
        //    Dry/Baking Goods – cereals, flour, sugar, pasta, mixes
        //    Frozen Foods – waffles, vegetables, individual meals, ice cream
        //    Meat – lunch meat, poultry, beef, pork
        //    Produce – fruits, vegetables
        //    Cleaners – all- purpose, laundry detergent, dishwashing liquid/detergent
        //    Paper Goods – paper towels, toilet paper, aluminum foil, sandwich bags
        //    Personal Care – shampoo, soap, hand soap, shaving cream
        //    Other – baby items, pet items, batteries, greeting cards

        groceryList.put("Beverages", new HashMap<String, Integer>());
        groceryList.put("Bread", new HashMap<String, Integer>());
        groceryList.put("Canned/Jarred Goods", new HashMap<String, Integer>());
        groceryList.put("Dairy", new HashMap<String, Integer>());
        groceryList.put("Dry/Baking Goods", new HashMap<String, Integer>());
        groceryList.put("Frozen Food", new HashMap<String, Integer>());
        groceryList.put("Meat", new HashMap<String, Integer>());
        groceryList.put("Produce", new HashMap<String, Integer>());
        groceryList.put("Cleaners", new HashMap<String, Integer>());
        groceryList.put("Paper Goods", new HashMap<String, Integer>());
        groceryList.put("Personal Care", new HashMap<String, Integer>());
        groceryList.put("Other", new HashMap<String, Integer>());

        HashSet<String> categories = new HashSet<>(groceryList.keySet());
        System.out.println("Welcome to the Grocery List Application!");
        while(Input.yesNo("Would you like to create a new list? (y/n)")){
            while(Input.yesNo("Would you like to add an item? (y/n)")) {
                printCategories(categories);
                String category = Input.getValidString(new ArrayList<String>(categories),
                        "What category is the item in?", "Category not found");
                String item = Input.getString("What's the item?");
                int quantity = Input.getInt("How many do you need?");
                groceryList.get(category).put(item, quantity);
            }
            printGroceryList();
        }
    }

    public static void printCategories(Set<String> categories) {
        System.out.println("Grocery Categories:");
        int count = 0;
        for(String category : categories) {
            System.out.print("|" + category + "|   ");
            count++;
            if (count == 5)
                System.out.println();
        }
        System.out.println();
    }

    public static void printGroceryList() {
        List categoriesList = new ArrayList<String>(groceryList.keySet());
        Collections.sort(categoriesList);
        System.out.println("Grocery List:");
        for(Object category : categoriesList) {
            if (category.equals("Other")) continue;
            System.out.println("\t*" + category + ":");
            for(Object item : groceryList.get(category).keySet()) {
                System.out.println("\t\t" + item + " - " + groceryList.get(category).get(item));
            }
        }
        System.out.println("\t*" + "Other" + ":");
        for(Object item : groceryList.get("Other").keySet()) {
            System.out.println("\t\t" + item + " - " + groceryList.get("Other").get(item));
        }
    }

}
