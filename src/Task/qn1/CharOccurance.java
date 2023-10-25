package Task.qn1;

public class CharOccurance {
    public static void main(String[] args) {
        String s="Hello Barath";
        char c='h';
        CharOccurance obj=new CharOccurance();
        System.out.println(obj.characterOccurance(s,c));
    }
    int characterOccurance(String s,char c){
        int count =0;
        s=s.toLowerCase();
        char newChar[]=s.toCharArray();
        for(int i=0;i<newChar.length;i++){
            if(newChar[i]==c){
                count+=1;
            }
        }
        return count;
    }
}
