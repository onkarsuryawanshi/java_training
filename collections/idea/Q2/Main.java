package collections.idea.Q2;

import collections.idea.Q2.Model.CustomerDetail;
import collections.idea.Q2.parser.CustomerInputParser;
import collections.idea.Q2.solution.MostDiscountPrice;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //parse input array to list of student
        CustomerInputParser inputParser = new CustomerInputParser();

        List<CustomerDetail> customerList = null;
        String filePath = "/home/onkars/Workspace/intellij/java_training/JavaCollectionsCodingExercise2/collections/idea/Q2/inputFile/input.txt";
        customerList = inputParser.parseCSVFile(filePath);

        MostDiscountPrice mostDiscountPrice = new MostDiscountPrice(customerList);

        //finding the maximum price for each product
        Map<String, Integer> maximumPriceForProduct = mostDiscountPrice.MaximumProductPrice();

        //Unique product List
        Set<String> productSet = mostDiscountPrice.findSetOfGivenProducts();

        //finding maximum discount for each product
        Map<String, Integer> maxDiscount = mostDiscountPrice.maxDiscount(maximumPriceForProduct, productSet);

        //finding the customer name for maximum discounted price
        Map<CustomerDetail, Integer> customerNameAndMaxDiscount = mostDiscountPrice.findCustomerName(maxDiscount, maximumPriceForProduct);


        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<CustomerDetail, Integer> entry : customerNameAndMaxDiscount.entrySet())
            if (entry.getValue() > 0) {
                System.out.println("Customer = " + entry.getKey().getCustomerName() +
                        ", get Maximum Discount = " + entry.getValue() + " , For product = " + entry.getKey().getProductName()) ;
            }
    }
}