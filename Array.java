public class Array{
    public static void main(String[] args){
        int[] arr = new int[5];// declaration and instantiation
        int n = arr.length; // length of array          
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("Elements of integer array : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Elements of character array : ");
        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }
        float[] f = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println("Elements of float array : ");
        for(int i=0; i<f.length; i++){
            System.out.println(f[i]);
        }

    }
}