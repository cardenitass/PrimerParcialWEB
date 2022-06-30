CREATE DATABASE ITICKET;
USE ITICKET;

CREATE TABLE ARTISTA(
	id INT primary key not null AUTO_INCREMENT,
    name varchar(15) not null
);

CREATE TABLE CONCIERTO(
	id INT primary key not null AUTO_INCREMENT,
    price int not null,
    date varchar(30) not null,
    capacity int not null,
    location varchar(50) not null,
    id_artist INT not null,
    foreign key(id_artist) references ARTISTA(id));
    
insert into ARTISTA(name)
VALUES("Billie Ellish"),
		("Kurt Cobain");
                
insert into concierto(date, location, capacity, price, id_artist)
	VALUES("2022/07/07","Heredia, Centro de Eventos Pedregal", 80000, 65000,1),
		("1990/10/11","San Jose, Estadio Nacional", 100000, 90000,2);
        
drop database ITICKET;