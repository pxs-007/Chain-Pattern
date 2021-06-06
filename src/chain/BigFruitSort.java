package chain;

public class BigFruitSort extends AbstractFruitSort{
    public BigFruitSort(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("超市"+fruit);
    }
}
