--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackIdentifiersDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackIdentifiersDTO`
--
SELECT `orderId`, `modelId` FROM `GoodsFeedbackIdentifiersDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackIdentifiersDTO`
--
INSERT INTO `GoodsFeedbackIdentifiersDTO`(`orderId`, `modelId`) VALUES (?, ?);

--
-- UPDATE template for table `GoodsFeedbackIdentifiersDTO`
--
UPDATE `GoodsFeedbackIdentifiersDTO` SET `orderId` = ?, `modelId` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackIdentifiersDTO`
--
DELETE FROM `GoodsFeedbackIdentifiersDTO` WHERE 0;

