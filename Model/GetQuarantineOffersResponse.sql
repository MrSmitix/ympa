--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetQuarantineOffersResponse' definition.
--


--
-- SELECT template for table `GetQuarantineOffersResponse`
--
SELECT `status`, `result` FROM `GetQuarantineOffersResponse` WHERE 1;

--
-- INSERT template for table `GetQuarantineOffersResponse`
--
INSERT INTO `GetQuarantineOffersResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetQuarantineOffersResponse`
--
UPDATE `GetQuarantineOffersResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetQuarantineOffersResponse`
--
DELETE FROM `GetQuarantineOffersResponse` WHERE 0;

