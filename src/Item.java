import java.math.BigDecimal;
import java.math.BigInteger;

public class Item {
    private String itemName;
    private BigDecimal itemValue;
    private String itemCategory;
    private BigDecimal barCode;
    private BigDecimal VAT;
    private BigDecimal discount;

    public Item(String itemName, BigDecimal itemValue, String itemCategory, BigDecimal barCode, BigDecimal VAT, BigDecimal discount) {
        this.itemName = itemName;
        this.itemValue = itemValue;
        this.itemCategory = itemCategory;
        this.barCode = barCode;
        this.VAT = VAT;
        this.discount = discount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemValue() {
        return itemValue;
    }

    public void setItemValue(BigDecimal itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public BigDecimal getBarCode() {
        return barCode;
    }

    public void setBarCode(BigDecimal barCode) {
        this.barCode = barCode;
    }

    public BigDecimal getVAT() {
        return VAT;
    }

    public void setVAT(BigDecimal VAT) {
        this.VAT = VAT;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

//note to self. maybe contain allergies?
}
