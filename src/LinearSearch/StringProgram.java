package LinearSearch;

public class StringProgram {
    public static void main(String args[]){
        String s = "Kathir";
        char a = 'a';
        System.out.println(isStringPresent(s,a));
        s = "Thariq";
        System.out.println(search2(s,'d'));
    }
    static boolean isStringPresent(String s, char target){
        if(s.isEmpty()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            if(target == s.charAt(i)){
                return true;
            }

        }
        return false;
    }
    static boolean search2(String s, char target){
        if(s.isEmpty()){
            return false;
        }
        for(char ch : s.toCharArray()){
            if(ch == target){
                return true;
            }

        }
        return false;
    }
}
