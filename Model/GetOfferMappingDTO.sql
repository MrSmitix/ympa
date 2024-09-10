--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOfferMappingDTO' definition.
--


--
-- SELECT template for table `GetOfferMappingDTO`
--
SELECT `offer`, `mapping` FROM `GetOfferMappingDTO` WHERE 1;

--
-- INSERT template for table `GetOfferMappingDTO`
--
INSERT INTO `GetOfferMappingDTO`(`offer`, `mapping`) VALUES (?, ?);

--
-- UPDATE template for table `GetOfferMappingDTO`
--
UPDATE `GetOfferMappingDTO` SET `offer` = ?, `mapping` = ? WHERE 1;

--
-- DELETE template for table `GetOfferMappingDTO`
--
DELETE FROM `GetOfferMappingDTO` WHERE 0;

