
# ucsb-cs56-webapp-catalog
A catalog of all of the webapps, which is itself also a webapp.



# Some webapps from M18 Mentors

| Mentor |  Webapp | Pitch   |
|--------|--------|----------|
| Nuan | ucsb-cs56-smartplanner | converting to-do list into a plan  |
| Wilson | ucsb-cs56-catfinder |  finding your next cat  |
| Derek | ucsb-cs56-image2text |  categorize your images   |
| Yunkai | ucsb-cs56-bookexchange | get free books with garbage you have  |
| Chandler | ucsb-cs56-musicplayer | listen to music in your browser  |
| Zihao | ucsb-cs56-shiftcoverer |  cover your shift  |
| Fuheng | ucsb-cs56-qrcodereader |  Read QR codes and Convert Data to QR codes  |
| Omer | ucsb-cs56-caloriecounter | Provide intuitive platform to manage nutition  |
| Conrad | ucsb-cs56-webapp-catalog | List all the webapps in the ucsb-cs56-webapps org  |

# In each repo in this org, please create

* /cs56/cs56.json
   * { "name":"ucsb-cs56-smartplanner" , "pitch":"converting to-do list into a plan" }
* /cs56/m18/README.md
   * Plain text (actually Markdown format), write down your ideas in whatever form you like.
   


# To use

| To do this | Do this |
| -----------|-----------|
| run the program | Type `mvn exec:java`.  Visit the web page it indicates in the message |
| check that edits to the pom.xml file are valid | Type `mvn validate` |
| clean up so you can recompile everything  | Type `mvn clean` |
| edit the source code for the app | edit files in `src/main/java`.<br>Under that the directories for the package are `edu/ucsb/cs56/pconrad`  |
| edit the source code for the app | edit files in `src/test/java`.<br>Under that the directories for the package are `edu/ucsb/cs56/pconrad`  |
| compile    | Type `mvn compile` |
| run junit tests | Type `mvn test` |
| build the website, including javadoc | Type `mvn site-deploy` then look in either `target/site/apidocs/index.html`  |
| copy the website to `/docs` for publishing via github-pages | Type `mvn site-deploy` then look for javadoc in `docs/apidocs/index.html` |	
| make a jar file | Type `mvn package` and look in `target/*.jar` |

| run the main in the jar file | Type `java -jar target/sparkjava-demo-01-1.0-jar-with-dependencies.jar ` |
| change which main gets run by the jar | Edit the `<mainClass>` element in `pom.xml` |


