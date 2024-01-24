package gr.aueb.cf.ch14.singleton;

/**
 * Defines a Singleton SaintGeorgeKnight that
 * embarks on mission.
 */
public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {}

    public static SaintGeorgeKnight getInstance() {
        return INSTANCE;
    }

    public void embarkOnMission(IMission mission) {mission.embark();}
}
