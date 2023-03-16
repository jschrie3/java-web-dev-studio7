package org.launchcode.studio7;

public class CD extends BaseDisc {

    // TODO: Implement your custom interface.
    // don't need to do because the interface was implemented at the abstract class level

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    // FIELDS
    private final String genre;
    private final String producer;
    // other fields are inherited from BaseDisc

    // CONSTRUCTORS
    public CD(String title, String author, String discType, String genre, String producer) {
        super(title, author, discType);
        this.genre = genre;
        this.producer = producer;
    }

    // METHODS
    // format printed information about the disc
    @Override
    public String toString(){
        // use StringBuilder to build tracklist
        StringBuilder fileList = new StringBuilder();
        for (File file : getFiles()) { // for each file in files
            fileList.append(file); // add files to fileList
        }
        // use super to call methods from BaseDisc class
        return super.toString() +
                "\nGenre: " + genre +
                "\nProduction Company: " + producer +
                "\nTrack List:\n" +
                fileList;
    }

    // describe the content of the disc
    @Override
    public void readData(){
        System.out.println(this); // where this is the current object being passed to the method
    }

    @Override
    public void runFile(File file){
        System.out.println("\nNow playing:\n" +
                file.getName() + " by " + getAuthor());
    }

    @Override
    public void writeData(File file) {
        // determine file type
        if (!file.getFileType().equals("audio")) {
            System.out.printf("The " + file.getFileType() +" file type cannot be written to a "
                    + getDiscType() + "."); // print message
            // after we determine it's a CD, get the capacity
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("There is not enough storage capacity on the " + getDiscType()
                    + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
        }
    }

}
