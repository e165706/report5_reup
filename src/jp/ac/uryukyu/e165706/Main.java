package jp.ac.uryukyu.e165706;

public class Main {
    public static  void main(String args[]) {
        String str = null;
        try {System.out.println(str.length());}
        catch (Exception e){
            //System.err.print("Err is " + e);
            e.printStackTrace();
        }
    }
}
