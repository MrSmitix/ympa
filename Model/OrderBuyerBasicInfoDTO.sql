--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderBuyerBasicInfoDTO' definition.
--


--
-- SELECT template for table `OrderBuyerBasicInfoDTO`
--
SELECT `id`, `lastName`, `firstName`, `middleName`, `type` FROM `OrderBuyerBasicInfoDTO` WHERE 1;

--
-- INSERT template for table `OrderBuyerBasicInfoDTO`
--
INSERT INTO `OrderBuyerBasicInfoDTO`(`id`, `lastName`, `firstName`, `middleName`, `type`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderBuyerBasicInfoDTO`
--
UPDATE `OrderBuyerBasicInfoDTO` SET `id` = ?, `lastName` = ?, `firstName` = ?, `middleName` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `OrderBuyerBasicInfoDTO`
--
DELETE FROM `OrderBuyerBasicInfoDTO` WHERE 0;

