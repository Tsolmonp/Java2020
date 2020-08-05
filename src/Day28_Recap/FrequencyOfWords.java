package Day28_Recap;
//  1. write a program return the frequency of a word from a string
public class FrequencyOfWords {

    public static void main(String[] args) {
        String str = "javajavajavajava";
        //"java'
        //substring(0,4) ==> java
        //substring(1,5) ==> avaj
        //substring(2,6)==> vaja
        //substring(3,7) ==> ajav
        //subsrtinf(4.8) ==> java

        int count = 0;
        for(int i = 0; i <=str.length()-4; i++) {//i:0,1,2,3,4,5,6,7

            String s = str.substring(i, i + 4);
            if (s.equals("java")) {
                count++;
            }
        }
            System.out.println(count);

        }
    }

