--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrdersStatsPaymentDTO' definition.
--


--
-- SELECT template for table `OrdersStatsPaymentDTO`
--
SELECT `id`, `date`, `type`, `source`, `total`, `paymentOrder` FROM `OrdersStatsPaymentDTO` WHERE 1;

--
-- INSERT template for table `OrdersStatsPaymentDTO`
--
INSERT INTO `OrdersStatsPaymentDTO`(`id`, `date`, `type`, `source`, `total`, `paymentOrder`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrdersStatsPaymentDTO`
--
UPDATE `OrdersStatsPaymentDTO` SET `id` = ?, `date` = ?, `type` = ?, `source` = ?, `total` = ?, `paymentOrder` = ? WHERE 1;

--
-- DELETE template for table `OrdersStatsPaymentDTO`
--
DELETE FROM `OrdersStatsPaymentDTO` WHERE 0;

