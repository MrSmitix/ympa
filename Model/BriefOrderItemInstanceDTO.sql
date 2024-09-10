--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'BriefOrderItemInstanceDTO' definition.
--


--
-- SELECT template for table `BriefOrderItemInstanceDTO`
--
SELECT `cis`, `uin`, `rnpt`, `gtd` FROM `BriefOrderItemInstanceDTO` WHERE 1;

--
-- INSERT template for table `BriefOrderItemInstanceDTO`
--
INSERT INTO `BriefOrderItemInstanceDTO`(`cis`, `uin`, `rnpt`, `gtd`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `BriefOrderItemInstanceDTO`
--
UPDATE `BriefOrderItemInstanceDTO` SET `cis` = ?, `uin` = ?, `rnpt` = ?, `gtd` = ? WHERE 1;

--
-- DELETE template for table `BriefOrderItemInstanceDTO`
--
DELETE FROM `BriefOrderItemInstanceDTO` WHERE 0;

