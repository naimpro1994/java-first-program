package com.h2;

public class SavingsCalculator {
    private float[] credits;
    private float[] debits;

    public SavingsCalculator (float[] debits, float[] credits) {
        debits = this.debits;
        credits = this.credits;

    }
    private float sumOfCredits(){
         float sum = 0.0f;
         for (float credit : credits){
             sum += credit;
         }
         return sum;


}


}
