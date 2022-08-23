//  https://www.youtube.com/watch?v=stuAmyyootQ&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=13

package org.spring.fileXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
