package week4;

public class Main2 {
    public static void main(String[] args) {
        int user1Input = -1;
        int[] user1Arr = createArray(user1Input);
        int user2Input = 2;
        int[] user2Arr = createArray(user2Input);

        user1Arr[0] = 1;
        user2Arr[0] = 1;
        user2Arr[1] = 2;

        int[] var3 = {1,2,3,4,5};

        System.out.println("");






    }

    public static int[] createArray(int size){
        if(size <= 0){
            System.out.println("wrong input");
            return null;
        }

        if(size > 10){
            System.out.println("wrong input ");
            return null;
        }
        return new int[size];
    }
}
