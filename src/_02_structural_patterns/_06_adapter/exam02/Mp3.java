package _02_structural_patterns._06_adapter.exam02;

public class Mp3 implements AudioPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 File : " + fileName );
    }
}
