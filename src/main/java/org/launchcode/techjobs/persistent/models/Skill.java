package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    @NotNull(message = "Skill is required")
    private final List<Job> jobs = new ArrayList<>();

    public Skill(){
    }

    @NotBlank
    @Size(max=300, message = "Description too long!")
    private String description;


    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs(){return jobs;}
}