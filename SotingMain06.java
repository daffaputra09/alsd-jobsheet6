public class SotingMain06 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 10, 2, 8, 14};

        Sorting06 dataUrut1 = new Sorting06(a, a.length);
        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        Sorting06 dataUrut2 = new Sorting06(b, b.length);
        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();
    }
}
