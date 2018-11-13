//Java数组章节练习题
public class ArrayUtils{

    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
         int max=data[0];
		 for(int i=1;i<data.length;i++) {
			 if(data[i]>max)
				 max=data[i];
		 }
        return max;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
        int min=data[0];
		for(int i=1;i<data.length;i++){
		   if(data[i]<min)
			   min=data[i];
		}
        return min;
    }
    
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
        int sum=0;
		for(int i=0;i<data.length;i++){
			sum+=data[i];
		}
        return sum;
    }
    
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
        int [] join= new int [a.length+b.length];
		for(int i=0;i<a.length;i++){
			join[i]=a[i];
		}
		for(int i=a.length;i<(a.length+b.length);i++)
		{
			join[i]=b[i-a.length];
		}
		
        return join;
    }

    //5.数组截取
    //[start, end)
    public static int[] arraySub(int[] data, int start , int end){
        int [] sub = new int [end-start];
		for(int i =start;i<end;i++){
		    sub[i-start]=data[i];
		}
        return sub;
    }
    
    //6.数组打印
    public static void printArray(int[] data){
        for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
    }
    
    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
        int[] reve = new int [data.length];
		for(int i=0;i<data.length;i++){
				reve[i]=data[data.length-1-i];
    }
	for(int i=0;i<reve.length;i++){
		
		data[i]=reve[i];
	}
    }
    public static void main(String[] args){
        //TODO 测试 
		ArrayUtils arrays = new ArrayUtils();
		int []test1  =new int []{1,3,4,7,9,8,2,6,5,0};
		int []test2  = new int []{ 2 ,3,5,8};
		int [] test3 = new int [test1.length+test2.length];
		int []test4 = new int [5];
		int max = arrays.arrayMaxElement(test1);
		int min = arrays.arrayMinElement(test1);
		int sum = arrays.arrayElementSum(test1);
		test3= arrays.arrayJoin(test1,test2);
		test4= arrays.arraySub(test1,0,5);
		System.out.println("这是test1的打印");
		arrays.printArray(test1);
		System.out.println("这是test2的打印");
		arrays.printArray(test2);
		System.out.println("这是test1,test2拼接后的结果：");
		arrays.printArray(test3);
		System.out.println("这是test1的截取：0-5");
		arrays.printArray(test4);
		arrays.printReversal(test1);
		System.out.println("这是test1反转后的结果：");
		arrays.printArray(test1);
		
    }
}
