class DiseaseRule {
    private String disease;
    private String[] symptoms;

    public DiseaseRule(String disease, String[] symptoms) {
        this.disease = disease;
        this.symptoms = symptoms;
    }

    public String getDisease() {
        return disease;
    }

    public boolean matches(String[] patientSymptoms) {
        for (String requiredSymptom : symptoms) {
            boolean found = false;
            for (String symptom : patientSymptoms) {
                if (requiredSymptom.equalsIgnoreCase(symptom)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}