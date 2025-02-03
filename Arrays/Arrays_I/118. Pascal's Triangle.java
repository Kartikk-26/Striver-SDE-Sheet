//Question Number : 118. 
//Question Name :  Pascal's Triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //A list is made to store the numbers
        List<List<Integer>> ans = new ArrayList<>();
        int s = 1;
        int n =  numRows;

        //A loop to iterarte the list for rows and column
        for(int row=1; row<=n; row++){
            s=1;
            //A list to store the rows and column
            List<Integer> res = new ArrayList<>();
            for(int col=0; col<row; col++){
                //At the first place of rows and last place it should be 1
                if(col==0 || col==row-1){
                    res.add(1);
                }
                else{
                    // we will add the second element with third and same goes on
                    s = (s*(row-col));
                    s = s/col;
                    //we will add that number (s) in res (result) which is used to store 
                    res.add(s);
                }
            }
            // we will add that result (res) in ans which is storing the list
            ans.add(res);
        }
        //return the final list ans
        return ans;
    }
}