package edu.sdsu.cs160l.university.course;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CS340 implements Course {
    private CS340(){}
    private static class CS340Holder{
        private static final CS340 INSTANCE = new CS340();
    }
    public static CS340 getInstance(){
        return CS340Holder.INSTANCE;
    }
    @Override
    public String courseName() {
        return "CS340";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Data Structure and algorithms", "0 cost course");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>(Arrays.asList("CS210", "CS330"));
    }
}
