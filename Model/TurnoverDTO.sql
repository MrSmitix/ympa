--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'TurnoverDTO' definition.
--


--
-- SELECT template for table `TurnoverDTO`
--
SELECT `turnover`, `turnoverDays` FROM `TurnoverDTO` WHERE 1;

--
-- INSERT template for table `TurnoverDTO`
--
INSERT INTO `TurnoverDTO`(`turnover`, `turnoverDays`) VALUES (?, ?);

--
-- UPDATE template for table `TurnoverDTO`
--
UPDATE `TurnoverDTO` SET `turnover` = ?, `turnoverDays` = ? WHERE 1;

--
-- DELETE template for table `TurnoverDTO`
--
DELETE FROM `TurnoverDTO` WHERE 0;

