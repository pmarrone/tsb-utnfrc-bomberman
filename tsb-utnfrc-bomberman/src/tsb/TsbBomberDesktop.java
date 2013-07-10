package tsb;

import tsb.core.TsbBomber;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class TsbBomberDesktop {
    public static void main (String[] args) {
        new LwjglApplication(new TsbBomber(), "TSB Bomber", 1280, 800, true);
    }
}
