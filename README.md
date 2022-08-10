This is an example project for test automation. 
Selenide, TestNG are used as primary technologies.
`CLI commands.txt` includes commands to run test suites with different options (headless browser for example).
Keep in mind, above mentioned commands may not run from bash, or other *nix shell due to path name (`\` vs `/`) conflict.
Windows should run everything fine.  
 Please set a valid username and password in a "prod-env.properties" file and put it in "\src\test\resources".
 File contents:
 user.login.name=some_real_username
 user.password=some_real_password
 excluded.websites.to.check=youtube linkedin /user/ ~ or any other websites you don't want to check separated by space.
