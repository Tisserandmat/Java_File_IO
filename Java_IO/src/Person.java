public class Person {

    private String name;
    private String github;

    public Person(String name, String github) {
        this.name = name;
        this.github = github;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", github='" + github + '\'' +
                '}';
    }
}
