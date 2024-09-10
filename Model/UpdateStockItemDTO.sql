--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateStockItemDTO' definition.
--


--
-- SELECT template for table `UpdateStockItemDTO`
--
SELECT `count`, `updatedAt` FROM `UpdateStockItemDTO` WHERE 1;

--
-- INSERT template for table `UpdateStockItemDTO`
--
INSERT INTO `UpdateStockItemDTO`(`count`, `updatedAt`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateStockItemDTO`
--
UPDATE `UpdateStockItemDTO` SET `count` = ?, `updatedAt` = ? WHERE 1;

--
-- DELETE template for table `UpdateStockItemDTO`
--
DELETE FROM `UpdateStockItemDTO` WHERE 0;

