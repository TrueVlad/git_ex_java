public class Main {
    public static void main(String[] args) {

    Computer moyComputer = new Computer();  // создаем компьютер
    moyComputer.i7.start();                 // включаем процессор
    moyComputer.balistic.start();

    moyComputer.i7.shatDown();
    moyComputer.balistic.shatDown();

////////////////////////////////////////////////////////////////////////////////////////////
//        new Computer() {                      // анонимный класс ничего не выводит, хз ааще
//            void superComp() {
//                this.i7.start();
//                this.balistic.start();
//            }
//        };

    }
}
