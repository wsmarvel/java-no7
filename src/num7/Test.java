package num7;

public class Test {
	public static void main(String[] args) {
        //定义变量
        int i,j,q;
        //打印菱形的上半部分，左边打印倒直角三角形的空格，右边打印等腰三角形
        for( i = 1;i < 6; i ++) //外循环控制行数，共打印五行
        {
            //左边打印倒直角三角形空格
            for( j = 6; j > i; j--) //与外循环关联，初始值不变，表达式变化，控制打印的列数
            {
                System.out.print(" ");
            }
            //右边等腰三角形
            //与外循环关联，初始值不变，表达式变化，打印奇数列1，3，5，7，9
            
            System.out.print(".");
            System.out.println();    //换行    
        }
        for( q = 1; q < 8; q++) 
        	{
        		System.out.print(".");
        	}
        	System.out.println();
        
        	 for( i = 1;i < 6; i ++) //外循环控制行数，共打印五行
             {
                 //左边打印倒直角三角形空格
                 for( j = 6; j > i; j--) //与外循环关联，初始值不变，表达式变化，控制打印的列数
                 {
                     System.out.print(" ");
                 }
                 //右边等腰三角形
                 //与外循环关联，初始值不变，表达式变化，打印奇数列1，3，5，7，9
                 
                 System.out.print(".");
                 System.out.println();    //换行    
             }

}
	
}