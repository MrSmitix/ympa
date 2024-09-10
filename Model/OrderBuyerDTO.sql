--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderBuyerDTO' definition.
--


--
-- SELECT template for table `OrderBuyerDTO`
--
SELECT `id`, `lastName`, `firstName`, `middleName`, `type` FROM `OrderBuyerDTO` WHERE 1;

--
-- INSERT template for table `OrderBuyerDTO`
--
INSERT INTO `OrderBuyerDTO`(`id`, `lastName`, `firstName`, `middleName`, `type`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderBuyerDTO`
--
UPDATE `OrderBuyerDTO` SET `id` = ?, `lastName` = ?, `firstName` = ?, `middleName` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `OrderBuyerDTO`
--
DELETE FROM `OrderBuyerDTO` WHERE 0;

