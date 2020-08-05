package Day25_Practices;

public class LongestString {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas","Musa","Adam", "Amir", "Amy","Abdulujabar", "Nurmament"};

        int maxLength = arr[0].length();//4 8
        for(String each : arr){
            if( each.length()> maxLength ){
                maxLength = each.length();//is find out maxLength

            }


        }

        for(String each: arr){
            if(each.length()==maxLength){//is find out max String
                System.out.println(each);
            }
        }

    }
}
