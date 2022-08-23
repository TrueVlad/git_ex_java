package org.spring.fileXml;

public class ClassicMusic implements Music {
    private ClassicMusic(){};           //сделали приватный конструктор

    public static ClassicMusic getClassicMusic(){
        return new ClassicMusic();
    };

    public void doMyInit(){
        System.out.println("Init Method");
    }

    public void doMyDestroy(){
        System.out.println("Destroy Method");
    }

    @Override
    public String playingMusic() {
        return "playing classic music";
    }
}
