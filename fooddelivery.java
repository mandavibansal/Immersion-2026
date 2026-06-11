public class fooddelivery{
    class FoodItem{
        int itemID;
        String itemName;
        double price;
        int quantity;

        FoodItem(int itemID,String itemName,double price,int quantity){
            this.itemID=itemID;
            this.itemName=itemName;
            this.price=price;
            this.quantity=quantity;
        }
        double calculateAmount() {
            return price*quantity;
        }
        void displayItemDetails(){
            System.out.println("Item ID: "+itemID);
            System.out.println("Item Name: "+ itemName);
            System.out.println("Price: "+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Amount: "+calculateAmount());
        }
    }

    class Customer{
        int customerID;
        String customerName;
        int mobileNumber;


        Customer(int customerID,String customerName,int mobileNumber){
            this.customerID=customerID;
            this.customerName=customerName;
            this.mobileNumber =mobileNumber;
        }
    }
}