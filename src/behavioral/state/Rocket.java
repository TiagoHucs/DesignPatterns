package behavioral.state;

class Rocket {
    RocketState state;

    Rocket() {
        this.state = new ReadyState();
    }

    void setState(RocketState state){
        this.state = state;
    }

    void stage(){
        this.state.executeStage(this);
    }
}
