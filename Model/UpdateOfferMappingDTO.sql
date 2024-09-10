--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateOfferMappingDTO' definition.
--


--
-- SELECT template for table `UpdateOfferMappingDTO`
--
SELECT `offer`, `mapping` FROM `UpdateOfferMappingDTO` WHERE 1;

--
-- INSERT template for table `UpdateOfferMappingDTO`
--
INSERT INTO `UpdateOfferMappingDTO`(`offer`, `mapping`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateOfferMappingDTO`
--
UPDATE `UpdateOfferMappingDTO` SET `offer` = ?, `mapping` = ? WHERE 1;

--
-- DELETE template for table `UpdateOfferMappingDTO`
--
DELETE FROM `UpdateOfferMappingDTO` WHERE 0;

