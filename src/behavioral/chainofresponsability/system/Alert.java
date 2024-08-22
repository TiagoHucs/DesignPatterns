package behavioral.chainofresponsability.system;

class Alert {
    private int level;

    Alert(int level){
        this.level = level;
    }

    int getLevel(){
        return this.level;
    }
}
