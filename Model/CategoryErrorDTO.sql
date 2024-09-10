--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CategoryErrorDTO' definition.
--


--
-- SELECT template for table `CategoryErrorDTO`
--
SELECT `categoryId`, `type` FROM `CategoryErrorDTO` WHERE 1;

--
-- INSERT template for table `CategoryErrorDTO`
--
INSERT INTO `CategoryErrorDTO`(`categoryId`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `CategoryErrorDTO`
--
UPDATE `CategoryErrorDTO` SET `categoryId` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `CategoryErrorDTO`
--
DELETE FROM `CategoryErrorDTO` WHERE 0;

