--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'OrderBoxLayoutItemDTO' definition.
--


--
-- SELECT template for table `OrderBoxLayoutItemDTO`
--
SELECT `id`, `fullCount`, `partialCount`, `instances` FROM `OrderBoxLayoutItemDTO` WHERE 1;

--
-- INSERT template for table `OrderBoxLayoutItemDTO`
--
INSERT INTO `OrderBoxLayoutItemDTO`(`id`, `fullCount`, `partialCount`, `instances`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OrderBoxLayoutItemDTO`
--
UPDATE `OrderBoxLayoutItemDTO` SET `id` = ?, `fullCount` = ?, `partialCount` = ?, `instances` = ? WHERE 1;

--
-- DELETE template for table `OrderBoxLayoutItemDTO`
--
DELETE FROM `OrderBoxLayoutItemDTO` WHERE 0;

