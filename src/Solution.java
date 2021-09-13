//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        solve(s);
//    }
//    static String solve(String s )
//    {
//        String compressedString = "";
//        int count_consecutive =0;
//        for( int i =0 ; i < s.length() ; i++)
//        {
//            count_consecutive++;
//            if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1))
//            {
//                compressedString+=""+s.charAt(i)+count_consecutive;
//                count_consecutive=0;
//            }
//        }
//        return compressedString.length() < s.length() ? compressedString : s;
//
//    }
//}
//class Ans
//{
//    static boolean oneEditAway(String first , String second )
//    {
//        if( first.length() == second.length())
//            return oneEditAway(first,second);
//    else if( first.length()+1 == second.length())
//        return oneEditInsert(first , second);
//    else if(first.length()-1==second.length())
//        return oneEditInsert( second , first);
//    return false ;
//    }
//    static boolean oneEditReplace(String s1 , String s2 )
//    {
//        boolean foundDiffernce = false ;
//        for( int i =0 ; i < s1.length() ; i++)
//        {
//            if( s1.charAt(i) != s2.charAt(i))
//            {
//                if( foundDiffernce)
//                {
//                    return false ;
//                }
//                foundDiffernce=true ;
//            }
//        }
//        return true ;
//    }
//    static boolean oneEditInsert(String s1 , String s2 )
//    {
//        int index1 =0;
//        int index2 =0;
//        while( index1 < s1.length() && index2 < s2.length() )
//        {
//            if( s1.charAt(index1)!=s2.charAt(index2))
//            {
//                if( index1 != index2 )
//                {
//                    return false;
//                }
//                index2++;
//            }
//            else
//            {
//                index1++;
//                index2++;
//            }
//        }
//        return true ;
//    }
//
//}

class Solution
{
    boolean matrix( int[][] matrix )
    {
        if( matrix.length == 0 || matrix.length != matrix[0].length )
            return false ;
        int n = matrix.length ;
        for( int layer = 0 ; layer < n/2 ; layer++)
        {
            int first = layer ;
            int last = n-1-layer ;
            for( int i = first ; i < last ; i++)
            {
                int offset = i - first ;
                int top = matrix[first][i]; // save top
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset]=matrix[i][last];
                matrix[i][last]=top;

            }
        }
        return true ;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Solution ans = new Solution();
        ans.matrix(matrix);
        for( int i =0 ; i < matrix.length; i++)
        {
            for( int j=0;j<matrix.length ; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    // 1 2 3 4
    // 5 6 7 8
    // 9 10 11 12
    // 13 14 15 16

}