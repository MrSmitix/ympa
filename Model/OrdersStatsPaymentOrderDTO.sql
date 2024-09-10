--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersStatsPaymentOrderDTO' definition.
--


--
-- SELECT template for table `OrdersStatsPaymentOrderDTO`
--
SELECT `id`, `date` FROM `OrdersStatsPaymentOrderDTO` WHERE 1;

--
-- INSERT template for table `OrdersStatsPaymentOrderDTO`
--
INSERT INTO `OrdersStatsPaymentOrderDTO`(`id`, `date`) VALUES (?, ?);

--
-- UPDATE template for table `OrdersStatsPaymentOrderDTO`
--
UPDATE `OrdersStatsPaymentOrderDTO` SET `id` = ?, `date` = ? WHERE 1;

--
-- DELETE template for table `OrdersStatsPaymentOrderDTO`
--
DELETE FROM `OrdersStatsPaymentOrderDTO` WHERE 0;

