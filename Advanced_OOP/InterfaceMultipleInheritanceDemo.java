/*
 * THEORY: Java does not allow a class to extend more than one
 * class (avoiding the "Diamond Problem" of ambiguous inherited
 * state), but it DOES allow a class to implement multiple
 * interfaces, achieving multiple inheritance of TYPE/behavior
 * without the ambiguity, since interfaces (traditionally) hold no
 * state.
 */
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface Phone {
    void makeCall();
}

// SmartPhone inherits behavior from THREE interfaces at once
class SmartPhone implements Camera, MusicPlayer, Phone {
    @Override
    public void takePhoto() {
        System.out.println("Capturing a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void makeCall() {
        System.out.println("Making a phone call...");
    }
}

public class InterfaceMultipleInheritanceDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();
        phone.playMusic();
        phone.makeCall();

        // Each interface reference can independently point to the same object
        Camera cam = phone;
        MusicPlayer player = phone;
        System.out.println("\nUsing interface references:");
        cam.takePhoto();
        player.playMusic();
    }
}
/*
 * SAMPLE OUTPUT
 * Capturing a photo...
 * Playing music...
 * Making a phone call...
 *
 * Using interface references:
 * Capturing a photo...
 * Playing music...
 */
