package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        RocketMission mission = new RocketMission("Apollo 11");

        MissionControl missionControl = new MissionControl();

        mission.setRocketStatus("In Preparation");
        mission.setMissionObjective("Land on the Moon");

        missionControl.saveMissionState(mission);  // Save state

        mission.setRocketStatus("Launched");
        mission.setMissionObjective("In Orbit");

        missionControl.saveMissionState(mission);  // Save state

        mission.setRocketStatus("Lunar Module Deployed");
        mission.setMissionObjective("Landing");

        // Undo to previous state
        missionControl.undoMissionState(mission);

        // Undo to initial state
        missionControl.undoMissionState(mission);
    }
}
