--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'RegionalModelInfoDTO' definition.
--


--
-- SELECT template for table `RegionalModelInfoDTO`
--
SELECT `currency`, `regionId` FROM `RegionalModelInfoDTO` WHERE 1;

--
-- INSERT template for table `RegionalModelInfoDTO`
--
INSERT INTO `RegionalModelInfoDTO`(`currency`, `regionId`) VALUES (?, ?);

--
-- UPDATE template for table `RegionalModelInfoDTO`
--
UPDATE `RegionalModelInfoDTO` SET `currency` = ?, `regionId` = ? WHERE 1;

--
-- DELETE template for table `RegionalModelInfoDTO`
--
DELETE FROM `RegionalModelInfoDTO` WHERE 0;

