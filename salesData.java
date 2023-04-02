import java.util.ArrayList;
import java.util.List;
public class salesData{
    public static void main(String[] args) {
        List<Product> salesin2021=new ArrayList<>();
        salesin2021.add(new Product("tea",100.0));
        salesin2021.add(new Product("coffee",100.0));
        salesin2021.add(new Product(" greentea",75.0));

        List<Product> salesin2022=new ArrayList<>();
        salesin2022.add(new Product("tea",120.0));
        salesin2022.add(new Product("coffee",110.0));
        salesin2022.add(new Product(" greentea",100.0));
         //calculate mean
        double mean2021=calculateMean(salesin2021);
        double mean2022=calculateMean(salesin2022);
       //calculate variance
             double variance2021=calculateVariance(salesin2021,mean2021);
             double variance2022=calculateVariance(salesin2022,mean2022);
         //calculate variance percentage
       double variancePercentage =(variance2022-variance2021)/(variance2021)*100;
    //printing the results
          System.out.printf("%.2f\n",variance2021);
            System.out.printf("%.2f\n",variance2022);
            System.out.printf("%.2f%%",variancePercentage);
    }
    //helper method to calculate mean
        public static double calculateMean(List<Product> data) {
        double sum=0;
             for(int i=0;i<data.size();i++){
                 sum+=data.get(i).getValue();
             }
             return  sum/data.size();
    }
     //helper method to calculate variance  
     public static double calculateVariance(List<Product> variance, double mean){
             double var=0;
        for(int i=0;i<variance.size();i++){
            var+=Math.pow((variance.get(i).getValue()-mean),2);
       }
     return var/(variance.size()-1);
}
}   
class Product{
  private  String productname;
   private  double price;
    Product(String productname,double price){
        this.productname=productname;
        this.price=price;
       }   
 

 public double getValue() {
        return price;
    }
    public String getProduct(){
        return productname;
    }
}