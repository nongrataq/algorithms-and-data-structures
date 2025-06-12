package patterns.structural.adapter.another_example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CardReader implements USB {
    private final MemoryCard card;

    @Override
    public void connectWithUSB() {
        this.card.insert();
        this.card.copyData();
    }
}
