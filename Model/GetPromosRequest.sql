--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromosRequest' definition.
--


--
-- SELECT template for table `GetPromosRequest`
--
SELECT `participation`, `mechanics` FROM `GetPromosRequest` WHERE 1;

--
-- INSERT template for table `GetPromosRequest`
--
INSERT INTO `GetPromosRequest`(`participation`, `mechanics`) VALUES (?, ?);

--
-- UPDATE template for table `GetPromosRequest`
--
UPDATE `GetPromosRequest` SET `participation` = ?, `mechanics` = ? WHERE 1;

--
-- DELETE template for table `GetPromosRequest`
--
DELETE FROM `GetPromosRequest` WHERE 0;

