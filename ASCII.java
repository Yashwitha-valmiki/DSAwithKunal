public class ASCII {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch+0);
        System.out.println((char)(ch+1));
        subseqAscii("", "abc");
    }
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));
    }
}
