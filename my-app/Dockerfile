FROM tomcat:8.0

RUN  rm -rf /usr/local/tomcat/webapps/ROOT*
COPY target/*.war /usr/local/tomcat/webapps/
RUN  mv /usr/local/tomcat/webapps/*.war mv /usr/local/tomcat/webapps/ROOT.war
