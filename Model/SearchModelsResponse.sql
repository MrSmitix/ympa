--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SearchModelsResponse' definition.
--


--
-- SELECT template for table `SearchModelsResponse`
--
SELECT `models`, `currency`, `regionId`, `pager` FROM `SearchModelsResponse` WHERE 1;

--
-- INSERT template for table `SearchModelsResponse`
--
INSERT INTO `SearchModelsResponse`(`models`, `currency`, `regionId`, `pager`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SearchModelsResponse`
--
UPDATE `SearchModelsResponse` SET `models` = ?, `currency` = ?, `regionId` = ?, `pager` = ? WHERE 1;

--
-- DELETE template for table `SearchModelsResponse`
--
DELETE FROM `SearchModelsResponse` WHERE 0;

