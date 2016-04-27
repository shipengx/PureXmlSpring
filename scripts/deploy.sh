#!/bin/bash

echo "deploying Pure Xml Spring Application..."

#remove the old folder and application war file from tomcat
rm -rf /opt/apache-tomcat/webapps/PureXmlSpring-1.0-SNAPSHOT.war
rm -rf /opt/apache-tomcat/webapps/PureXmlSpring-1.0-SNAPSHOT

cp ../dist/PureXmlSpring-1.0-SNAPSHOT.war   /opt/apache-tomcat/webapps






