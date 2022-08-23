package Interfaces;

public interface ILearn {


//This is an interface created that represents a behaviour signifying a Martial artist learning how to fight. Now, we have our
// MMArtist parent class, but the MMArtistPro does not need to learn, only does the MMArtistSemiPro and MMArtistAmateur classes need this interface. As however all 3
// are a child class of the MMArtist parent class, we have created this interface to apply to 2 and not all 3 of the different types of fighters.

String learn (int timeLearning);

}