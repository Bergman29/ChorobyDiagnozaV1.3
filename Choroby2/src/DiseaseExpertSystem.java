class DiseaseExpertSystem {
    private KnowledgeBase knowledgeBase;

    public DiseaseExpertSystem() {
        this.knowledgeBase = new KnowledgeBase();
    }

    public String diagnose(String[] symptoms) {
        for (DiseaseRule rule : knowledgeBase.getRules()) {
            if (rule.matches(symptoms)) {
                return rule.getDisease();
            }
        }
        return "Nieznana choroba";
    }
}
