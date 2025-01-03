USE sistema_ventas;

-- Insertamos las categorías de los productos:
INSERT INTO CATEGORIA_PDCTO (id_categoria, nombre_categoria)
VALUES
(1, 'Jugueteria'),
(2, 'Papeleria'),
(3, 'Tecnologia'),
(4, 'Hogar'),
(5, 'Salud y belleza');
SELECT * FROM CATEGORIA_PDCTO; -- Verificamos consultando la tabla
COMMIT; -- Confirmamos



-- Insertamos los datos de las sucursales:
INSERT INTO SUCURSAL(
numrut_negocio,id_sucursal,nombre_sucursal)
VALUES("55555555-5", 1, "Puerto Montt");
SELECT * FROM SUCURSAL; -- Verificamos consultando la tabla
COMMIT; -- Confirmamos


-- Insertamos datos de método de pago: 
-- Primero modificaré algunas discrepancias en la tabla
ALTER TABLE METODO_PAGO DROP COLUMN num_baucher;

INSERT INTO METODO_PAGO (id_metodo_pago, nombre_metodo_pago)
VALUES
(1, 'Debito'),
(2, 'Credito'),
(3, 'Efectivo');
SELECT * FROM METODO_PAGO; -- Verificamos consultando la tabla
COMMIT; -- Confirmamos


-- Insertamos los tipos de empleados:
INSERT INTO TIPO_EMPLEADO (id_tipo_emp, nombre_tipo_emp)
VALUES
(1, 'Jefe'),
(2, 'Subjefe'),
(3, 'Cajero');
SELECT * FROM TIPO_EMPLEADO; -- Verificamos consultando la tabla
COMMIT; -- Confirmamos


-- Poblamos la tabla de empleados con datos ficticios para usar en el sistema
INSERT INTO EMPLEADO (numrut_emp, nombre_emp, appaterno_emp, apmaterno_emp, id_tipo_emp)
VALUES
('100000001', 'Juan', 'Pérez', 'Gómez', '1'),
('100000002', 'Ana', 'López', 'Martínez', '2'),
('100000003', 'Carlos', 'Rodríguez', 'Sánchez', '2'),
('100000004', 'Laura', 'González', 'Díaz', '3'),
('100000005', 'Pedro', 'Ramírez', 'Torres', '3'),
('100000006', 'Marta', 'Sánchez', 'García', '3'),
('100000007', 'Luis', 'Fernández', 'Álvarez', '3'),
('100000008', 'Sofía', 'Martínez', 'Morales', '3'),
('100000009', 'Miguel', 'Jiménez', 'Lopez', '3'),
('100000010', 'Beatriz', 'Hernández', 'Romero', '3'),
('100000011', 'Javier', 'Torres', 'Muñoz', '3'),
('100000012', 'Elena', 'Gómez', 'Vázquez', '3'),
('100000013', 'Francisco', 'López', 'García', '3'),
('100000014', 'Raquel', 'Castro', 'Ruiz', '3'),
('100000015', 'David', 'Pérez', 'Hernández', '3');
SELECT * FROM EMPLEADO; -- Verificamos consultando la tabla
COMMIT; -- Confirmamos

-- Poblamos la tabla de usuarios con datos ficticios;
INSERT INTO USUARIO (numrut_emp, contrasena_usuario, id_tipo_emp)
VALUES
('100000001', 'contraseña123', '1'),
('100000002', 'contraseña123', '2'),
('100000003', 'contraseña123', '2'),
('100000004', 'contraseña123', '3'),
('100000005', 'contraseña123', '3'),
('100000006', 'contraseña123', '3'),
('100000007', 'contraseña123', '3'),
('100000008', 'contraseña123', '3'),
('100000009', 'contraseña123', '3'),
('100000010', 'contraseña123', '3'),
('100000011', 'contraseña123', '3'),
('100000012', 'contraseña123', '3'),
('100000013', 'contraseña123', '3'),
('100000014', 'contraseña123', '3'),
('100000015', 'contraseña123', '3');
SELECT * FROM USUARIO; -- Verificamos consultando la tabla
COMMIT; -- Confirmamos

-- Poblamos un inventario con datos hipoteticos en la tabla PRODUCTO:
INSERT INTO PRODUCTO (sku_pdcto, nombre_pdcto, precio_pdcto, id_categoria, stock_disponible)
VALUES
-- Jugueteria
(2000040001, 'Pelota', 3990, 1, 10),
(2000040002, 'Muñeca', 4990, 1, 15),
(2000040003, 'Rompecabezas', 6990, 1, 8),
(2000040004, 'Lego', 14990, 1, 12),
(2000040005, 'Tren', 7990, 1, 20),
(2000040006, 'Avión', 9990, 1, 5),
(2000040007, 'Peluche', 4990, 1, 18),
(2000040008, 'Carro', 5990, 1, 30),
(2000040009, 'Juego de mesa', 12990, 1, 22),
(2000040010, 'Bici', 24990, 1, 6),
(2000040011, 'Puzzle', 3990, 1, 15),
(2000040012, 'Rompe-cabezas', 5990, 1, 10),
(2000040013, 'Lego set', 14990, 1, 7),
(2000040014, 'Bañera de muñeca', 9990, 1, 13),
(2000040015, 'Ropa de muñeca', 1990, 1, 8),
(2000040016, 'Peluche de animal', 3990, 1, 25),
(2000040017, 'Coche de carreras', 9990, 1, 18),
(2000040018, 'Juego de herramientas', 5990, 1, 22),
(2000040019, 'Kit de ciencia', 14990, 1, 30),
(2000040020, 'Pista de autos', 7990, 1, 20),

-- Papeleria
(2000040021, 'Cuaderno', 1990, 2, 200),
(2000040022, 'Lápiz', 500, 2, 150),
(2000040023, 'Resaltador', 1290, 2, 120),
(2000040024, 'Carpeta', 2990, 2, 100),
(2000040025, 'Goma', 500, 2, 180),
(2000040026, 'Témpera', 1790, 2, 95),
(2000040027, 'Pegamento', 990, 2, 140),
(2000040028, 'Marcador', 890, 2, 160),
(2000040029, 'Regla', 690, 2, 110),
(2000040030, 'Sacapuntas', 250, 2, 130),
(2000040031, 'Bloc de notas', 1500, 2, 100),
(2000040032, 'Post-its', 1200, 2, 80),
(2000040033, 'Subrayador', 990, 2, 110),
(2000040034, 'Tijeras', 1500, 2, 90),
(2000040035, 'Cartulina', 2000, 2, 70),
(2000040036, 'Folios', 800, 2, 130),
(2000040037, 'Papel bond', 1200, 2, 60),
(2000040038, 'Perforadora', 2500, 2, 45),
(2000040039, 'Cinta adhesiva', 800, 2, 50),
(2000040040, 'Papel reciclado', 1000, 2, 110),

-- Tecnologia
(2000040041, 'Smartphone', 79990, 3, 30),
(2000040042, 'Laptop', 99990, 3, 20),
(2000040043, 'Tablet', 49990, 3, 40),
(2000040044, 'Smartwatch', 19990, 3, 35),
(2000040045, 'Auriculares', 14990, 3, 50),
(2000040046, 'Teclado', 9990, 3, 65),
(2000040047, 'Ratón', 4990, 3, 75),
(2000040048, 'Monitor', 29990, 3, 25),
(2000040049, 'Cámara web', 14990, 3, 10),
(2000040050, 'Disco duro', 24990, 3, 55),
(2000040051, 'Proyector', 19990, 3, 15),
(2000040052, 'Impresora', 7990, 3, 30),
(2000040053, 'Altavoces', 12990, 3, 40),
(2000040054, 'Teclado mecánico', 19990, 3, 60),
(2000040055, 'Microfono', 16990, 3, 10),
(2000040056, 'Parlantes bluetooth', 24990, 3, 50),
(2000040057, 'Router WiFi', 14990, 3, 45),
(2000040058, 'Cargador inalámbrico', 7990, 3, 80),
(2000040059, 'Cable HDMI', 1990, 3, 100),
(2000040060, 'Reloj despertador', 5990, 3, 25),

-- Hogar
(2000040061, 'Silla', 12990, 4, 20),
(2000040062, 'Mesa', 29990, 4, 18),
(2000040063, 'Sofá', 69990, 4, 8),
(2000040064, 'Lámpara', 7990, 4, 60),
(2000040065, 'Espejo', 14990, 4, 50),
(2000040066, 'Alfombra', 19990, 4, 40),
(2000040067, 'Cortinas', 9990, 4, 25),
(2000040068, 'Estante', 24990, 4, 33),
(2000040069, 'Armario', 39990, 4, 7),
(2000040070, 'Refrigerador', 99990, 4, 10),
(2000040071, 'Tetera', 4990, 4, 80),
(2000040072, 'Tostadora', 3990, 4, 70),
(2000040073, 'Plancha', 7990, 4, 45),
(2000040074, 'Batidora', 14990, 4, 25),
(2000040075, 'Cafetera', 7990, 4, 50),
(2000040076, 'Sarten', 19990, 4, 35),
(2000040077, 'Lavadora', 19990, 4, 10),
(2000040078, 'Microondas', 25990, 4, 8),
(2000040079, 'Cajonera', 12990, 4, 25),
(2000040080, 'Repostera', 14990, 4, 15),

-- Salud y belleza
(2000040081, 'Crema facial', 4990, 5, 120),
(2000040082, 'Champú', 2990, 5, 130),
(2000040083, 'Perfume', 14990, 5, 50),
(2000040084, 'Desodorante', 990, 5, 140),
(2000040085, 'Crema corporal', 7990, 5, 110),
(2000040086, 'Gel para el cabello', 2490, 5, 95),
(2000040087, 'Maquillaje', 3990, 5, 85),
(2000040088, 'Rizador de cabello', 12990, 5, 30),
(2000040089, 'Cepillo de dientes', 990, 5, 150),
(2000040090, 'Pasta dental', 790, 5, 170),
(2000040091, 'Tónico', 2990, 5, 60),
(2000040092, 'Serum facial', 19990, 5, 40),
(2000040093, 'Esmalte', 990, 5, 100),
(2000040094, 'Aceite esencial', 1590, 5, 85),
(2000040095, 'Cepillo de cabello', 1290, 5, 120),
(2000040096, 'Laca', 990, 5, 95),
(2000040097, 'Acondicionador', 2990, 5, 130),
(2000040098, 'Crema para manos', 890, 5, 110);

SELECT * FROM PRODUCTO; -- Verificamos consultando la tabla
COMMIT; -- Confirmamos






