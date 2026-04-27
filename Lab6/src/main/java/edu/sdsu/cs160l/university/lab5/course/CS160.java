package edu.sdsu.cs160l.university.lab5.course;

import java.util.*;

import edu.sdsu.cs160l.university.lab5.course.Course;
//TODO make this singleton
public class CS160 implements Course{
    private CS160(){}
    private static class CS160Holder{
        private static final CS160 INSTANCE = new CS160();
    }
    public static CS160 getInstance(){
        return CS160Holder.INSTANCE;
    }
    @Override
    public String courseName() {
        return "CS160";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Intermediary Java Programming");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>(Collections.singletonList("CS150"));
    }
}
