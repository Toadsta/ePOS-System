import java.math.BigDecimal;
import java.math.MathContext;
import java.time.*;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Order {
    private ArrayList<Item> itemsInOrder;
    private String orderStatus;
    private String dateAndTime;
    private String paymentMethod;
    private Integer discount;
    private BigDecimal orderTotal;

    public void addItemToList (Item item){
        itemsInOrder.add(item);
        orderTotal = orderTotal.add(item.getItemValue(),new MathContext(2));
    }

    public void removeItemFromList (Item item){
        itemsInOrder.remove(item);
        orderTotal = orderTotal.subtract(item.getItemValue(),new MathContext(2));
    }

    public Order(ArrayList<Item> itemsInOrder, String orderStatus, String dateAndTime, String paymentMethod, Integer discount, BigDecimal orderTotal) {
        this.itemsInOrder = itemsInOrder;
        this.orderStatus = orderStatus;
        this.dateAndTime = dateAndTime;
        this.paymentMethod = paymentMethod;
        this.discount = discount;
        this.orderTotal = orderTotal;
    }

    public ArrayList<Item> getItemsInOrder() {
        return itemsInOrder;
    }

    public void setItemsInOrder(ArrayList<Item> itemsInOrder) {
        this.itemsInOrder = itemsInOrder;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }
}
