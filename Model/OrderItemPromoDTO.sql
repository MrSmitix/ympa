--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderItemPromoDTO' definition.
--


--
-- SELECT template for table `OrderItemPromoDTO`
--
SELECT `type`, `discount`, `subsidy`, `shopPromoId`, `marketPromoId` FROM `OrderItemPromoDTO` WHERE 1;

--
-- INSERT template for table `OrderItemPromoDTO`
--
INSERT INTO `OrderItemPromoDTO`(`type`, `discount`, `subsidy`, `shopPromoId`, `marketPromoId`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderItemPromoDTO`
--
UPDATE `OrderItemPromoDTO` SET `type` = ?, `discount` = ?, `subsidy` = ?, `shopPromoId` = ?, `marketPromoId` = ? WHERE 1;

--
-- DELETE template for table `OrderItemPromoDTO`
--
DELETE FROM `OrderItemPromoDTO` WHERE 0;

