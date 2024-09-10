--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CampaignSettingsScheduleDTO' definition.
--


--
-- SELECT template for table `CampaignSettingsScheduleDTO`
--
SELECT `availableOnHolidays`, `customHolidays`, `customWorkingDays`, `period`, `totalHolidays`, `weeklyHolidays` FROM `CampaignSettingsScheduleDTO` WHERE 1;

--
-- INSERT template for table `CampaignSettingsScheduleDTO`
--
INSERT INTO `CampaignSettingsScheduleDTO`(`availableOnHolidays`, `customHolidays`, `customWorkingDays`, `period`, `totalHolidays`, `weeklyHolidays`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignSettingsScheduleDTO`
--
UPDATE `CampaignSettingsScheduleDTO` SET `availableOnHolidays` = ?, `customHolidays` = ?, `customWorkingDays` = ?, `period` = ?, `totalHolidays` = ?, `weeklyHolidays` = ? WHERE 1;

--
-- DELETE template for table `CampaignSettingsScheduleDTO`
--
DELETE FROM `CampaignSettingsScheduleDTO` WHERE 0;

