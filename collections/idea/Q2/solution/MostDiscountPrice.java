package collections.idea.Q2.solution;

import collections.idea.Q2.Model.CustomerDetail;

import java.util.*;

public class MostDiscountPrice {
    private List<CustomerDetail> customerList;

    public MostDiscountPrice(List<CustomerDetail> customerList) {
        this.customerList = customerList;
    }
    public Map<String, Integer> MaximumProductPrice() {
        Map<String, Integer> maximumPriceForProduct = new HashMap<>();

        for (int i = 0; i < customerList.size(); i++) {
            if (maximumPriceForProduct.get(0) == null) {
                maximumPriceForProduct.put(customerList.get(i).getProductName(), customerList.get(i).getPrice());
            }
        }
        for (CustomerDetail customer : customerList) {
            if (customer.getPrice() > maximumPriceForProduct.get(customer.getProductName())) {
                maximumPriceForProduct.put(customer.getProductName(), customer.getPrice());
            }
        }
        return maximumPriceForProduct;
    }

    public Set<String>  findSetOfGivenProducts(){
        Set<String> productSet = new HashSet<>();
        for (CustomerDetail c : customerList) {
            productSet.add(c.getProductName());
        }
        return productSet;
    }
    public Map<String, Integer> maxDiscount(Map<String, Integer> maximumPriceForProduct,Set<String> productSet) {
        Map<String, Integer> maxDiscount = new HashMap<>();
        for (String product : productSet) {
            int maxDiscoutCurrentProduct = 0;
            for (CustomerDetail customerDetail : customerList) {
                if (product.equals(customerDetail.getProductName())) {
                    int currentDiscount = maximumPriceForProduct.get(product) - customerDetail.getPrice();
                    if (currentDiscount > maxDiscoutCurrentProduct) {
                        maxDiscoutCurrentProduct = currentDiscount;
                    }
                }
            }
            maxDiscount.put(product, maxDiscoutCurrentProduct);
        }
        return maxDiscount;
    }
    public Map<CustomerDetail, Integer> findCustomerName(Map<String, Integer> maxDiscount, Map<String, Integer> maximumPriceForProduct) {
        Map<CustomerDetail, Integer> customerNameAndMaxDiscount  = new HashMap<>();
        for (CustomerDetail customerDetail:customerList) {
            if (maxDiscount.get(customerDetail.getProductName()) == maximumPriceForProduct.get(customerDetail.getProductName())-customerDetail.getPrice()){
                customerNameAndMaxDiscount.put(customerDetail,maxDiscount.get(customerDetail.getProductName()));
            }
        }
        return customerNameAndMaxDiscount;
    }
}
