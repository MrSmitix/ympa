--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetPromosResponse' definition.
--


--
-- SELECT template for table `GetPromosResponse`
--
SELECT `status`, `result` FROM `GetPromosResponse` WHERE 1;

--
-- INSERT template for table `GetPromosResponse`
--
INSERT INTO `GetPromosResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetPromosResponse`
--
UPDATE `GetPromosResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetPromosResponse`
--
DELETE FROM `GetPromosResponse` WHERE 0;

