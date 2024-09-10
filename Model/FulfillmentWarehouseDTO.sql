--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FulfillmentWarehouseDTO' definition.
--


--
-- SELECT template for table `FulfillmentWarehouseDTO`
--
SELECT `id`, `name`, `address` FROM `FulfillmentWarehouseDTO` WHERE 1;

--
-- INSERT template for table `FulfillmentWarehouseDTO`
--
INSERT INTO `FulfillmentWarehouseDTO`(`id`, `name`, `address`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FulfillmentWarehouseDTO`
--
UPDATE `FulfillmentWarehouseDTO` SET `id` = ?, `name` = ?, `address` = ? WHERE 1;

--
-- DELETE template for table `FulfillmentWarehouseDTO`
--
DELETE FROM `FulfillmentWarehouseDTO` WHERE 0;

