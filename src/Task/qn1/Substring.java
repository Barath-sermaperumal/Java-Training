package Task.qn1;

public class Substring {
    public static void main(String[] args) {
        String string1 = "hello barath";
        String string2 = "lo";
        Substring obj = new Substring();
        System.out.println(obj.substringOccurance(string1, string2));
    }

    boolean substringOccurance(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int j = 0,count=0;
        boolean isTrue=false;
        for (int i = 0; i < c1.length; i++) {
            if (c2[j] == c1[i]) {
                count+=1;
                isTrue = true;
                if(count==c2.length){
                    break;
                }
                else{
                    j++;
                    isTrue=false;
                }
            } else {
                j=0;
                isTrue=false;
            }
        }
    return isTrue;
    }
}
