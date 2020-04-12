INSERT INTO  MEASUREMENT_UNIT(measurement_unit_name) VALUES 
('INCH'),
('CENTIMETER'),
('METER'),
('KILOMETER'),
('FEET'),
('KILOGRAM'),
('GRAM'),
('MILIGRAM'),
('LITRE'),
('MILILITRE');

INSERT INTO  COLOR(COLOR_NAME) VALUES 
('RED'),
('GREEN'),
('BLUE'),
('YELLOW'),
('ORANGE'),
('WHITE'),
('BLACK'),
('MAGENTA'),
('PINK'),
('BROWN');

INSERT INTO  SUPPLIER(SUPPLIER_NAME) VALUES 
('RAM'),
('RAHIM'),
('KARAN'),
('ARJUN'),
('SITA'),
('GEETA'),
('RITA'),
('NITA'),
('BABITA'),
('SUNNY');

INSERT INTO  SELLER(SELLER_NAME) VALUES 
('RAMS'),
('RAHIMS'),
('KARANS'),
('ARJUNS'),
('SITAS'),
('GEETAS'),
('RITAS'),
('NITAS'),
('BABITAS'),
('SUNNYS');

INSERT INTO PRODUCT (PRODUCT_NAME, COLOR_ID, SIZE, MEASUREMENT_UNIT_ID) VALUES
  ('SHIRT', 1, 36,1),
  ('SHIRT', 2, 46,1),
  ('SHIRT', 3, 56,1),
  ('TV', 2, 15,1),
  ('TV', 3, 40,1),
  ('TABLE', 5, 50,3),
  ('PEN', 1, 3,1);
  
INSERT INTO PRODUCT_SUPPLIER (PRODUCT_ID, SUPPLIER_ID) VALUES
  (1,1),
  (1,2),
  (2,1),
  (3,1),
  (3,2),
  (3,3),
  (4,1),
  (4,2),
  (4,3),
  (4,4),
  (5,3),
  (5,7),
  (6,1);
  
INSERT INTO PRODUCT_SELLER (PRODUCT_ID, SELLER_ID) VALUES
  (1,1),
  (2,1),
  (3,1),
  (4,3),
  (4,4),
  (5,3),
  (5,7),
  (6,1),
  (6,2),
  (6,3),
  (6,5);
  
 