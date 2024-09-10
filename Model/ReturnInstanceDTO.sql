--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ReturnInstanceDTO' definition.
--


--
-- SELECT template for table `ReturnInstanceDTO`
--
SELECT `stockType`, `status`, `cis`, `imei` FROM `ReturnInstanceDTO` WHERE 1;

--
-- INSERT template for table `ReturnInstanceDTO`
--
INSERT INTO `ReturnInstanceDTO`(`stockType`, `status`, `cis`, `imei`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ReturnInstanceDTO`
--
UPDATE `ReturnInstanceDTO` SET `stockType` = ?, `status` = ?, `cis` = ?, `imei` = ? WHERE 1;

--
-- DELETE template for table `ReturnInstanceDTO`
--
DELETE FROM `ReturnInstanceDTO` WHERE 0;

