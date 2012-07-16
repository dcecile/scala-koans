java -Dfile.encoding=UTF8 -Dsbt.ivy.home=./ivyrepo -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -jar `dirname $0`/sbt-launch.jar "$@"
