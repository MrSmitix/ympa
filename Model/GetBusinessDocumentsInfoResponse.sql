--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetBusinessDocumentsInfoResponse' definition.
--


--
-- SELECT template for table `GetBusinessDocumentsInfoResponse`
--
SELECT `status`, `result` FROM `GetBusinessDocumentsInfoResponse` WHERE 1;

--
-- INSERT template for table `GetBusinessDocumentsInfoResponse`
--
INSERT INTO `GetBusinessDocumentsInfoResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetBusinessDocumentsInfoResponse`
--
UPDATE `GetBusinessDocumentsInfoResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetBusinessDocumentsInfoResponse`
--
DELETE FROM `GetBusinessDocumentsInfoResponse` WHERE 0;

