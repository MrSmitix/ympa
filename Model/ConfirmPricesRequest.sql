--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ConfirmPricesRequest' definition.
--


--
-- SELECT template for table `ConfirmPricesRequest`
--
SELECT `offerIds` FROM `ConfirmPricesRequest` WHERE 1;

--
-- INSERT template for table `ConfirmPricesRequest`
--
INSERT INTO `ConfirmPricesRequest`(`offerIds`) VALUES (?);

--
-- UPDATE template for table `ConfirmPricesRequest`
--
UPDATE `ConfirmPricesRequest` SET `offerIds` = ? WHERE 1;

--
-- DELETE template for table `ConfirmPricesRequest`
--
DELETE FROM `ConfirmPricesRequest` WHERE 0;

