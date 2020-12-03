package com.findmaximumgenerics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericsTest {
    @Test
    public void given3IntegersShouldReturnMaximum(){
        Generics g=new Generics();
        Integer[] A={3,2,1};
        Assert.assertEquals(A[0],g.findMaxInt(A));
        Integer[] B={3,9,5};
        Assert.assertEquals(B[1],g.findMaxInt(B));
        Integer[] C={2,6,10};
        Assert.assertEquals(C[2], g.findMaxInt(C));
    }


}