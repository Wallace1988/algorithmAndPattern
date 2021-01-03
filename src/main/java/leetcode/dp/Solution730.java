package leetcode.dp;

/**
 * 统计不同回文子序列
 *
 *
 * 给定一个字符串 S，找出 S 中不同的非空回文子序列个数，并返回该数字与 10^9 + 7 的模。

 通过从 S 中删除 0 个或多个字符来获得子序列。

 如果一个字符序列与它反转后的字符序列一致，那么它是回文字符序列。

 如果对于某个  i，A_i != B_i，那么 A_1, A_2, ... 和 B_1, B_2, ... 这两个字符序列是不同的。

  

 示例 1：
 输入：
 S = 'bccb'
 输出：6
 解释：
 6 个不同的非空回文子字符序列分别为：'b', 'c', 'bb', 'cc', 'bcb', 'bccb'。
 注意：'bcb' 虽然出现两次但仅计数一次。



 示例 2：
 输入：
 S = 'abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba'
 输出：104860361
 解释：
 共有 3104860382 个不同的非空回文子序列，对 10^9 + 7 取模为 104860361。
  

 提示：

 字符串 S 的长度将在[1, 1000]范围内。
 每个字符 S[i] 将会是集合 {'a', 'b', 'c', 'd'} 中的某一个。

 */
public class Solution730 {


    public static void main(String[] args) {


    }


    public int countPalindromicSubsequences(String str) {
        if(str ==null || str.equals("")){
            return 0;
        }
        if(str.length()==1){
            return 1;
        }

        char[] strChar = str.toCharArray();
        int length=strChar.length;

        //长度为 i  的时候 回文子序列个数
        int [] dp = new int[length];
        dp[0]=1;
        for(int i=1;i<length;i++){
            for(int j=0;j<i;j++){

            }
        }


        return 0;
    }
}
