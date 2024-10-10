package _02_structural_patterns._06_adapter.exam02;

public class FormatAdapter implements AudioPlayer{

    private VideoPlayer videoPlayer;

    public FormatAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Using Adapter : ");
        videoPlayer.play(fileName);
    }
}
