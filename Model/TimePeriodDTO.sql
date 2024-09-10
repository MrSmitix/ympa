--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'TimePeriodDTO' definition.
--


--
-- SELECT template for table `TimePeriodDTO`
--
SELECT `timePeriod`, `timeUnit`, `comment` FROM `TimePeriodDTO` WHERE 1;

--
-- INSERT template for table `TimePeriodDTO`
--
INSERT INTO `TimePeriodDTO`(`timePeriod`, `timeUnit`, `comment`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TimePeriodDTO`
--
UPDATE `TimePeriodDTO` SET `timePeriod` = ?, `timeUnit` = ?, `comment` = ? WHERE 1;

--
-- DELETE template for table `TimePeriodDTO`
--
DELETE FROM `TimePeriodDTO` WHERE 0;

