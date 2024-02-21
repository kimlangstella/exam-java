package Exercise2;

public class Sale {

	private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;
    public Sale(Customer customer, String date){
        this.customer = customer;
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense-serviceExpense*customer.getServiceMemberDiscount();
    }
    public void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    public double getProductExpense(){
        return productExpense-productExpense*customer.getProductMemberDiscount();
    }
    public void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        return getServiceExpense()+getProductExpense();
    }
    public void DisplayInfo(){
        System.out.println("================ Customer Info =================");
        System.out.println("Date(yyyy-mm-dd) : "+getDate());
        System.out.println("CustomerName : "+customer.getCustomerName());
        System.out.println("CustomerType : "+customer.getCustomerType());
        System.out.println("=================== Invoice ====================");
        System.out.println("ServiceExpense : "+serviceExpense);
        System.out.println("discount("+customer.getServiceMemberDiscount()*100+"%) : "+serviceExpense*customer.getServiceMemberDiscount());
        System.out.println("ProductExpense : "+productExpense);
        System.out.println("discount("+customer.getProductMemberDiscount()*100+"%) : "+productExpense*customer.getProductMemberDiscount());
        System.out.println("TotalExpense : "+getTotalExpense());
        System.out.println("================================================\n\n");
    }

}
