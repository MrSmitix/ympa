--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdatePricesRequest' definition.
--


--
-- SELECT template for table `UpdatePricesRequest`
--
SELECT `offers` FROM `UpdatePricesRequest` WHERE 1;

--
-- INSERT template for table `UpdatePricesRequest`
--
INSERT INTO `UpdatePricesRequest`(`offers`) VALUES (?);

--
-- UPDATE template for table `UpdatePricesRequest`
--
UPDATE `UpdatePricesRequest` SET `offers` = ? WHERE 1;

--
-- DELETE template for table `UpdatePricesRequest`
--
DELETE FROM `UpdatePricesRequest` WHERE 0;

