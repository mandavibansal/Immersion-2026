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
            System.out.println("----------------------------");
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
        void displayCustomerDeatils(){
            System.out.println("Customer ID: "+customerID);
            System.out.println("Customer Name: "+ customerName);
            System.out.println("Mobile Number: "+mobileNumber);
            System.out.println("----------------------------");
        }
    }
    public class OnlineFoodDeliverySystem{
        public static void main(String[] args){
            FoodItem item1=new FoodItem(101,"Burger",120,2);
            FoodItem item2= new FoodItem(102,"Pizza",300,1);
            FoodItem item3=new FoodItem(103,"Pasta",180,2);
            FoodItem item4 =new FoodItem(104,"Cold drink",50,3);

            Customer customer1=new Customer(1,"Rahul Sharma","9876543210");
            Customer customer2 =new Customer(2,"Priya Singh","9876543211");

            customer1.displayCustomerDetails();
            FoodItem[] order1={item1,item2,item3,item4};

            double totalBill =0;

            System.out.println("Order Summary");
            System.out.println("==========================");

            for(FoodItem item:items){
                item.displayItemDetails();
                totalBill+= item.calculateAmount();
            }
            System.out.println("Total Bill: "+totalBill);
        }
    }
}
