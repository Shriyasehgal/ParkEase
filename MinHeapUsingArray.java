package ParkEaseSheHack.api.ParkEasespringapi;

public class MinHeapUsingArray {
    Slot arr[];
    int tail=-1;
    int arraySize;
    MinHeapUsingArray(int arraySize){
        this.arraySize=arraySize;
        arr=new Slot[arraySize];
    }

    void insert(Slot slot) throws Exception{
        tail++;
        if(tail<arraySize){
            arr[tail]=slot;
            rearrangeBottomUp();
            return;
        }else{
            throw new Exception("Heap is Full");
        }
    }
    void rearrangeBottomUp(){
        int temp=tail;
        int parent=(temp-1)/2;
        while(temp>=0 && arr[parent].getDistance()>arr[temp].getDistance()){
            int value=arr[parent].getDistance();
            arr[parent].setDistance(arr[temp].getDistance());
            arr[temp].setDistance(value);
            temp=parent;
            parent=(temp-1)/2;
        }
    }
    Slot delete() throws Exception{
        if(tail>=0){
            Slot del=arr[0];
            arr[0]=arr[tail];
            tail--;
            rearrangeTopDown();
            return del;
        }
        throw new Exception("Empty Heap");
    }
    void rearrangeTopDown(){
        int index=0;
        int left=2*index+1;
        int right=2*index+2;
        while(left<=tail && right<=tail){
            if(arr[right].getDistance()>arr[left].getDistance()){
                int temp=arr[index].getDistance();
                arr[index].setDistance(arr[left].getDistance());
                arr[left].setDistance(temp);
                index=left;
                left=2*index+1;
                right=2*index+2;
            }else if(arr[left].getDistance()>arr[right].getDistance()){
                int temp=arr[index].getDistance();
                arr[index].setDistance(arr[right].getDistance());
                arr[right].setDistance(temp);
                index=right;
                left=2*index+1;
                right=2*index+2;
            }
        }
    }
}
