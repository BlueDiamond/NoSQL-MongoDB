Mongo DB:

# to run MongoDB execute mongod, db path /home/java/nosql/data/db and enable rest web services
mongod --dbpath /home/java/nosql/data/db --rest
or
/home/java/nosql/mongodb/mongodb-osx-x86_64-2.2.2/bin/mongod --dbpath /home/java/nosql/data/db --rest
---

/home/java/nosql/mongodb/mongodb-osx-x86_64-2.2.2/bin/mongod --dbpath /home/java/nosql/data/db
---
# to run MongoDB execute mongod - default db path /data/db
/home/java/nosql/mongodb/mongodb-osx-x86_64-2.2.2/bin/mongod
---



---
# Connect to MongoDB: execute mongo
/home/java/nosql/mongodb/mongodb-osx-x86_64-2.2.2/bin/mongo
---
DB name: sedan


---
web console after starting the db in localhost
http://localhost:28017/

admin web console waiting for connections on port 28017
waiting for connections on port 27017
---

# set MongoDB Home $MONGODB_HOME
MONGODB_HOME=/home/java/nosql/mongodb/mongodb-osx-x86_64-2.2.2

add to path in .bash_profile ($MONGODB_HOME/bin)
---
sites:
http://www.mkyong.com/mongodb/mongodb-hello-world-example/

--------------------------------------------------------------------------------------------------
MySQL 5.5:
---------

to start MySQL server:
D:\installs\MySQL\mysql-5.5.27-win32\bin\mysqld --console
---

--palani is username and admin123 is password
GRANT ALL PRIVILEGES ON *.* to 'palani'@'%' IDENTIFIED BY 'admin123';
% means log in from any system
---

CREATE TABLESPACE sedan;

GRANT ALL ON sedan.* to 'palani'@'%' IDENTIFIED BY 'admin123';
---
mysqladmin -u root -p shutdown 
mysqladmin -p shutdown 
---
to update root user password, after logging in as palani:
UPDATE mysql.user SET Password=PASSWORD('admin123') WHERE User='root';
--------------------------------------------------------------------------------------------------
