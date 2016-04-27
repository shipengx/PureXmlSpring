#!/bin/bash

echo "deploying Pure Xml Spring Application..."

#remove the old folder and application war file from tomcat
rm -rf /opt/apache-tomcat/webapps/PureXmlSpring.war
rm -rf /opt/apache-tomcat/webapps/PureXmlSpring

cp ../dist/PureXmlSpring.war   /opt/apache-tomcat/webapps






