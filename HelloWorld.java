public class HelloWorld{
    public static void main(String[] args){
	    System.out.println("测试的长度的长度"+("".split(";")).length);
        System.out.println("测试的长度的长度1"+(";".split(";")).length);
        System.out.println("测试的长度的长度2"+(";dafjkdk;".split(";")).length);
        System.out.println("测试的长度的长度3"+("adsfjk;dafjkdk;".split(";")).length);
        System.out.println("测试的长度的长度4"+("adsfjk;dafjkdk;adjkad".split(";")).length);
    }

}