public class Computer {

////////////////////////////////////////////////////////////////////// класс процессор
    class Processor{
        private boolean isStart = false;

        public void start(){
            isStart = true;
            System.out.println("Processor " + isStart);
        }

        public void shatDown(){
            isStart = false;
            System.out.println("Processor " + isStart);
        }
    }

////////////////////////////////////////////////////////////////////// класс Ram
    class Ram{
        private boolean isStart = false;

        public void start(){
            isStart = true;
            System.out.println("Ram " + isStart);
        }

        public void shatDown(){
            isStart = false;
            System.out.println("Ram " + isStart);
        }
    }

////////////////////////////////////////////////////////////////////// создали обхекты
    Processor i7 = new Processor();
    Ram balistic = new Ram();
}
