package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    @NotNull(message = "Employer is required")
    private Employer employer;

    @ManyToMany
    List<Skill> skills;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills.toString();
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
