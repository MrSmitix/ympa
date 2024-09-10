--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OfferMappingInfoDTO' definition.
--


--
-- SELECT template for table `OfferMappingInfoDTO`
--
SELECT `mapping`, `awaitingModerationMapping`, `rejectedMapping` FROM `OfferMappingInfoDTO` WHERE 1;

--
-- INSERT template for table `OfferMappingInfoDTO`
--
INSERT INTO `OfferMappingInfoDTO`(`mapping`, `awaitingModerationMapping`, `rejectedMapping`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OfferMappingInfoDTO`
--
UPDATE `OfferMappingInfoDTO` SET `mapping` = ?, `awaitingModerationMapping` = ?, `rejectedMapping` = ? WHERE 1;

--
-- DELETE template for table `OfferMappingInfoDTO`
--
DELETE FROM `OfferMappingInfoDTO` WHERE 0;

