package edu.sdsu.cs160l.university.lab5.application;

public class ScholarshipApplication implements UniversityApplication {
    @Override
    public void submitScore(Applicant s, float score) {
        if (score >= 3.2){
            s.setApplicantScore(score);
        }
        else{
            throw new IllegalArgumentException("Not enough score");
        }
    }

    @Override
    public void submitDocuments(Applicant s, String documents) {
        s.setApplicantDocuments(documents);
    }

    @Override
    public boolean checkStatus(Applicant applicant) {
        if (applicant.getApplicantScore() >= 3.2 && applicant.getApplicantDocuments() != null){
            return true;
        }
        else{
            return false;
        }
    }
}
