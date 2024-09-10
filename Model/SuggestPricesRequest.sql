--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SuggestPricesRequest' definition.
--


--
-- SELECT template for table `SuggestPricesRequest`
--
SELECT `offers` FROM `SuggestPricesRequest` WHERE 1;

--
-- INSERT template for table `SuggestPricesRequest`
--
INSERT INTO `SuggestPricesRequest`(`offers`) VALUES (?);

--
-- UPDATE template for table `SuggestPricesRequest`
--
UPDATE `SuggestPricesRequest` SET `offers` = ? WHERE 1;

--
-- DELETE template for table `SuggestPricesRequest`
--
DELETE FROM `SuggestPricesRequest` WHERE 0;

