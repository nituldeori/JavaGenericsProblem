package com.findmaximumgenerics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericsTest {
    @Test
    public void given3IntegersShouldReturnMaximum(){
        Generics g=new Generics();
        Integer[] A={3,2,1,1};
        Assert.assertEquals(A[0],g.findMax(A));
        Integer[] B={3,9,5,4};
        Assert.assertEquals(B[1],g.findMax(B));
        Integer[] C={2,6,10};
        Assert.assertEquals(C[2], g.findMax(C));
    }

    @Test
    public void given3FloatsShouldReturnMaximum(){
        Generics g=new Generics();
        Float[] A={3.2f,2.1f,1.8f,3.1f,2.9f};
        Assert.assertEquals(A[0],g.findMax(A));
        Float[] B={3.5f,9.1f,5.7f};
        Assert.assertEquals(B[1],g.findMax(B));
        Float[] C={2.8f,6.1f,10.5f,4.5f,3.4f};
        Assert.assertEquals(C[2], g.findMax(C));
    }

    @Test
    public void given3StringsShouldReturnMaximum(){
        Generics g=new Generics();
        String[] A={"Nitul","Hayato","Alok","Moko"};
        Assert.assertEquals(A[0],g.findMax(A));
        String[] B={"Misa","Shaini","Kshmir","Miguel"};
        Assert.assertEquals(B[1],g.findMax(B));
        String[] C={"Adam","Eve","Jay"};
        Assert.assertEquals(C[2], g.findMax(C));
    }


}