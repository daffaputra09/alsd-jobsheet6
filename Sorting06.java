public class Sorting06 {

    int[] data;
    int jumData;

    Sorting06(int Data[], int jmlData){
        jumData = jmlData;
        data = new int[jumData];
        for (int i = 0; i < jumData; i++){
            data[i] = Data[i];
        }
    }

    void bubbleSort(){
        int temp=0;
        for (int i = 0; i < jumData-1; i++){
            for (int j = 1; j < jumData-i; j++){
                if (data[j-1] > data[j]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    void tampil(){
        for (int i = 0; i < jumData; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void SelectionSort(){
        for (int i = 0; i < jumData-1; i++){
            int min = i;
            for (int j = i+1; j < jumData; j++){
                if (data[j] < data[min]){
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
}


