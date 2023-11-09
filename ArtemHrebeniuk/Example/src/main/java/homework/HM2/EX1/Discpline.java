package task1;

import task1.enums.EstimationType;

import java.time.LocalDate;

public class Discipline {
    private String name;
    private LocalDate date;
    private EstimationType estType = EstimationType.DEF;

    public Discipline() {
    }

    public Discipline(String name, LocalDate date, EstimationType estType) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }

        if (date != null) {
            this.date = date;
        } else {
            this.date = LocalDate.now();
        }

        this.estType = estType != null ? estType : EstimationType.DEF;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setEstimationType(EstimationType estType) {
        this.estType = estType;
    }

    public EstimationType getEstimationType() {
        return estType;
    }

    @Override
    public String toString() {
        StringBuilder disciplineDescription = new StringBuilder();
        String type = "not yet determined";

        if (estType == EstimationType.DIFF) {
            type = "offset";
        } else if (estType == EstimationType.EXAM) {
            type = "exam";
        }

        disciplineDescription.append("\nName: ").append(name).append("\n");
        disciplineDescription.append("Date: ").append(date).append("\n");
        disciplineDescription.append("Estimation type: ").append(type);

        return disciplineDescription.toString();
    }
}
