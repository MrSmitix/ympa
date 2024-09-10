--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetReturnsResponse' definition.
--


--
-- SELECT template for table `GetReturnsResponse`
--
SELECT `status`, `result` FROM `GetReturnsResponse` WHERE 1;

--
-- INSERT template for table `GetReturnsResponse`
--
INSERT INTO `GetReturnsResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetReturnsResponse`
--
UPDATE `GetReturnsResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetReturnsResponse`
--
DELETE FROM `GetReturnsResponse` WHERE 0;

