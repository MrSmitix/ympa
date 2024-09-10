--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferMappingErrorDTO' definition.
--


--
-- SELECT template for table `OfferMappingErrorDTO`
--
SELECT `type`, `parameterId`, `message` FROM `OfferMappingErrorDTO` WHERE 1;

--
-- INSERT template for table `OfferMappingErrorDTO`
--
INSERT INTO `OfferMappingErrorDTO`(`type`, `parameterId`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferMappingErrorDTO`
--
UPDATE `OfferMappingErrorDTO` SET `type` = ?, `parameterId` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `OfferMappingErrorDTO`
--
DELETE FROM `OfferMappingErrorDTO` WHERE 0;

