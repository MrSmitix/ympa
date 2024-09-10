--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'WarehouseDTO' definition.
--


--
-- SELECT template for table `WarehouseDTO`
--
SELECT `id`, `name`, `campaignId`, `express`, `address` FROM `WarehouseDTO` WHERE 1;

--
-- INSERT template for table `WarehouseDTO`
--
INSERT INTO `WarehouseDTO`(`id`, `name`, `campaignId`, `express`, `address`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `WarehouseDTO`
--
UPDATE `WarehouseDTO` SET `id` = ?, `name` = ?, `campaignId` = ?, `express` = ?, `address` = ? WHERE 1;

--
-- DELETE template for table `WarehouseDTO`
--
DELETE FROM `WarehouseDTO` WHERE 0;

