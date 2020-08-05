package Day25_Practices;

public class ShortString {

    public static void main(String[] args) {
        String[] arr = {"Anam","Nickolas", "Amir", "Amy","Nurmament"};

        int minLength = arr[0].length();

        for(int i = 0; i <= arr.length-1; i++){ //to find out the minimum
            // length of the strings
            //  in this array
            int l = arr[i].length(); //4 8 4 8

            if(l < minLength){
                minLength = l;
            }
        }
        System.out.println(minLength);
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i].length()== minLength){
                System.out.println(arr[i]);
            }
        }

    }
}
