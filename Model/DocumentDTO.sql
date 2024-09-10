--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'DocumentDTO' definition.
--


--
-- SELECT template for table `DocumentDTO`
--
SELECT `status`, `number`, `date` FROM `DocumentDTO` WHERE 1;

--
-- INSERT template for table `DocumentDTO`
--
INSERT INTO `DocumentDTO`(`status`, `number`, `date`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DocumentDTO`
--
UPDATE `DocumentDTO` SET `status` = ?, `number` = ?, `date` = ? WHERE 1;

--
-- DELETE template for table `DocumentDTO`
--
DELETE FROM `DocumentDTO` WHERE 0;

