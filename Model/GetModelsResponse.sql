--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetModelsResponse' definition.
--


--
-- SELECT template for table `GetModelsResponse`
--
SELECT `models`, `currency`, `regionId` FROM `GetModelsResponse` WHERE 1;

--
-- INSERT template for table `GetModelsResponse`
--
INSERT INTO `GetModelsResponse`(`models`, `currency`, `regionId`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetModelsResponse`
--
UPDATE `GetModelsResponse` SET `models` = ?, `currency` = ?, `regionId` = ? WHERE 1;

--
-- DELETE template for table `GetModelsResponse`
--
DELETE FROM `GetModelsResponse` WHERE 0;

