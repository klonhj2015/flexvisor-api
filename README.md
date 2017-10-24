# flexvisor-api for bundle osgi application.
1. In your bundle pom.xml, you should add config as follows:

    <dependency>
    	<groupId>cn.com.certusnet</groupId>
    	<artifactId>flexvisor-api</artifactId>
    	<version>0.0.1-SNAPSHOT</version>
    </dependency>

  <build>
  	<plugins>
  		<plugin>
  			<groupId>org.apache.felix</groupId>
  			<artifactId>maven-bundle-plugin</artifactId>
  			<configuration>
  				<instructions>
  					<Export-Package>cn.com.certusnet.api.types</Export-Package>
  				</instructions>
  			</configuration>
  		</plugin>
  	</plugins>
  </build>


