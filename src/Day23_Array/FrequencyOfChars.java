package Day23_Array;
/*
3. write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
 */
public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "BBBBBBCCCCCCDDDD"; //
        String nonDup = "";  //"BCD"

        for (int i = 0; i <= str.length() - 1; i++) {//remove duplicates from str and added to nonDup
            String ch = "" + str.charAt(i); //B2 C2 D2

            if (nonDup.contains(ch)) {
                continue;

            } else {
                nonDup += ch;
            }
        }

        String expectedResult = ""; //"B2C2D2"
        for (int j = 0; j <= nonDup.length() - 1; j++){
        //str = "BBCCDD" nonDup = "BCD" ==> "B2C2D2"
        char ch = nonDup.charAt(j);
        int count = 0;//1+1 = 2
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        expectedResult += "" + ch + count;



        }


        System.out.println(expectedResult);
            }

        }
