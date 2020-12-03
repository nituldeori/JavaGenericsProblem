package com.findmaximumgenerics;

public class Generics {
    public Integer findMaxInt(Integer[] A){
        Integer max=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i].compareTo(max)>0){
                max=A[i];
            }
        }
        return max;
    }

    public Float findMaxFloat(Float[] B){
        Float max=B[0];
        for(int i=1;i<B.length;i++){
            if(B[i].compareTo(max)>0){
                max=B[i];
            }
        }
        return max;
    }
}
