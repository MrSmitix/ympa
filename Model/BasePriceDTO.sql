--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BasePriceDTO' definition.
--


--
-- SELECT template for table `BasePriceDTO`
--
SELECT `value`, `currencyId` FROM `BasePriceDTO` WHERE 1;

--
-- INSERT template for table `BasePriceDTO`
--
INSERT INTO `BasePriceDTO`(`value`, `currencyId`) VALUES (?, ?);

--
-- UPDATE template for table `BasePriceDTO`
--
UPDATE `BasePriceDTO` SET `value` = ?, `currencyId` = ? WHERE 1;

--
-- DELETE template for table `BasePriceDTO`
--
DELETE FROM `BasePriceDTO` WHERE 0;

