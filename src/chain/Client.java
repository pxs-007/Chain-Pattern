package chain;

import java.util.Random;

public class Client {
    public static void main (String[] args){
        AbstractFruitSort bfs,mfs,sfs;
        bfs=new BigFruitSort(9);
        mfs=new MidFruitSort(5);
        sfs=new SmallFruitSort(2);
        bfs.setNextSort(mfs);
        mfs.setNextSort(sfs);
        Random rm=new Random();
        for(int i=0;i<1000;i++){
            int weight=rm.nextInt(10);
            bfs.sendFruit(weight,"橙子");
        }
        bfs.getFruitBox();
        mfs.getFruitBox();
        sfs.getFruitBox();
    }
}
