--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetReturnResponse' definition.
--


--
-- SELECT template for table `GetReturnResponse`
--
SELECT `status`, `result` FROM `GetReturnResponse` WHERE 1;

--
-- INSERT template for table `GetReturnResponse`
--
INSERT INTO `GetReturnResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetReturnResponse`
--
UPDATE `GetReturnResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetReturnResponse`
--
DELETE FROM `GetReturnResponse` WHERE 0;

