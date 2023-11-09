package task1;

public class Group {
    private String number;
    private Integer creationYear;

    public Group() {
    }

    public Group(String number, Integer creationYear) {
        if (number != null) {
            this.number = number;
        } else {
            this.number = "Unknown";
        }

        if (creationYear != null) {
            this.creationYear = creationYear;
        } else {
            this.creationYear = 0;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getYearOfCreation() {
        return creationYear;
    }

    public void setYearOfCreation(Integer creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public String toString() {
        StringBuilder groupDescription = new StringBuilder();
        groupDescription.append("\nGroup: ").append(number).append("\n");
        groupDescription.append("Year of creation: ").append(creationYear).append("\n");
        return groupDescription.toString();
    }
}
