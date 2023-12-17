public class array {
    public static int kadanesAlgorithm(int[] a){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<=a.length-1;i++){
            curr=curr+a[i];
            if(curr<=0){
                curr=0;
            }
            maxsum=Math.max(maxsum,curr);
        }
        return maxsum;
    }

    public static int[] dutchAlgorithm(int[] d){
        int l=0;
        int h=d.length-1;
        int m=0;
        while(m<=h){
            if(d[m]==0){
                int temp=d[l];
                d[l]=d[m];
                d[m]=temp;
                l++;
                m++;
            }
            else if(d[m]==1){
                m++;
            }
            else{
                int temp=d[h];
                d[h]=d[m];
                d[m]=temp;
                h--;
            }
        }
        return d;
    }

    public static void maxAndMin(int[] a){
        int min=a[0];
        int max=a[0];
        for(int i=0;i<7;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("maximum number: "+max);
        System.out.println("minimum number: "+min);
    }

    public static void reverseOfArray(){
        int[] a={1,2,3,4,5,6,7,8};
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
        System.out.println("Reverse of array: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void reverse(int[] a,int start,int end){
        int s=start;
        int e=end;
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args){
        int[] a={1,2,3,-1,-9,3,5,4};
        int maxsum=kadanesAlgorithm(a);
        System.out.println("maximum subarray is : "+maxsum);
        int[] d={0,1,2,1,2,0,1,0};
        int[] order=dutchAlgorithm(d);
        System.out.println("array in order: ");
        for(int i=0;i<order.length;i++){
        System.out.println(order[i]);
        }
        maxAndMin(a);
        reverseOfArray();
        int[] p={1,2,3,4,5,6,7,8};
        int k=3;
        reverse(p,0,p.length-k-1);
        reverse(p,p.length-k,p.length-1);
        reverse(p,0,p.length-1);
        System.out.println("Rotating of array: ");
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]);
        }
    }
}
