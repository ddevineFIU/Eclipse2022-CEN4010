DROP TABLE IF EXISTS 'books'; 

	SET characterset_client = utf8mb4;
CREATE TABLE 'books' ( 
	'id' int (11) NOT NULL,
	 'name' varchar(45) NOT NULL,
	 'author' varchar(45) NOT NULL,
	 PRIMARY KEY ('id')
);