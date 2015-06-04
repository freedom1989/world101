# world101
a template project using Spring framework

## how to setup environment for development

1. run the following commands

  ```
  git clone https://github.com/freedom1989/world101.git
  cd world101
  mvn eclipse:eclipse
  ```
2. open your eclipse, choose 'File->Import...->projects from git->existing local repository->add...', then choose the root folder of this project(the folder contains '.git'). check 'Import existing projects' then 'next'. Make sure that all the projects are checked, then 'finish'.
  if you can't find 'projects from git' when importing project, please install [egit](http://www.eclipse.org/egit/) plugin for your eclispe.
3. create tomcat server.
  * you need to download tomcat 8.0 first and unzip it to any directory(say $TOMCAT_HOME).
  * open your eclipse, choose 'file->new->others...->server', choose 'Apache->Tomcat v8.0 server', if you need to specify 'Tomcat Installation Directory', choose your tomcat home directory, say $TOMCAT_HOME. 
  * in 'Add and Remove' step, add 'world101-web-front' to the 'configured'. then click 'finish'
  if no problem, you can see the tomcat server in 'Servers'
4. start tomcat server via eclipse. (right click tomcat server in 'Servers' panel, click 'Start')
5. visit the 'hello world' example via http://localhost:8080/world101-web-front/helloWorld/
