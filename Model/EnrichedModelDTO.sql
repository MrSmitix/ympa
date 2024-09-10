--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'EnrichedModelDTO' definition.
--


--
-- SELECT template for table `EnrichedModelDTO`
--
SELECT `id`, `name`, `prices`, `offers`, `offlineOffers`, `onlineOffers` FROM `EnrichedModelDTO` WHERE 1;

--
-- INSERT template for table `EnrichedModelDTO`
--
INSERT INTO `EnrichedModelDTO`(`id`, `name`, `prices`, `offers`, `offlineOffers`, `onlineOffers`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `EnrichedModelDTO`
--
UPDATE `EnrichedModelDTO` SET `id` = ?, `name` = ?, `prices` = ?, `offers` = ?, `offlineOffers` = ?, `onlineOffers` = ? WHERE 1;

--
-- DELETE template for table `EnrichedModelDTO`
--
DELETE FROM `EnrichedModelDTO` WHERE 0;

