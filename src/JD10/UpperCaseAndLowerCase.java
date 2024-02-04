package JD10;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str="JATVA java";
        int x=0;
        int y=0;

        for(char each:str.toCharArray()){
            if(Character.isLetter(each)){
            if(Character.isLowerCase(each)){
                x++;
            }else {y++;}}
        }
        System.out.println(x==y);
    }
}
