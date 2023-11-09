package task1;

import task1.enums.DiffResult;

import java.time.LocalDate;

public class Estimation {
    private DiffResult passed = DiffResult.DEF;
    private Integer mark;
    private LocalDate actualDate;
    private Discipline discipline;

    public Estimation(Discipline discipline, Integer mark, LocalDate actualDate) {
        if (discipline != null) {
            this.discipline = discipline;
        } else {
            this.discipline = new Discipline(); // Создайте пустой экземпляр Discipline, если discipline равен null
        }

        this.mark = mark;
        this.actualDate = actualDate;
    }

    public Estimation(Discipline discipline, DiffResult passed, LocalDate actualDate) {
        if (discipline != null) {
            this.discipline = discipline;
        } else {
            this.discipline = new Discipline(); // Создайте пустой экземпляр Discipline, если discipline равен null
        }

        this.passed = passed;
        this.actualDate = actualDate;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getMark() {
        return mark;
    }

    public void setDiffResult(DiffResult passed) {
        this.passed = passed;
    }

    public DiffResult getDiffResult() {
        return passed;
    }

    public void setActualDate(LocalDate actualDate) {
        this.actualDate = actualDate;
    }

    public LocalDate getActualDate() {
        return actualDate;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Discipline getDiscipline() {
        return discipline;
    }
}
