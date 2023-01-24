
class LinBinSearch {
    
    public static int linearSearch(int[] arr, int valueToFind){
int index=-1;
int n=arr.length;
for (int i=0;i<n-1;i++) {
if (arr[i]==valueToFind) {
index=i;
break;
}
}
return index;
}
public static int linearSearch(String[] arr,String valueToFind){
int index=-1;
int n=arr.length;
for (int i=0;i<n-1;i++) {
if (arr[i].compareTo(valueToFind) ==0 ) {
index=i;
break;
}
}
return index;
}
public static int binarySearch(int[] arr, int valueToFind){
int n = arr.length;
int hi=n-1, low=0;
while(hi>low){
int mid=(hi+low)/2;
if (arr[mid] > valueToFind) {
hi=mid;
}
else if(arr[mid] < valueToFind){
low=mid+1;
}
else{
return mid;
}
}
return -1;
}
public static int binarySearch(String[] arr, String valueToFind){
int n = arr.length;
int hi=n-1, low=0;
while(hi > low){
// System.out.println(low+" "mid+" "+high);
int mid=(hi+low)/2;
System.out.println(low+" "+mid+" "+hi);
if (arr[mid].compareTo(valueToFind) > 0) {
hi=mid;
}
else if(arr[mid].compareTo(valueToFind) < 0){
low=mid+1;
}
else{
return mid;
}
}
return -1;
}
public static void main(String[] args) {
int[] arr={1,2,5,4,3};
String[] sarr={"my","name", "is", "Ann"};

System.out.println("Linear search of 1 returned "+linearSearch(arr,1));
System.out.println("Linear search of 0 returned "+linearSearch(arr,0));
System.out.println("Linear search of \"is\" returned "+linearSearch(sarr,"is"));
System.out.println("Linear search of \" king\" returned "+linearSearch(sarr,"king"));
System.out.println("Binary search of 1 returned "+binarySearch(arr,1));
System.out.println("Binary search of 0 returned "+binarySearch(arr,0));
System.out.println("Binary search of \"is\" returned "+binarySearch(sarr,"is"));
System.out.println("Binary search of \" king\" returned "+binarySearch(sarr,"king"));
System.out.println("");
}
}
