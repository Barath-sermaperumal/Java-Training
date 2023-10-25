package Task.qn1;

public class Vowels {
    public static void main(String[] args) {
        String s="Hello Barath";
        Vowels obj=new Vowels();
        obj.removeVowels(s);
    }
    void removeVowels(String s){
        char[] c=s.toCharArray();
        String newString="";
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U'){}
            else newString+=c[i];
        }
        System.out.println(newString);
    }
}
