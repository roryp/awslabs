# AWS Labs for Java Developers

This Lab consists of 4 Parts.

In all the Parts select the following settings:

- Host your Applications in **North-Virginia** (us-east-1) 

- Use **AWS CodeCommit** to host your code

- Create a **Cloud9** instance as your **IDE**

  

For Part 1 and 2, you will first need to create a EC2 **keyPair** ( if you don't already have one) in order to link to a EC2 server. This keyPair can be used to SSH into your server later on. Don't forget to save the keyPair somewhere safe.

- https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#having-ec2-create-your-key-pair



### Part 1 - Create a CodeStar project with a EC2 server

**Setup** - Create EC2 CodeStar project with cloud9 IDE and EC2 server hosting a Spring Web app on Tomcat:

- https://console.aws.amazon.com/codestar/home?region=us-east-1#/quickstart/details?category=webapp&compute=ec2&framework=javaspring

#### LAB

The EC2 server hosts a tomcat server with a Spring web application. The Spring application serves a static HTML page. **Your goal** is to change this page to your personal home page and trigger the Code Pipeline deployment. 

See Appendix **A** for instructions on how to push your code via GIT



### Part 2 - Beanstalk CodeStar project with Autoscaling group

**Setup** - Create CodeStar project with cloud9 IDE and single BeanStalk Application with Spring/Tomcat :

- https://console.aws.amazon.com/codestar/home?region=us-east-1#/quickstart/details?category=webapp&compute=eb&framework=javaspring

The Beanstalk application hosts the same configuration as Part 1 - but using a managed Server configuration. 

#### Lab

Your **goal** is to Increase the Auto-scaling group to Min 2 - Max 4 servers and a load balancer

https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.managing.as.html 



### Part 3 - Serverless

**Setup** - Create Lambda CodeStar project with cloud9 IDE and API gateway

- https://console.aws.amazon.com/codestar/home?region=us-east-1#/quickstart/details?category=webservice&compute=lambda&framework=javaspring

#### Lab

Call the "Hello world" REST services via API gateway tests



### Part 4 - Calling an 3rd party API 

Use the Amazon API Gateway console to create and test a simple API with the HTTP integration for a PetStore website 

- https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-create-api-from-example.html



**Setup** **- **Generate Petstore Server api

- https://console.aws.amazon.com/apigateway/home?region=us-east-1#/apis/create



#### Lab

##### Create a Java client sdk for your Petstore API

To call your Petstore API via Java , you must use a Java Client SDK for your API.

A pre-setup maven project for the PetStore Java client API is provided here - https://github.com/roryp/awscodestar/tree/master/apigateway/petstore

Your **goal** is to change the supplied Maven project to point to your API endpoint:

1. Change petstore.petstoreClientBuilder#DEFAULT_ENDPOINT to your endpoint

2. To execute the maven tests run:

   ```bash
   mvn exec:java -Dexec.mainClass="petstore.petstoreTester"
   ```

   

**(Optional)** 

To generate the Java Client API from scratch you can follow these steps:

https://docs.aws.amazon.com/apigateway/latest/developerguide/generate-java-sdk-of-an-api.html





### Appendix A - Script to commit and push on CodeStar EC2

```bash
git commit -a

(Add comment and save (CTRL+Z))

git push
```



### Appendix B - Script to install Maven locally on Codestar EC2

(Open Git bash)

```bash
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
```



## Appendix C - Links

1. https://github.com/aws-samples/aws-developer-workshop
2. https://github.com/aws-samples/aws-serverless-workshops
3. [https://github.com/aws-samples/api-gateway-secure-pet-store](https://github.com/aws-samples/api-gateway-secure-pet-store)