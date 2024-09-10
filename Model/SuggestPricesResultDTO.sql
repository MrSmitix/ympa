--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SuggestPricesResultDTO' definition.
--


--
-- SELECT template for table `SuggestPricesResultDTO`
--
SELECT `offers` FROM `SuggestPricesResultDTO` WHERE 1;

--
-- INSERT template for table `SuggestPricesResultDTO`
--
INSERT INTO `SuggestPricesResultDTO`(`offers`) VALUES (?);

--
-- UPDATE template for table `SuggestPricesResultDTO`
--
UPDATE `SuggestPricesResultDTO` SET `offers` = ? WHERE 1;

--
-- DELETE template for table `SuggestPricesResultDTO`
--
DELETE FROM `SuggestPricesResultDTO` WHERE 0;

