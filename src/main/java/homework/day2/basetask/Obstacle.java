package homework.day2.basetask;

public class Obstacle {

    public String description;
    public String severity;

    public Obstacle() {
        description = "ничего не понятно";
        severity = "крит";
    }

    public Obstacle(String testdescription, String testseverity) {
        this.description = testdescription;
        this.severity = testseverity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + severity + " препятствие " + description);
    }

}
