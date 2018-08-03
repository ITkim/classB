# classB

1. 클래우데라에서 git 사용을 위한 버전업을 위한 설정<br>

wget http://springdale.math.ias.edu/data/puias/computational/6/x86_64/git-1.8.3.1-1.sdl6.x86_64.rpm <Br>
wget http://springdale.math.ias.edu/data/puias/computational/6/x86_64/perl-Git-1.8.3.1-1.sdl6.noarch.rpm<br>
sudo yum remove git -y <br>
sudo yum localinstall git-*.rpm perl-Git-*.noarch.rpm -y <br>
<br><br>
  
2.  SSL Error 문제 발생시 해결책 <br>
#yum update -y nss curl libcurl


---------------------<br>

3. hive 연동을 위한 추가 설정<br>
 <dependencies>
  	<dependency>
  		<groupId>org.apache.hive</groupId>
  		<artifactId>hive-jdbc</artifactId>
  		<version>1.1.0</version>
  	</dependency>  	
  		<dependency>
  		<groupId>org.apache.hadoop</groupId>
  		<artifactId>hadoop-common</artifactId>
  		<version>2.6.0</version>
  		<exclusions>
	        <exclusion>
	            <artifactId>jdk.tools</artifactId>
	            <groupId>jdk.tools</groupId>
	        </exclusion>
    	</exclusions>
  	</dependency>

  </dependencies>