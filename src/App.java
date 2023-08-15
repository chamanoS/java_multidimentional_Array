public class App {
    public static void main(String[] args)  {

        int [][] multiArray = {{1,2,4,5,3},{9,8,7,6,0}};
        int sum = 0;

        for(int i = 0;i< multiArray.length;i++){
            for(int ai = 0; ai< multiArray[i].length; ai++){
                 sum += multiArray[i][ai];
            }
        }

        System.out.println(sum);
    }
}
