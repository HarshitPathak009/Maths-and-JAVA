# Maths-and-JAVA
This repository contains CUI based maths numerical questions
#What is Load Balancing?

The data we are shown on a website or even login information on a particular website is stored in physical devices called servers. These servers send us the data requested by our web browsers for us to use from that particular website.
A server provides data to many nodes(users of a website or web application) at the same time i.e. many users are connected to the same server. The number of users connected to a server at a particular time is referred to as the traffic on that server for that time.
A server can handle a particular number of nodes(users) at a given time. Chances are that the traffic on a particular website cannot be handled by a server alone, eg: Google has 63,000 users per second, one server cannot handle so many google searches at a time, for this reason, companies have multiple servers located at different regions. This allows the ease to distribute the data from servers with ease and in a faster manner. 



Any server can interact with a certain number of users. If the number of users on the server increases than the specified limit, it may slow down in sending data or even crash. Consider the example of the image above. We have 6 users connected to 2 servers.  User 1 and User 3 are connected to Server 1 while the remaining four users are connected to Server 2. In such cases, the servers have the right amount of traffic that they can control and function properly. Even though we can see that Server 2 has 4 users accessing data from it, it works as per the requirement as it can handle that many users.
There are so many servers for the same website. Which user will connect to which server? Well, the users are connected to the servers depending upon certain algorithms or sometimes the regions from where the website is accessed. The users can be randomly connected to the server so chances are they might not be connected as per the requirement and one of the servers will be connected to more users than the specified number it can handle. In such a scenario either the server slows down or it crashes. Eg:- Let us consider this very own website. The server of this website can bear a certain number of users. There may be many people accessing different courses from this website at the same time and it is all handled by the server. In certain scenarios chances are that one of the servers of this website may have an extreme number of users accessing courses, causing the server to overload.
Let us consider Google. We all use Google search in our day to day life (average 3-4 google searches per day). Google has the highest traffic than any other website, hence there is a great chance of Google servers crashing. It may happen for various reasons but most likely it would be because of excessive users trying to retrieve data from the same server. This doesn't happen though, Why?

To overcome the problem of server overloading and traffic control a process known as Load Balancing is used. Load Balancing uses certain hardware/software to distribute users to different servers in such a way that no server bears extreme load upon itself. Load balancing also checks for active servers to avoid the users connecting to a shutdown server or a server under maintenance.
Devices/ Softwares that implement the concept of load balancing i.e. direct individual nodes to servers based on certain algorithms or sometimes needs are known as Load Balancers.

Technical Definition:-Load balancing is the process of distributing network traffic across multiple servers.
Load Balancers ensures that no single server bears too much load demand, this is done by spreading the load evenly. 
Load balancing techniques can optimize the response time for each task, avoiding unevenly overloading compute nodes while other compute nodes are left idle. Also known as a server farm or server pool.
