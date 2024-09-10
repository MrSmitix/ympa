--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderBuyerInfoDTO' definition.
--


--
-- SELECT template for table `OrderBuyerInfoDTO`
--
SELECT `id`, `lastName`, `firstName`, `middleName`, `type`, `phone` FROM `OrderBuyerInfoDTO` WHERE 1;

--
-- INSERT template for table `OrderBuyerInfoDTO`
--
INSERT INTO `OrderBuyerInfoDTO`(`id`, `lastName`, `firstName`, `middleName`, `type`, `phone`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderBuyerInfoDTO`
--
UPDATE `OrderBuyerInfoDTO` SET `id` = ?, `lastName` = ?, `firstName` = ?, `middleName` = ?, `type` = ?, `phone` = ? WHERE 1;

--
-- DELETE template for table `OrderBuyerInfoDTO`
--
DELETE FROM `OrderBuyerInfoDTO` WHERE 0;

