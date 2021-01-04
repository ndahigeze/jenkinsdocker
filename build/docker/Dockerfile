FROM jenkins/jenkins:2.222.4
RUN useradd -ms /bin/sh newuser
# where
# -m -> Create the user's home directory
# -s /bin/bash -> Set as the user's
# default shell
USER newuser

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

ENV JAVA_OPPS -Djenkins.install.runSetupWizard=false