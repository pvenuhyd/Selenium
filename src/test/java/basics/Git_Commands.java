package basics;

public class Git_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 git branch
		 
		 git clone "repository URL"
		 
		 git checkout master
		 
		 git checkout venu_local
		 
		 git checkout -b "venu_local"
		 
		 git status
		 
		 git pull origin master
		 
		 git add .
		 
		 git commit -m "adding code"
		 
		 git push origin bhanu_local
		 
		 Creating Tags

Git uses two main types of tags: lightweight and annotated.

Annotated Tags: To create annotated tag in git you can just run following simple commands on your terminal.

$ git tag -a v2.1.0 -m "xyz feature is released in this tag."
$ git tag
v1.0.0
v2.0.0
v2.1.0
The -m denotes message for that particular tag. We can write summary of features which is going to tag here.

Lightweight Tags:

The other way to tag commits is lightweight tag. we can do it in the following way:

$ git tag v2.1.0
$ git tag
v1.0.0
v2.0.0
v2.1.0
Push Tag

To push particular tag you can use below command:

git push v1.0.3
or if you want to push all tags then use below command:

git push --tags
List all tags: To list all tags use following command

git tag

git config http.postBuffer 524288000

git config --global http.postBuffer 1048576000

git config --get http.postBuffer

git config --get http.postBuffer
		 
		 */

	}

}
