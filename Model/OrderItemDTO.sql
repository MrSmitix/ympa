--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderItemDTO' definition.
--


--
-- SELECT template for table `OrderItemDTO`
--
SELECT `id`, `offerId`, `offerName`, `price`, `buyerPrice`, `buyerPriceBeforeDiscount`, `priceBeforeDiscount`, `count`, `vat`, `shopSku`, `subsidy`, `partnerWarehouseId`, `promos`, `instances`, `details`, `subsidies`, `requiredInstanceTypes` FROM `OrderItemDTO` WHERE 1;

--
-- INSERT template for table `OrderItemDTO`
--
INSERT INTO `OrderItemDTO`(`id`, `offerId`, `offerName`, `price`, `buyerPrice`, `buyerPriceBeforeDiscount`, `priceBeforeDiscount`, `count`, `vat`, `shopSku`, `subsidy`, `partnerWarehouseId`, `promos`, `instances`, `details`, `subsidies`, `requiredInstanceTypes`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderItemDTO`
--
UPDATE `OrderItemDTO` SET `id` = ?, `offerId` = ?, `offerName` = ?, `price` = ?, `buyerPrice` = ?, `buyerPriceBeforeDiscount` = ?, `priceBeforeDiscount` = ?, `count` = ?, `vat` = ?, `shopSku` = ?, `subsidy` = ?, `partnerWarehouseId` = ?, `promos` = ?, `instances` = ?, `details` = ?, `subsidies` = ?, `requiredInstanceTypes` = ? WHERE 1;

--
-- DELETE template for table `OrderItemDTO`
--
DELETE FROM `OrderItemDTO` WHERE 0;

