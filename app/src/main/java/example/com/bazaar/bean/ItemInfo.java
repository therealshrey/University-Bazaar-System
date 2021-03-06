package example.com.bazaar.bean;

/**
 * Created by TheRealShrey on 11/28/16.
 */

public class ItemInfo {
    private String itemDescription;
    private String itemDes;
    private String itemQuantity;
    private String itemPrice;
    private String sellType;
    private String sellItem_imageURL;
    private String userName;


    public ItemInfo(String itemDescription, String itemQuantity, String itemDes, String itemPrice, String sellType, String sellItem_imageURL, String userName) {
        this.itemDescription = itemDescription;
        this.itemDes = itemDes;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
        this.sellType = sellType;
        this.sellItem_imageURL = sellItem_imageURL;
        this.userName = userName;
    }

    public ItemInfo()

    {

    }

    public String getUserName() {
        return userName;
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }


    public String getSellItem_imageURL() {
        return sellItem_imageURL;
    }

    public void setSellItem_imageURL(String sellItem_imageURL) {
        this.sellItem_imageURL = sellItem_imageURL;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getSellType() {
        return sellType;
    }

    public void setSellType(String sellType) {
        this.sellType = sellType;
    }
}
