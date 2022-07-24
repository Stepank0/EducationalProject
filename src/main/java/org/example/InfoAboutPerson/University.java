package org.example.InfoAboutPerson;

public class University {
    private Long university;
    private String universityName;

    public University() {
    }

    public University(Long university, String universityName) {
        this.university = university;
        this.universityName = universityName;
    }

    public Long getUniversity() {
        return university;
    }

    public void setUniversity(Long university) {
        this.university = university;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
