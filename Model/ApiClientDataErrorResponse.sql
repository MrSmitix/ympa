--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiClientDataErrorResponse' definition.
--


--
-- SELECT template for table `ApiClientDataErrorResponse`
--
SELECT `status`, `errors` FROM `ApiClientDataErrorResponse` WHERE 1;

--
-- INSERT template for table `ApiClientDataErrorResponse`
--
INSERT INTO `ApiClientDataErrorResponse`(`status`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `ApiClientDataErrorResponse`
--
UPDATE `ApiClientDataErrorResponse` SET `status` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ApiClientDataErrorResponse`
--
DELETE FROM `ApiClientDataErrorResponse` WHERE 0;

