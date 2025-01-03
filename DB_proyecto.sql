-- Creacion de la base de datos 
CREATE DATABASE sistema_ventas;
USE sistema_ventas;

-- Creacion de tablas
CREATE TABLE CATEGORIA_PDCTO (
    id_categoria CHAR(1) PRIMARY KEY,
    nombre_categoria VARCHAR(30) NOT NULL
);

CREATE TABLE PRODUCTO (
    sku_pdcto INT  PRIMARY KEY,
    nombre_pdcto VARCHAR(50) NOT NULL,
    precio_pdcto INT NOT NULL,
    id_categoria CHAR(1) NOT NULL,
    stock_disponible INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES CATEGORIA_PDCTO(id_categoria)
);

CREATE TABLE CLIENTE (
    numrut_cli VARCHAR(10) PRIMARY KEY,
    nombre_cli VARCHAR(30) NOT NULL,
    appaterno_cli VARCHAR(30) NOT NULL,
    apmaterno_cli VARCHAR(30)
);

CREATE TABLE METODO_PAGO (
    id_metodo_pago CHAR(1) PRIMARY KEY,
    nombre_metodo_pago VARCHAR(30) NOT NULL,
    num_baucher INT
);

CREATE TABLE SUCURSAL (
    numrut_negocio VARCHAR(10) PRIMARY KEY,
    id_sucursal CHAR(1) NOT NULL,
    nombre_sucursal VARCHAR(30) NOT NULL
);

CREATE TABLE TIPO_EMPLEADO (
    id_tipo_emp CHAR(1) PRIMARY KEY,
    nombre_tipo_emp VARCHAR(30) NOT NULL
);

CREATE TABLE EMPLEADO (
    numrut_emp VARCHAR(10) PRIMARY KEY,
    nombre_emp VARCHAR(30) NOT NULL,
    appaterno_emp VARCHAR(30) NOT NULL,
    apmaterno_emp VARCHAR(30),
    id_tipo_emp CHAR(1) NOT NULL,
    FOREIGN KEY (id_tipo_emp) REFERENCES TIPO_EMPLEADO(id_tipo_emp)
);

CREATE TABLE USUARIO (
    numrut_emp VARCHAR(10) PRIMARY KEY,
    contrasena_usuario VARCHAR(50) NOT NULL,
    id_tipo_emp CHAR(1) NOT NULL,
    FOREIGN KEY (numrut_emp) REFERENCES EMPLEADO(numrut_emp),
    FOREIGN KEY (id_tipo_emp) REFERENCES TIPO_EMPLEADO(id_tipo_emp)
);

CREATE TABLE VENTA (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    fecha_venta DATE NOT NULL,
    numrut_cli VARCHAR(10) NOT NULL,
    numrut_emp VARCHAR(10) NOT NULL,
    id_metodo_pago CHAR(1) NOT NULL,
    numrut_negocio VARCHAR(10) NOT NULL,
    FOREIGN KEY (numrut_cli) REFERENCES CLIENTE(numrut_cli),
    FOREIGN KEY (numrut_emp) REFERENCES EMPLEADO(numrut_emp),
    FOREIGN KEY (id_metodo_pago) REFERENCES METODO_PAGO(id_metodo_pago),
    FOREIGN KEY (numrut_negocio) REFERENCES SUCURSAL(numrut_negocio)
);

CREATE TABLE DETALLE_VENTA (
    id_detalle_venta INT AUTO_INCREMENT PRIMARY KEY,
    cantidad INT NOT NULL,
    sub_total INT NOT NULL,
    sku_pdcto INT NOT NULL,
    id_venta INT NOT NULL,
    FOREIGN KEY (sku_pdcto) REFERENCES PRODUCTO(sku_pdcto),
    FOREIGN KEY (id_venta) REFERENCES VENTA(id_venta)
);
COMMIT;