package acadamy.everyonecodes.java.part2;

import java.util.ArrayList;
import java.util.List;

public class WifiCardHolder {
private List<WifiCard> cards;

public WifiCardHolder() {
    cards = new ArrayList<>();
    cards.add(new WifiCard5GHz());
    cards.add(new WifiCard2_4GHz());
}

public String receiveMessage(Data message) {
    for (WifiCard card : cards) {
        if (card.getFrequency() == message.getFrequency()) {
            return message.getContent();
        }
    }
    return null;
}
}