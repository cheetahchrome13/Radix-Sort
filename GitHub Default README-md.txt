# Project Title

One Paragraph of project description goes here

Radix Sort is a simple program that creates an array of random unordered integers
and sorts it using a Radix algorithm method. The ordered array is formatted and displayed, 
the time to sort the array and the time to print the array are both displayed.

This image will display as your example output. Name the image README.jpg in your project folder.

![Sample Output](README.jpg)

## Analysis Steps

The program needed an array of unsorted randoms and a radix method to sort it. A simple method
to print out the results finishes it off. 

### Design

I made a class for every required task, and I tried some newer java 8 functional interface techniques
to pass a method reference as an argument to the timer class, which starts the timer, then makes the passed
method call to the radix sort method until it is done, then stops timer and returns the elapsed time to 
sort the array. I also experimented with various other newer java 8 features to reduce code and increase 
readability.

### Testing

I tested this program at every block of code that could be tested. This was a simple program, but some of 
the techniques I attempted were challenging to figure out how to implement. It took a lot of experimenting and 
testing to get the syntax and data types right, but I figured it out.


## Notes

I experimented with java 8 functional interfaces and newer syntax.

## Do not change content below this line
## Adapted from a README Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
