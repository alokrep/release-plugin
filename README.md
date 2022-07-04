# Maven Release Plugin and Github as repo

This repository is a sample project to show you a usage of [the maven release plugin](https://github.com/alokrep/release-plugin) 
in a dummy Java application.


# Release your maven project using GitHub actions

We will see how you can use maven release inside a GitHub actions, to release your Java project.



## Sample repository

I will use a sample repository to illustrate how this GitHub actions. The repository can be found here: https://github.com/alokrep/release-plugin


## Prepare your repository

Before you even begin setting up this github action, you would need to set up your pom.xml first to be ready for maven releases. We recommend you to refer to the maven release plugin documentation for more details: https://maven.apache.org/maven-release/maven-release-plugin/

#### Configure the SCM

See the pom.xml for using Github as SCM(Use SSH): 

```
<properties>
    <project.scm.url>ssh://git@github.com:alokrep/release-plugin.git</project.scm.url>
    <repository-name>release-plugin</repository-name>
    <repository-owner>alokrep</repository-owner>
    <nexus-repo-id>localSnap</nexus-repo-id>
    <nexus-repo-name>releasesRepo</nexus-repo-name>
    <branch-name>${nexus-repo-name}</branch-name>
  </properties>
```


Next, you need to add a Github PAT(Personal Access Token) to /.m2/settings.xml. Generate your [PAT](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) : 

```
<servers>
        <server>
            <id>github</id>
            <password>COPY/PASTE yours</password>
        </server>
</servers>
```

Run in this order. 
```
mvn release:prepare -DdryRun
mvn release:prepare
mvn release:perform
mvn release:clean
```




