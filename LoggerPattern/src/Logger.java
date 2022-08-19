public class Logger {

    private static Logger instance = null;

    private long num;

    private Logger() {
        this.num = 1;
    }

    public static Logger get() {
        if (instance == null) {
            instance = new Logger();
            return instance;
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("[" + System.currentTimeMillis() + num +"]: " + msg );
        num++;
    }
}
