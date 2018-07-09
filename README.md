# AWS for Java Developers



### **Part 1 - EC2**

Create KeyPair 

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#having-ec2-create-your-key-pair

Create environment

https://console.aws.amazon.com/codestar/home?region=us-east-1#/quickstart/details?category=webapp&compute=ec2&framework=javaspring

### Part 2 - Beanstalk

https://console.aws.amazon.com/codestar/home?region=us-east-1#/quickstart/details?category=webapp&compute=eb&framework=javaspring

### Part 3 - Serverless

https://console.aws.amazon.com/codestar/home?region=us-east-1#/quickstart/details?category=webservice&compute=lambda&framework=javaspring

**Generate api**

Petstore api gateway example - https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-create-api-from-example.html

(Petstore application source - https://github.com/aws-samples/api-gateway-secure-pet-store)

Generate petstore api https://console.aws.amazon.com/apigateway/home?region=us-east-1#/apis/create

https://docs.aws.amazon.com/apigateway/latest/developerguide/generate-java-sdk-of-an-api.html

https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-call-apigateway-generated-java-sdk.html



### Appendix A - Script to install Maven locally on Codestar EC2

(Open Git bash)

sudo yum -y update
sudo yum -y install java-1.8.0-openjdk-devel

sudo update-alternatives --config java
sudo update-alternatives --config javac

java -version
javac -version

sudo wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo
sudo yum install -y apache-maven

cd <your_project_name>

mvn test

### Appendix B - Script to commit and push on Codestar EC2

git commit -a

(Add comment and save (CTRL+Z))

git push