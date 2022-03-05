package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class Client {

    public static void main(String[] args) {

        for(String arg: args) {
            int num_of_pairs = count(Integer.parseInt(arg));
            System.out.println(arg + "      " + num_of_pairs);
        }
    }

    private static int count(int n){
        Random random = new Random();
        int num_of_pairs = 0;
        UF_HWQUPC uf_hwqupc = new UF_HWQUPC(n ,true);
        while(uf_hwqupc.components() > 1){
            int p = random.nextInt(n);
            int q = random.nextInt(n);
            uf_hwqupc.connect(p, q);
            num_of_pairs++;
        }

        return num_of_pairs;
    }
}
