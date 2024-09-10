--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBusinessSettingsInfoDTO' definition.
--


--
-- SELECT template for table `GetBusinessSettingsInfoDTO`
--
SELECT `info`, `settings` FROM `GetBusinessSettingsInfoDTO` WHERE 1;

--
-- INSERT template for table `GetBusinessSettingsInfoDTO`
--
INSERT INTO `GetBusinessSettingsInfoDTO`(`info`, `settings`) VALUES (?, ?);

--
-- UPDATE template for table `GetBusinessSettingsInfoDTO`
--
UPDATE `GetBusinessSettingsInfoDTO` SET `info` = ?, `settings` = ? WHERE 1;

--
-- DELETE template for table `GetBusinessSettingsInfoDTO`
--
DELETE FROM `GetBusinessSettingsInfoDTO` WHERE 0;

