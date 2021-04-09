Create database motorsport;
use motorsport;

CREATE TABLE vitrina (
  Id bigint(20) NOT NULL AUTO_INCREMENT,
  Marca varchar(150) NOT NULL,
  Modelo varchar(150) NOT NULL,
  Cilindraje int(11) NOT NULL,
  Precio int(11) NOT NULL,
    PRIMARY KEY (Id);
);

INSERT INTO vitrina (Id, Marca, Modelo, Cilindraje, Precio) VALUES
(1, 'Kawasaki', 'Z900', 900, 37000000),
(2, 'Yamaha', 'R1', 1000, 74000000);
