--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SearchShipmentsRequest' definition.
--


--
-- SELECT template for table `SearchShipmentsRequest`
--
SELECT `dateFrom`, `dateTo`, `statuses`, `orderIds`, `cancelledOrders` FROM `SearchShipmentsRequest` WHERE 1;

--
-- INSERT template for table `SearchShipmentsRequest`
--
INSERT INTO `SearchShipmentsRequest`(`dateFrom`, `dateTo`, `statuses`, `orderIds`, `cancelledOrders`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `SearchShipmentsRequest`
--
UPDATE `SearchShipmentsRequest` SET `dateFrom` = ?, `dateTo` = ?, `statuses` = ?, `orderIds` = ?, `cancelledOrders` = ? WHERE 1;

--
-- DELETE template for table `SearchShipmentsRequest`
--
DELETE FROM `SearchShipmentsRequest` WHERE 0;

