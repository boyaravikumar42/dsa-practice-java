public class STTMain {
    public static void main(String[] args) {
        int arr[]={3,8,7,6,-2,-8,4,9};
        SegmentTree obj=new SegmentTree(arr, 0, arr.length-1);
        obj.display();
        int res=obj.query(3,5);
        System.out.println("\n\n");
        System.out.println(res);
        System.out.println("\n\n");
        obj.update(1, 0);
        obj.display();
    }

}
