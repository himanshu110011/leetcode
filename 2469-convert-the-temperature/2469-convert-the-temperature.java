class Solution {
    public double[] convertTemperature(double celsius) {
        double[] d=new double[2];
        d[1]=celsius*9/5+32;
        d[0]=celsius+273.15;
        return d;
    }
}