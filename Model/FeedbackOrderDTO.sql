--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedbackOrderDTO' definition.
--


--
-- SELECT template for table `FeedbackOrderDTO`
--
SELECT `shopOrderId`, `delivery` FROM `FeedbackOrderDTO` WHERE 1;

--
-- INSERT template for table `FeedbackOrderDTO`
--
INSERT INTO `FeedbackOrderDTO`(`shopOrderId`, `delivery`) VALUES (?, ?);

--
-- UPDATE template for table `FeedbackOrderDTO`
--
UPDATE `FeedbackOrderDTO` SET `shopOrderId` = ?, `delivery` = ? WHERE 1;

--
-- DELETE template for table `FeedbackOrderDTO`
--
DELETE FROM `FeedbackOrderDTO` WHERE 0;

