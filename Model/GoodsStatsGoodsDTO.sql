--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsStatsGoodsDTO' definition.
--


--
-- SELECT template for table `GoodsStatsGoodsDTO`
--
SELECT `shopSku`, `marketSku`, `name`, `price`, `categoryId`, `categoryName`, `weightDimensions`, `warehouses`, `tariffs`, `pictures` FROM `GoodsStatsGoodsDTO` WHERE 1;

--
-- INSERT template for table `GoodsStatsGoodsDTO`
--
INSERT INTO `GoodsStatsGoodsDTO`(`shopSku`, `marketSku`, `name`, `price`, `categoryId`, `categoryName`, `weightDimensions`, `warehouses`, `tariffs`, `pictures`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GoodsStatsGoodsDTO`
--
UPDATE `GoodsStatsGoodsDTO` SET `shopSku` = ?, `marketSku` = ?, `name` = ?, `price` = ?, `categoryId` = ?, `categoryName` = ?, `weightDimensions` = ?, `warehouses` = ?, `tariffs` = ?, `pictures` = ? WHERE 1;

--
-- DELETE template for table `GoodsStatsGoodsDTO`
--
DELETE FROM `GoodsStatsGoodsDTO` WHERE 0;

