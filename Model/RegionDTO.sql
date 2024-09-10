--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'RegionDTO' definition.
--


--
-- SELECT template for table `RegionDTO`
--
SELECT `id`, `name`, `type`, `parent`, `children` FROM `RegionDTO` WHERE 1;

--
-- INSERT template for table `RegionDTO`
--
INSERT INTO `RegionDTO`(`id`, `name`, `type`, `parent`, `children`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `RegionDTO`
--
UPDATE `RegionDTO` SET `id` = ?, `name` = ?, `type` = ?, `parent` = ?, `children` = ? WHERE 1;

--
-- DELETE template for table `RegionDTO`
--
DELETE FROM `RegionDTO` WHERE 0;

