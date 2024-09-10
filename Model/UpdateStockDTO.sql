--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateStockDTO' definition.
--


--
-- SELECT template for table `UpdateStockDTO`
--
SELECT `sku`, `items` FROM `UpdateStockDTO` WHERE 1;

--
-- INSERT template for table `UpdateStockDTO`
--
INSERT INTO `UpdateStockDTO`(`sku`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateStockDTO`
--
UPDATE `UpdateStockDTO` SET `sku` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `UpdateStockDTO`
--
DELETE FROM `UpdateStockDTO` WHERE 0;

