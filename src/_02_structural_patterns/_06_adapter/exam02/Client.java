package _02_structural_patterns._06_adapter.exam02;

public class Client {

    public static void main(String[] args) {
        AudioPlayer mp3 = new Mp3();
        mp3.play("file.mp3");

        mp3 = new FormatAdapter(new Mp4());
        mp3.play("file.mp4");

        mp3 = new FormatAdapter(new MKV());
        mp3.play("file.mkv");

        // spring web
//        DispatcherServlet dispatcherServlet = new DispatcherServlet();
//        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
    }
}
