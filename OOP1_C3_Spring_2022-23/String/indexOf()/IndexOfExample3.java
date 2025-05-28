public class IndexOfExample3 {  
    public static void main(String[] args) {      
        String s1 = "This is indexOf method";  
        int index = s1.indexOf("method", 10);  
        System.out.println("index of substring "+index);  
        index = s1.indexOf("method", 20);  
        System.out.println("index of substring "+index);          
    }  
}  