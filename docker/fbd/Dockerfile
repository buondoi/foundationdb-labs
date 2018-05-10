FROM centos:7

MAINTAINER tamnguyen1560@gmail.com

RUN curl -SLO "https://www.foundationdb.org/downloads/5.1.7/rhel7/installers/foundationdb-clients-5.1.7-1.el7.x86_64.rpm" \
    && curl -SLO "https://www.foundationdb.org/downloads/5.1.7/rhel7/installers/foundationdb-server-5.1.7-1.el7.x86_64.rpm" \
    && rpm -ivh foundationdb-clients-5.1.7-1.el7.x86_64.rpm \
    && rpm -ivh foundationdb-server-5.1.7-1.el7.x86_64.rpm \
    && rm foundationdb-clients-5.1.7-1.el7.x86_64.rpm foundationdb-server-5.1.7-1.el7.x86_64.rpm

EXPOSE 4500




