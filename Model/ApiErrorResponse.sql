--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiErrorResponse' definition.
--


--
-- SELECT template for table `ApiErrorResponse`
--
SELECT `status`, `errors` FROM `ApiErrorResponse` WHERE 1;

--
-- INSERT template for table `ApiErrorResponse`
--
INSERT INTO `ApiErrorResponse`(`status`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `ApiErrorResponse`
--
UPDATE `ApiErrorResponse` SET `status` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ApiErrorResponse`
--
DELETE FROM `ApiErrorResponse` WHERE 0;

