package io.zipcoder;


import java.util.Arrays;
import java.util.Collections;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        while(stringIterator.hasNext()){
            String next = stringIterator.next();
            Integer[] array = new Integer[9999];
            for (int i = 0; i < array.length; i++){
                array[i] = (int) (Math.random() * ((600000 - 1) + 1));
            }

            try{
                Thread.sleep((int) (Math.random() * ((100 - 1) + 1)));
            }catch(InterruptedException ex){

            }
            Arrays.sort(array);
            Arrays.sort(array, Collections.reverseOrder());
            copied += next + " ";




        }
    }
}
