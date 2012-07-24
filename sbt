#!/bin/bash

cat /dev/null | java -Xmx1G -XX:MaxPermSize=250m -Dsbt.log.noformat=true -Dbuild.number="$BUILD_NUMBER" -Dbuild.vcs.number="$BUILD_VCS_NUMBER" -jar sbt-launch.jar "$@"
