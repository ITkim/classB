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

4. MySql에 table 생성하기
```
 mysql> CREATE TABLE `CityExport` (
            `ID` int(11) NOT NULL AUTO_INCREMENT,
            `Name` char(35) NOT NULL DEFAULT '',
            `CountryCode` char(3) NOT NULL DEFAULT '',
            `District` char(20) NOT NULL DEFAULT '',
            `Population` int(11) NOT NULL DEFAULT '0',
            PRIMARY KEY (`ID`));

   mysql> CREATE TABLE `CityExportStaging` (
            `ID` int(11) NOT NULL AUTO_INCREMENT,
            `Name` char(35) NOT NULL DEFAULT '',
            `CountryCode` char(3) NOT NULL DEFAULT '',
            `District` char(20) NOT NULL DEFAULT '',
            `Population` int(11) NOT NULL DEFAULT '0',
            PRIMARY KEY (`ID`));
```

5. 맵리듀스 실행을 위한 환경 설정 추가 및 확인
```
$export CLASSPATH=hadoop의 lib 경로 

$CLASSPATH

제공받은 WordCount.java와 Hadoop 튜터리얼에서 제공하는 두가지 예제로 실습해 보기
   http://hadoop.apache.org/docs/current/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html#Example:_WordCount_v1.0

- 제공받은 예제의 test 데이터 - 위키백과 표제어
   https://ko.wikipedia.org/wiki/%ED%8A%B9%EC%88%98:%EB%AA%A8%EB%93%A0%EB%AC%B8%EC%84%9C
   
   curl https://dumps.wikimedia.org/kowiki/latest/kowiki-latest-all-titles-in-ns0.gz | zcat > kowiki_titles 
   
- 튜토리얼에서 제공받은 test 데이터 - test 파일 생성 및 서울시 공공데이터 

```
ewafawe
