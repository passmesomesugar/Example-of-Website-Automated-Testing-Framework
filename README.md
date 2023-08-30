This is a test automation project written in Java.   
`Commands to run the project.txt` includes commands to run test suites with different options (headless browser for example).  
Run *sanity* tests:   

`mvn -Dselenide.headless=true -Dgroups=sanity clean test`

Run *all* tests:   

`mvn -Dgroups=all clean test`

Run *api* tests:   

`mvn -Dgroups=api clean test` 

Keep in mind, above mentioned commands may not run from bash,or other   
*nix systems shell due to path name (`\` vs `/`) conflict.

Please ensure to set a valid username and password in a "prod-env.properties" file and put it in "\src\test\resources",  
with the following contents in order for tests to run:        

user.login.name=some_real_username  
user.password=some_real_password  
excluded.websites.to.check=youtube linkedin /user/ ~ or any other websites you don't want to check separated by space.  

