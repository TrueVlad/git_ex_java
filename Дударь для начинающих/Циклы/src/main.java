public class main {
    public static void main(String[] args) {

//        for(int i = 10; i > 0; i--) {
//            System.out.println(i);
//            if (i == 3)
//                return;                // или break
//        }

//==========================================
        int j = 0;
        while (j<100) {
            j += 1;
            if (j % 2 == 0 ) {
                continue;               // пропускает действие
            }
            System.out.println(j);
        }

//++++++++++++++++++++++++++++++++++++++++++
//        boolean isTrue = true;
//        int k = 0;
//        while (isTrue) {
//            System.out.println(k);
//            k += 2;
//            if (j > 10 )
//                break;               // или isTrue = false или return
//        }

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//        int x = 0;                           // делаем хоть один раз
//        do{
//            x++;
//            System.out.println(x);
//        } while (x < 0);
    }
}
