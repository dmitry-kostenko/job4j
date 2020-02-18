package ru.job4j.collection;

import java.util.Objects;

public class SortUser implements Comparable<SortUser> {
    private String name;
    private int age;

    public SortUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(SortUser o) {
        int rsl = name.compareTo(o.name);
        if (rsl != 0) {
            return rsl;
        }
        rsl = age - o.age;
        if (rsl != 0) {
            return rsl / Math.abs(rsl);
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SortUser user = (SortUser) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
