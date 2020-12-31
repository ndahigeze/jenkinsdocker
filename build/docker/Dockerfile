FROM jenkins/jenkins:2.222.4

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

ENV JAVA_OPPS -Djenkins.install.runSetupWizard=false