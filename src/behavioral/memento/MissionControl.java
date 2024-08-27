package behavioral.memento;

import java.util.Stack;

// Caretaker
class MissionControl {
    private final Stack<MissionMemento> missionHistory = new Stack<>();

    public void saveMissionState(RocketMission mission) {
        missionHistory.push(mission.save());
    }

    public void undoMissionState(RocketMission mission) {
        if (!missionHistory.isEmpty()) {
            mission.restore(missionHistory.pop());
        } else {
            System.out.println("No previous state to restore.");
        }
    }
}
