--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOrdersStatsRequest' definition.
--


--
-- SELECT template for table `GetOrdersStatsRequest`
--
SELECT `dateFrom`, `dateTo`, `updateFrom`, `updateTo`, `orders`, `statuses`, `hasCis` FROM `GetOrdersStatsRequest` WHERE 1;

--
-- INSERT template for table `GetOrdersStatsRequest`
--
INSERT INTO `GetOrdersStatsRequest`(`dateFrom`, `dateTo`, `updateFrom`, `updateTo`, `orders`, `statuses`, `hasCis`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GetOrdersStatsRequest`
--
UPDATE `GetOrdersStatsRequest` SET `dateFrom` = ?, `dateTo` = ?, `updateFrom` = ?, `updateTo` = ?, `orders` = ?, `statuses` = ?, `hasCis` = ? WHERE 1;

--
-- DELETE template for table `GetOrdersStatsRequest`
--
DELETE FROM `GetOrdersStatsRequest` WHERE 0;

