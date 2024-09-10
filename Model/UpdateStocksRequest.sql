--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateStocksRequest' definition.
--


--
-- SELECT template for table `UpdateStocksRequest`
--
SELECT `skus` FROM `UpdateStocksRequest` WHERE 1;

--
-- INSERT template for table `UpdateStocksRequest`
--
INSERT INTO `UpdateStocksRequest`(`skus`) VALUES (?);

--
-- UPDATE template for table `UpdateStocksRequest`
--
UPDATE `UpdateStocksRequest` SET `skus` = ? WHERE 1;

--
-- DELETE template for table `UpdateStocksRequest`
--
DELETE FROM `UpdateStocksRequest` WHERE 0;

