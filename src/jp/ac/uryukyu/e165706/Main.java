package jp.ac.uryukyu.e165706;

public class Main {
    public static  void main(String args[]) {
        String str = "3．14";
        try {System.out.println(str.length());
          double value = Double.parseDouble(str);
        }
        catch (Exception e){
            //System.err.print("Err is " + e);
            e.printStackTrace();
        }
    }
}
