package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbctractLibrary{
    public void getBook(){
        System.out.println("Мы берем книгу");
    }
}
