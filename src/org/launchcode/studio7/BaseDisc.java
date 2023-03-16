package org.launchcode.studio7;

import java.util.ArrayList;
public abstract class BaseDisc implements OpticalDisc {

    // FIELDS
    private final String title;
    private final String author;
    private final String discType;

    // speed and capacity are not set by the constructor as parameters
    // instead they call on the constants in the interface to get the discType
    // by giving the key (CD or DVD) and getting the constant value
    private final int speed;
    private final int capacity;
    private ArrayList<File> files = new ArrayList<>();

    // CONSTRUCTORS

    public BaseDisc(String title, String author, String discType) {
        this.title = title;
        this.author = author;
        this.discType = discType;
        // get the speed and capacity from HashMaps in OpticalDisc interface based on discType
        this.speed = SPEEDS.get(discType);
        this.capacity = CAPACITIES.get(discType);
    }

    // GETTERS

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDiscType() {
        return discType;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    // TOSTRING METHOD
    public String toString() {
        return "\n" + discType + ":" +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nSpeed: " + speed + " rpm" +
                "\nStorage Capacity: " + capacity + "MB" +
                "\nAvailable Storage Space: " + getSpaceAvailable() + "MB";
    }

    // METHODS
    public int getSpaceUsed() {
        // set total to 0 to start
        int total = 0;
        for (File file : files) { // for each file in files arraylist
            total += file.getSize(); // add the size to the total
        }
        return total;
    }

    public int getSpaceAvailable() {
        return capacity - getSpaceUsed();
    }

    @Override
    public void spinDisc() {
        System.out.printf("The " + discType + " called " + title
                + " is spinning at " + speed + " rpm.");
    }


    // ABSTRACT METHODS
    // abstract keyword passes down the responsibility of defining the method to the subclasses
    // the interface requires that these methods be included, but we don't have to define them here
    // this way we can define them in the CD and DVD subclasses
   @Override
    public abstract void writeData(File file);

    @Override
    public abstract void readData();

    @Override
    public abstract void runFile(File file);




}
