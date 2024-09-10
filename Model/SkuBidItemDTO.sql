--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SkuBidItemDTO' definition.
--


--
-- SELECT template for table `SkuBidItemDTO`
--
SELECT `sku`, `bid` FROM `SkuBidItemDTO` WHERE 1;

--
-- INSERT template for table `SkuBidItemDTO`
--
INSERT INTO `SkuBidItemDTO`(`sku`, `bid`) VALUES (?, ?);

--
-- UPDATE template for table `SkuBidItemDTO`
--
UPDATE `SkuBidItemDTO` SET `sku` = ?, `bid` = ? WHERE 1;

--
-- DELETE template for table `SkuBidItemDTO`
--
DELETE FROM `SkuBidItemDTO` WHERE 0;

