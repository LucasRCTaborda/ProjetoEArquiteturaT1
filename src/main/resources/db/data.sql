
INSERT INTO Aplicativo (id,nome,custoMensal) VALUES ('Icloud',15);
INSERT INTO Aplicativo (id,nome,custoMensal) VALUES ('Netflix',45);
INSERT INTO Aplicativo (id,nome,custoMensal) VALUES ('AcademiaLucão',120);
INSERT INTO Aplicativo (id,nome,custoMensal) VALUES ('BarbarosBarbershop',150);
INSERT INTO Aplicativo (id,nome,custoMensal) VALUES ('ifoodTeleFree',7.99);



INSERT INTO Usuario (nome,senha) VALUES ('Joao,1234');
INSERT INTO Usuario (nome,senha) VALUES ('Felipe,1234');
INSERT INTO Usuario (nome,senha) VALUES  ('John,1234');
INSERT INTO Usuario (nome,senha) VALUES  ('Noah,1234');
INSERT INTO Usuario (nome,senha) VALUES ('Patati,1234');



INSERT INTO Cliente (codigo,nome,email) VALUES (10,'Joao','@joao');
INSERT INTO Cliente (codigo,nome,email) VALUES (11,'Felipe','@Felipe');
INSERT INTO Cliente (codigo,nome,email) VALUES (12,'John','@John');
INSERT INTO Cliente (codigo,nome,email) VALUES (13,'Noah','@Noah');
INSERT INTO Cliente (codigo,nome,email) VALUES (14,'Patati','@Patati');




INSERT INTO Assinatura (codigo, aplicativo, cliente, inicioVigencia, fimVigencia)
VALUES
    (1, 'App1', 'Cliente1', '2024-04-25', '2024-04-30'),
    (2, 'App2', 'Cliente2', '2024-04-26', '2024-05-01'),
    (3, 'App3', 'Cliente3', '2024-04-27', '2024-05-02'),
    (4, 'App4', 'Cliente4', '2024-04-28', '2024-05-03'),
    (5, 'App5', 'Cliente5', '2024-04-29', '2024-05-04');



INSERT INTO Pagamento (codigo, assinatura, valorPago, promocao)
VALUES
    (1, 1, 50.00, 'Promoção A'),
    (2, 2, 45.00, 'Promoção B'),
    (3, 3, 55.00, 'Promoção C'),
    (4, 4, 60.00, 'Promoção D'),
    (5, 5, 40.00, 'Promoção E');





