--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'EnrichedOrderBoxLayoutDTO' definition.
--


--
-- SELECT template for table `EnrichedOrderBoxLayoutDTO`
--
SELECT `items`, `boxId` FROM `EnrichedOrderBoxLayoutDTO` WHERE 1;

--
-- INSERT template for table `EnrichedOrderBoxLayoutDTO`
--
INSERT INTO `EnrichedOrderBoxLayoutDTO`(`items`, `boxId`) VALUES (?, ?);

--
-- UPDATE template for table `EnrichedOrderBoxLayoutDTO`
--
UPDATE `EnrichedOrderBoxLayoutDTO` SET `items` = ?, `boxId` = ? WHERE 1;

--
-- DELETE template for table `EnrichedOrderBoxLayoutDTO`
--
DELETE FROM `EnrichedOrderBoxLayoutDTO` WHERE 0;

