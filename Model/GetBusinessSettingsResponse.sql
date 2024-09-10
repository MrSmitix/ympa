--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBusinessSettingsResponse' definition.
--


--
-- SELECT template for table `GetBusinessSettingsResponse`
--
SELECT `status`, `result` FROM `GetBusinessSettingsResponse` WHERE 1;

--
-- INSERT template for table `GetBusinessSettingsResponse`
--
INSERT INTO `GetBusinessSettingsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetBusinessSettingsResponse`
--
UPDATE `GetBusinessSettingsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetBusinessSettingsResponse`
--
DELETE FROM `GetBusinessSettingsResponse` WHERE 0;

