--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBusinessBuyerInfoResponse' definition.
--


--
-- SELECT template for table `GetBusinessBuyerInfoResponse`
--
SELECT `status`, `result` FROM `GetBusinessBuyerInfoResponse` WHERE 1;

--
-- INSERT template for table `GetBusinessBuyerInfoResponse`
--
INSERT INTO `GetBusinessBuyerInfoResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetBusinessBuyerInfoResponse`
--
UPDATE `GetBusinessBuyerInfoResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetBusinessBuyerInfoResponse`
--
DELETE FROM `GetBusinessBuyerInfoResponse` WHERE 0;

