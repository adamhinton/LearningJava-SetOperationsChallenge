package dev.lpa;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);

    }

    private static void sortAndPrint(String header, Collection<Task> collection){
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint (String header, Collection<Task> collection, Comparator<Task> sorter){
        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

    public static Set<Task> getUnion(Set<Task> setA, Set<Task> setB){
        Set<Task> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);

        return unionSet;
    }

    public static Set<Task> getIntersect(Set<Task> setA, Set<Task> setB){
        Set<Task> intersectionSet = new HashSet<>();



        return intersectionSet;
    }

}

// I'm a new manager of a team of three : Ann, Bob, Carol
// Each has a set of tasks. No good way to know who's working on what
// I've asked them to submit to me what they're owrking on
// I also have a master set of tasks which my boss sent to me

// Questions:
// What's the full task list?
    // The full list of all tasks from mgr, and any additional tasks the EEs have that aren't on the list
// Which tasks belong to at least one team member?
// Which tasks still need to be assigned?
// Which tasks are assigned to multiple EEs?

//Create three methods on main
    // DONT MUTATE PARAMETERS. ***RETURN NEW SET***
// Main.getUnion
    // takes List of Sets, returns union of all the sets
// Main.getIntersect
    // takes two Sets, returns intersection of the sets
// Main.getDifference
    // takes two Sets, removes second arg's sets from the first