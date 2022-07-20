#Multiple MicroServiceCode Optimizations & Code Maintenance 

##Abstract: 
One of the Framework team’s goals should be to provide new tools and means to develop MicroServices/MicroApp with a better way to manage code, reuse code and to simplify assembling executable jar files for existing and new software features.  One way is to centralize the Models, JPA Repositories, Services and maybe even the RestFul Controllers while allowing for the selection of only what your new application requires.  Part of this can be accomplished during the compilation and JAR file assembly.   Much more could be done by first generating the entity objects from the database itself, and maybe the repository and service objects.   The later two are not being covered in the document.
  
##Environment:  Many of the current entities (JAVA Objects that represent database tables) are organized in a folder structure contained in a single repository.  Having duplicate entities that represent SQL tables or NoSql documents in numerous applications only worsens.   In some cases and in some development organizations these collections of entities grow rather large.   It was recently counted that in the emr Oracle Schema that 500+ tables exist and in the entire database 5900+- tables exist. Having to create and recreate these Java entities multiple times for the numerous MircoServices/MicroApps will become a major problem.   The hackathon task proposes an improvement on the current way we are doing things in a single siloed application or a MicroService pattern of including all of the JAVA entities in each application.   We are proposing including only what is needed and still having the option of ‘write once, and use many times’,  this is what JAVA was intended as the ‘savior’ in application development, but not instead of just for the SDK, now at a much smaller level the code itself..

##Problem: Current use of tools like Maven and Gradle when using JAVA build archives of either WAR file or uber JAR files to assemble applications, micro-service.   

##Benefits:
Smaller executable JAR files
Better reuse of previously written code
Higher ROI
Higher ease of testing
Faster code reviews
Better security
Small Virtual Machines, meaning bigger savings on of site hosting

##Collaborators:   
Douglas Ahlquist 
Keith Williams 

##Strategy: 
What we learned:


Code: Code for this hackathon task combines third party projects and projects going back more than several years, but have been modified slightly for the inclusion as purposed as a demonstration on how we could use these same patterns. 
