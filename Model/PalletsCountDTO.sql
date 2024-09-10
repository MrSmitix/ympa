--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'PalletsCountDTO' definition.
--


--
-- SELECT template for table `PalletsCountDTO`
--
SELECT `planned`, `fact` FROM `PalletsCountDTO` WHERE 1;

--
-- INSERT template for table `PalletsCountDTO`
--
INSERT INTO `PalletsCountDTO`(`planned`, `fact`) VALUES (?, ?);

--
-- UPDATE template for table `PalletsCountDTO`
--
UPDATE `PalletsCountDTO` SET `planned` = ?, `fact` = ? WHERE 1;

--
-- DELETE template for table `PalletsCountDTO`
--
DELETE FROM `PalletsCountDTO` WHERE 0;

