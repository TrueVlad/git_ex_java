package fileXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

//        Music musicBean = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playingSound();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        for(String s : musicPlayer.getArray() ){
            System.out.println(s);
        }



        context.close();
    }
}
