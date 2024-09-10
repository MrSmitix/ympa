--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBidsInfoResponse' definition.
--


--
-- SELECT template for table `GetBidsInfoResponse`
--
SELECT `status`, `result` FROM `GetBidsInfoResponse` WHERE 1;

--
-- INSERT template for table `GetBidsInfoResponse`
--
INSERT INTO `GetBidsInfoResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetBidsInfoResponse`
--
UPDATE `GetBidsInfoResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetBidsInfoResponse`
--
DELETE FROM `GetBidsInfoResponse` WHERE 0;

