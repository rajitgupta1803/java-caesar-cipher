public class Algorithm {
    String inp;
    int n;

    public Algorithm(String inp, int n){
        this.inp = inp;
        this.n = n;
    }
    public void out(){
        char[] char_list = inp.toCharArray();
        StringBuffer result = new StringBuffer();
        for (char i:char_list){
            if (Character.isUpperCase(i)){
                result.append(
                        (char)(((int) i + n-65) % 26 + 65)
                );
            }
            else{
                result.append(
                        (char)(((int) i + n-97) % 26 + 97)
                );
            }
        }
        System.out.println(result);
    }
}
