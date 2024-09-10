--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'CreateOutletResponse' definition.
--


--
-- SELECT template for table `CreateOutletResponse`
--
SELECT `status`, `result` FROM `CreateOutletResponse` WHERE 1;

--
-- INSERT template for table `CreateOutletResponse`
--
INSERT INTO `CreateOutletResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `CreateOutletResponse`
--
UPDATE `CreateOutletResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `CreateOutletResponse`
--
DELETE FROM `CreateOutletResponse` WHERE 0;

