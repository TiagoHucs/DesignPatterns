package behavioral.memento;

// Originator
class RocketMission {
    private String missionName;
    private String rocketStatus;
    private String missionObjective;

    public RocketMission(String missionName) {
        this.missionName = missionName;
        this.rocketStatus = "Grounded";
        this.missionObjective = "Undefined";
    }

    public void setRocketStatus(String rocketStatus) {
        this.rocketStatus = rocketStatus;
        System.out.println("Rocket status updated to: " + rocketStatus);
    }

    public void setMissionObjective(String missionObjective) {
        this.missionObjective = missionObjective;
        System.out.println("Mission objective updated to: " + missionObjective);
    }

    public MissionMemento save() {
        System.out.println("Saving mission state...");
        return new MissionMemento(missionName, rocketStatus, missionObjective);
    }

    public void restore(MissionMemento memento) {
        this.missionName = memento.getMissionName();
        this.rocketStatus = memento.getRocketStatus();
        this.missionObjective = memento.getMissionObjective();
        System.out.println("Restored mission state:");
        System.out.println("Rocket Status: " + rocketStatus);
        System.out.println("Mission Objective: " + missionObjective);
    }

    @Override
    public String toString() {
        return "RocketMission{" +
                "missionName='" + missionName + '\'' +
                ", rocketStatus='" + rocketStatus + '\'' +
                ", missionObjective='" + missionObjective + '\'' +
                '}';
    }
}

