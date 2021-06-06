package chain;

public class MidFruitSort extends AbstractFruitSort{
    public MidFruitSort(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("水果罐头"+fruit);
    }
}
