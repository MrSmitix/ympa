--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetModelsOffersResponse' definition.
--


--
-- SELECT template for table `GetModelsOffersResponse`
--
SELECT `models`, `currency`, `regionId` FROM `GetModelsOffersResponse` WHERE 1;

--
-- INSERT template for table `GetModelsOffersResponse`
--
INSERT INTO `GetModelsOffersResponse`(`models`, `currency`, `regionId`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetModelsOffersResponse`
--
UPDATE `GetModelsOffersResponse` SET `models` = ?, `currency` = ?, `regionId` = ? WHERE 1;

--
-- DELETE template for table `GetModelsOffersResponse`
--
DELETE FROM `GetModelsOffersResponse` WHERE 0;

