package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        /*
        NOTES:

        CDS
        speed: 200-500 rpm
        stores audio data
        capacity: 700MB of data
        can be played in a CD or DVD player

        DVDS
        speed: 570-1600 rpm
        universal storage
        capacity: 17GB of data
        can only be played in DVD player

        FIELDS THEY HAVE IN COMMON:
        title - abstract
        author - abstract
        discType - abstract
        capacity - interface - constant HashMap, use discType to access
        speed - interface - constant HashMap, use discType to access

        files -  ArrayList<File> - name (abstract), size (abstract)

        spinDisc() - interface
        readData() - interface
        writeData() - interface

        */

        // TODO: Declare and initialize a CD and a DVD object.
        CD  selectedAmbientWorks = new CD("Selected Ambient Works 85-92", "Aphex Twin", "CD", "Ambient", "Richard D. James");
        File xtal = new File("Xtal", 25, "audio");
        File tha = new File("Tha", 42, "audio");
        File pulsewidth = new File("Pulsewidth", 19, "audio");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        selectedAmbientWorks.spinDisc();
        // we have to write data before we read data or the files are not added to the file list
        selectedAmbientWorks.writeData(xtal);
        selectedAmbientWorks.writeData(tha);
        selectedAmbientWorks.writeData(pulsewidth);
        selectedAmbientWorks.readData();

    }
}
