package rhynix.eliud.androidcardview;

/**
 * Created by eliud on 12/5/16.
 */

public class WonderModel {

    String cardName;
    int imageResourceId;
    int isfav;
    int isturned;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getIsturned() {
        return isturned;
    }

    public void setIsturned(int isturned) {
        this.isturned = isturned;
    }

    public int getIsfav() {
        return isfav;
    }

    public void setIsfav(int isfav) {
        this.isfav = isfav;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
