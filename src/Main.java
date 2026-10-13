public class Main {
    public static void main(String[] args) {
        LegacyButton legacyButton = new LegacyButton();
        Button button = new LegacyButtonAdapter(legacyButton);
        Screen screen = new Screen();
        screen.displayButton(button);
    }
}
