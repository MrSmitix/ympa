--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersStatsOrderDTO' definition.
--


--
-- SELECT template for table `OrdersStatsOrderDTO`
--
SELECT `id`, `creationDate`, `statusUpdateDate`, `status`, `partnerOrderId`, `paymentType`, `fake`, `deliveryRegion`, `items`, `initialItems`, `payments`, `commissions` FROM `OrdersStatsOrderDTO` WHERE 1;

--
-- INSERT template for table `OrdersStatsOrderDTO`
--
INSERT INTO `OrdersStatsOrderDTO`(`id`, `creationDate`, `statusUpdateDate`, `status`, `partnerOrderId`, `paymentType`, `fake`, `deliveryRegion`, `items`, `initialItems`, `payments`, `commissions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrdersStatsOrderDTO`
--
UPDATE `OrdersStatsOrderDTO` SET `id` = ?, `creationDate` = ?, `statusUpdateDate` = ?, `status` = ?, `partnerOrderId` = ?, `paymentType` = ?, `fake` = ?, `deliveryRegion` = ?, `items` = ?, `initialItems` = ?, `payments` = ?, `commissions` = ? WHERE 1;

--
-- DELETE template for table `OrdersStatsOrderDTO`
--
DELETE FROM `OrdersStatsOrderDTO` WHERE 0;

