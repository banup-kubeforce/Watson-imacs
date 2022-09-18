DROP TABLE IF EXISTS inventory;

CREATE TABLE inventory (
 id INT AUTO_INCREMENT PRIMARY KEY,
 name varchar(250),
 inventoryid varchar(250),
 description varchar(250),
 quantity varchar(250)
);