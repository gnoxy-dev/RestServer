from jboss/wildfly:11.0.0.Final

COPY target/RestServer-0.1-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/RestServer.war

LABEL com.gnoxy.tpsw="true", com.gnoxy.maintainer="gnoxy <dev@gnoxy.com>", com.gnoxy.base-image="jboss/wildfly:11.0.0.Final"