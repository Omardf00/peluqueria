CREATE DATABASE peluqueriadb;

use peluqueriadb;

show TABLES;

insert into client(name, first_last_name, second_last_name, email, phone_number) 
values('Omar', 'Domínguez', 'Fuentes', 'omar@mail.com', '+34123456789'),
('Juan', 'Pérez', 'Fernández', 'juan@mail.com', '+34987654321'),
('Laura', 'Hernández', 'López', 'laura@mail.com', '+34741852963')

select *
from client;

insert into client_detail(direction, post_code, date_of_birth)
values ('C/Herrera nº 25', 123456, CURRENT_DATE),
('C/La Pescadora 456', 987654, CURRENT_DATE),
('C/La Noria nº 365', 654741, CURRENT_DATE);

select *
from client_detail;

update client
set client_detail_id = 1
where id = 1;

update client
set client_detail_id = 2
where id = 2;

update client
set client_detail_id = 3
where id = 3;

select *
from client;

insert into distributor(direction, email, name, phone_number) 
values('Polígono Industrial Candelaria', 'neobytessl@mail.com', 'NeoBytes SL', '+34789365214'),
('C/Los Amigos 124', 'juanbeauty@mail.com', 'Beauty Products Juan SA', '+34785412396'),
('C/Los dolores 45', 'lostintesdemaria@mail.com', 'Los Tintes de María SL', '+3446827319'),
('Avenida del Marítimo 78', 'tijeras&peines@mail.com', 'Tijeas y Peines SL', '+3476421983');

select *
from distributor;

insert into product(name, price, description, distributor_id)
values('Gomina', 15.50, 'Gomina de la marca 1', 1),
('Cera', 20.99, 'Cera de la marca 1', 1),
('Laca', 18.99, 'Laca de la marca 2', 2),
('Tijeras', 50.25, 'Tijeras de la marca 3', 3),
('Patillera', 40.45, 'Patillera de la marca 4', 4),
('Peine', 10.25, 'Peine de la marca 4', 4);

select *
from product;

insert into invoice(client_id) 
values(1),(2), (3), (3), (1), (3);

select *
from invoice;

insert into invoice_product(invoice_id, product_id) 
values(1, 1), (1, 3), (1, 5), (2, 4), (3, 1), (3, 2), (3, 4), (3, 5), (4, 1), (4, 4), (5, 5), (5, 3), (5, 1);

select *
from invoice_product;