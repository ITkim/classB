# classB

1. 클래우데라에서 git 사용을 위한 버전업을 위한 설정<br>

```
wget http://springdale.math.ias.edu/data/puias/computational/6/x86_64/git-1.8.3.1-1.sdl6.x86_64.rpm <Br>
wget http://springdale.math.ias.edu/data/puias/computational/6/x86_64/perl-Git-1.8.3.1-1.sdl6.noarch.rpm<br>
sudo yum remove git -y <br>
sudo yum localinstall git-*.rpm perl-Git-*.noarch.rpm -y <br>
```
 
2.  SSL Error 문제 발생시 해결책 <br>
```
#yum update -y nss curl libcurl
```

3. hive 연동을 위한 추가 설정<br>
```xml
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
```

4. 맵리듀스 실행을 위한 환경 설정 추가 및 확인
1. 환경 
```
$export CLASSPATH=hadoop의 lib 경로 

$CLASSPATH


```
