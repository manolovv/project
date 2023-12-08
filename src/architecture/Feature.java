package architecture;

public record Feature(FeatureName name) {

    @Override
    public String toString() {
        return "Feature{" +
                "name=" + name +
                '}';
    }
}
