class KnowledgeBase {
    private DiseaseRule[] rules;

    public KnowledgeBase() {
        this.rules = new DiseaseRule[] {
                new DiseaseRule("Przeziębienie", new String[] {"kaszel", "ból gardła", "katar"}),
                new DiseaseRule("Grypa", new String[] {"gorączka", "kaszel", "zmęczenie", "ból głowy"}),
                new DiseaseRule("COVID 2.0", new String[] {"gorączka", "kaszel", "zmęczenie", "utrata smaku lub węchu"})
        };
    }

    public DiseaseRule[] getRules() {
        return rules;
    }
}
