public class Summoner {
    /**
     * 召唤师名字
     */
    private String name;
    /**
     * 召唤师类型
     */
    private String type;
    /**
     * 召唤师天赋
     */
    private String innate;

    public Summoner(String name, String type, String innate) {
        this.name = name;
        this.type = type;
        this.innate = innate;
    }

    @Override
    public String toString() {
        return "Summoner{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", innate='" + innate + '\'' +
                '}';
    }
    private Summoner(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.innate = builder.innate;
    }

    protected static class Builder {
        private String name;
        private String type;
        private String innate;

        protected Builder name(String name) {
            this.name = name;
            return this;
        }

        protected Builder type(String type) {
            this.type = type;
            return this;
        }

        protected Builder innate(String innate) {
            this.innate = innate;
            return this;
        }
        protected Summoner build() {
            return new Summoner(this);
        }
    }
}