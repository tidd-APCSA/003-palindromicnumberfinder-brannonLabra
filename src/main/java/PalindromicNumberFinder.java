public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      Integer firstInt = num;
      String stringOne = firstInt.toString();
      boolean flag = true;
      while(flag){
        firstInt++;
        if(palindromicNumTest(firstInt)){
          flag = false;
        }
      }
      return firstInt - num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String s = reversNum(num);
      int num1 = Integer.parseInt(s);
      if(num1 == num){
        return true;
      }else{
        return false;
      }
    

    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){



    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
