package cn.lk.sbmbp.smp.entity;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/6/10
 * @desc IntelliJ IDEA: IntelliJ IDEA
 */
public class Person {
    private final String name;
    private       String location;
    private       String job;
    private       String habit;

    private Person(Builder builder) {
        name = builder.name;
        location = builder.location;
        job = builder.job;
        habit = builder.habit;
    }

    public static final class Builder {
        private String name;
        private String location;
        private String job;
        private String habit;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder habit(String habit) {
            this.habit = habit;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", job='" + job + '\'' +
                ", habit='" + habit + '\'' +
                '}';
    }
}
