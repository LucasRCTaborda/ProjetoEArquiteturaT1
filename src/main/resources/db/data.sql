CREATE TABLE Usuarios (
                          codigo LONG NOT NULL,
                          nome VARCHAR,
                          senha VARCHAR
);

INSERT INTO Usuarios (codigo, nome, senha) VALUES
                                               (1, 'Lucas', 'senha0'),
                                               (2, 'Maria', 'senha1'),
                                               (3, 'Pedro', 'senha2'),
                                               (4, 'Ana', 'senha3'),
                                               (5, 'Lucas', 'senha4'),
                                               (6, 'Julia', 'senha5'),
                                               (7, 'Mateus', 'senha6'),
                                               (8, 'Carla', 'senha7'),
                                               (9, 'Fernanda', 'senha8'),
                                               (10, 'Rafael', 'senha9'),
                                               (11, 'Mariana', 'senha10');

CREATE TABLE Clientes (
                         codigo LONG NOT NULL,
                         nome VARCHAR,
                         email VARCHAR
);

INSERT INTO Clientes (codigo, nome, email) VALUES
                                              (1, 'Empresa A', 'empresa_a@example.com'),
                                              (2, 'Empresa B', 'empresa_b@example.com'),
                                              (3, 'Empresa C', 'empresa_c@example.com'),
                                              (4, 'Empresa D', 'empresa_d@example.com'),
                                              (5, 'Empresa E', 'empresa_e@example.com'),
                                              (6, 'Empresa F', 'empresa_f@example.com'),
                                              (7, 'Empresa G', 'empresa_g@example.com'),
                                              (8, 'Empresa H', 'empresa_h@example.com'),
                                              (9, 'Empresa I', 'empresa_i@example.com'),
                                              (10, 'Empresa J', 'empresa_j@example.com');


CREATE TABLE Aplicativos (
                             codigo LONG NOT NULL,
                          nome VARCHAR,
                             custoMensal double
);

INSERT INTO Aplicativos (codigo, nome, custoMensal) VALUES
                                                        (5, 'Empresa X1', 20),
                                                        (6, 'Empresa X2', FLOOR(RAND() * (500 - 10 + 1)) + 10),
                                                        (7, 'Empresa X3', FLOOR(RAND() * (500 - 10 + 1)) + 10),
                                                        (8, 'Empresa X4', FLOOR(RAND() * (500 - 10 + 1)) + 10),
                                                        (9, 'Empresa X5', FLOOR(RAND() * (500 - 10 + 1)) + 10),
                                                        (10, 'Empresa X8', FLOOR(RAND() * (500 - 10 + 1)) + 10),
                                                        (11, 'Empresa XSPACE', FLOOR(RAND() * (500 - 10 + 1)) + 10),
                                                        (12, 'Empresa XDragon', FLOOR(RAND() * (500 - 10 + 1)) + 10),
                                                        (13, 'Empresa XIPTV', FLOOR(RAND() * (500 - 10 + 1)) + 10),
                                                        (14, 'Empresa XINSS', 1000);


CREATE TABLE Assinatura (
                            codigo BIGINT PRIMARY KEY NOT NULL,
                            id_aplicativo BIGINT NOT NULL,
                            id_cliente BIGINT NOT NULL,
                            inicioVigencia DATE,
                            fimVigencia DATE
);

-- Exemplo 1:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (3, 1,2,'2024-06-01', '2024-07-01');

-- Exemplo 2:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (4, 3,2,'2024-06-15', '2024-07-15');

-- Exemplo 3:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (5, 7,6, '2024-07-01', '2024-08-01');
-- Exemplo 4:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (6, 7,4, '2024-07-15', '2024-08-15');

-- Exemplo 5:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (7,6, 1, '2024-08-01', '2024-09-01');

-- Exemplo 6:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (8, 3, 9, '2024-08-15', '2024-09-15');

-- Exemplo 7:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (9, 9, 3, '2024-09-01', '2024-10-01');

-- Exemplo 8:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (10, 7,6, '2024-09-15', '2024-10-15');

-- Exemplo 9:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (11, 6, 5, '2024-10-01', '2024-11-01');

-- Exemplo 10:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (12, 3, 2, '2024-10-15', '2024-11-15');

-- Exemplo 11:
INSERT INTO Assinatura (codigo, id_aplicativo, id_cliente, inicioVigencia, fimVigencia)
VALUES (14, 4, 4, '2024-11-15', '2024-12-15');


