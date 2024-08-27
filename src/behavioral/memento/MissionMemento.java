package behavioral.memento;

// Memento
class MissionMemento {
    private final String missionName;
    private final String rocketStatus;
    private final String missionObjective;

    public MissionMemento(String missionName, String rocketStatus, String missionObjective) {
        this.missionName = missionName;
        this.rocketStatus = rocketStatus;
        this.missionObjective = missionObjective;
    }

    public String getMissionName() {
        return missionName;
    }

    public String getRocketStatus() {
        return rocketStatus;
    }

    public String getMissionObjective() {
        return missionObjective;
    }
}
