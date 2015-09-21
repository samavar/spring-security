create table users(id INTEGER NOT NULL PRIMARY KEY,
					username VARCHAR(100) NOT NULL,
					password VARCHAR(100) NOT NULL,
					enabled BIT DEFAULT TRUE NOT NULL);
					
create table authorities(id INTEGER NOT NULL PRIMARY KEY,
						username VARCHAR(100) NOT NULL,
						authority VARCHAR(100) NOT NULL);