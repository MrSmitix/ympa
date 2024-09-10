--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsStatsWarehouseDTO' definition.
--


--
-- SELECT template for table `GoodsStatsWarehouseDTO`
--
SELECT `id`, `name`, `stocks` FROM `GoodsStatsWarehouseDTO` WHERE 1;

--
-- INSERT template for table `GoodsStatsWarehouseDTO`
--
INSERT INTO `GoodsStatsWarehouseDTO`(`id`, `name`, `stocks`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GoodsStatsWarehouseDTO`
--
UPDATE `GoodsStatsWarehouseDTO` SET `id` = ?, `name` = ?, `stocks` = ? WHERE 1;

--
-- DELETE template for table `GoodsStatsWarehouseDTO`
--
DELETE FROM `GoodsStatsWarehouseDTO` WHERE 0;

