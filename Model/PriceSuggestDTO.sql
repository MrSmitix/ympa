--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PriceSuggestDTO' definition.
--


--
-- SELECT template for table `PriceSuggestDTO`
--
SELECT `type`, `price` FROM `PriceSuggestDTO` WHERE 1;

--
-- INSERT template for table `PriceSuggestDTO`
--
INSERT INTO `PriceSuggestDTO`(`type`, `price`) VALUES (?, ?);

--
-- UPDATE template for table `PriceSuggestDTO`
--
UPDATE `PriceSuggestDTO` SET `type` = ?, `price` = ? WHERE 1;

--
-- DELETE template for table `PriceSuggestDTO`
--
DELETE FROM `PriceSuggestDTO` WHERE 0;

