package _02_structural_patterns._06_adapter.exam02;

public class Mp4 implements VideoPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP4 File : " + fileName );
    }
}
