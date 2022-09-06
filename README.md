This is a test automation project written in Java.   
`Commands to run the project.txt` includes commands to run test suites with different options (headless browser for example).  
Run all *sanity* tests:   
mvn -Denv=prod-env -Dselenide.headless=true -Dsurefire.suiteXmlFiles=src\test\resources\sanity.xml clean test


Keep in mind, above mentioned commands may not run from bash,or other   
*nix shell due to path name (`\` vs `/`) conflict.

Please set a valid username and password in a "prod-env.properties" file and put it in "\src\test\resources",  
with the following contents:        

user.login.name=some_real_username  
user.password=some_real_password  
excluded.websites.to.check=youtube linkedin /user/ ~ or any other websites you don't want to check separated by space.  

