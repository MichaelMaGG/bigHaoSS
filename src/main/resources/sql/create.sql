create table userinfo (
id INTEGER NOT NULL AUTO_INCREMENT,
groupid INTEGER,
name VARCHAR(10),
gender INTEGER,
picture VARCHAR(255),
idnum VARCHAR(15),
phonenum VARCHAR(15),
school VARCHAR(50),
distribute VARCHAR(20),
performance VARCHAR(20),
report VARCHAR(20),
elanguage VARCHAR(10),
training VARCHAR(10),
atpl VARCHAR(10),
newmenber VARCHAR(10),
cbt VARCHAR(10),
fixed VARCHAR(10),
motorial VARCHAR(10),
now VARCHAR(10),
remark VARCHAR(100),
PRIMARY KEY (id)
);

create table groupinfo (
id INTEGER,
name VARCHAR(50)
);
