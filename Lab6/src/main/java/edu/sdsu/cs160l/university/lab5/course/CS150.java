package edu.sdsu.cs160l.university.lab5.course;

import java.util.*;

import edu.sdsu.cs160l.university.lab5.course.CS150;
import edu.sdsu.cs160l.university.lab5.course.Course;

public class CS150 implements Course{
    private CS150(){}
    private static class CS150Holder{
        private static final CS150 INSTANCE = new CS150();
    }
    public static CS150 getInstance(){
        return CS150Holder.INSTANCE;
    }
    @Override
    public String courseName() {
        return "CS150";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Java Programming", "ZyBooks");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>();
    }
}
