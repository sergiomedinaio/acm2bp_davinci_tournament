public class MatchResult {
    private int localGoalCounter;
    private int visitantGoalCounter;

    MatchResult() {
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
    }

    public int getLocalGoalCounter() {
        return localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
    }

    public int getVisitantGoalCounter() {
        return visitantGoalCounter;
    }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }

    public void incrementLocalCounter(){
        this.localGoalCounter++;
    }

    public void incrementVisitantCounter() {
        this.visitantGoalCounter++;
    }

    public String generateMarker() {
        //return this.getLocalGoalCounter() + "-" + this.getVisitantGoalCounter();
        return String.format("(%d) - (%d)",
                this.getLocalGoalCounter(),
                this.getVisitantGoalCounter()
        );
    }


}
