package zuo.db;

/**
 * 编辑距离
 * 给你两个单词 word1 和 word2 ，请你计算出word1 转成 word2 所需要的最少操作数
 * 你可以对一个单词做如下操作
 * 1.插入一个字符
 * 2.删除一个字符
 * 3.替换一个字符
 * 实例 如 word1='horse' ，word2='ros'
 *  解释
 *      horse->rorse (将h替换成r)
 *      rorse->rose （删除r）
 *      rose->ros (删除e)
 *
 *
 */
public class MinDistance {

    public static int minDistance(String a,String b){
        int length1=a.length();
        int length2=b.length();
        int [][] dp= new int[length1+1][length2+1];

        //初始化第一列
        for(int row=0;row<length1+1;row++){
            dp[row][0]=row;
        }
    }


}
