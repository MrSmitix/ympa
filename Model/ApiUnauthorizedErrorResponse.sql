--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiUnauthorizedErrorResponse' definition.
--


--
-- SELECT template for table `ApiUnauthorizedErrorResponse`
--
SELECT `status`, `errors` FROM `ApiUnauthorizedErrorResponse` WHERE 1;

--
-- INSERT template for table `ApiUnauthorizedErrorResponse`
--
INSERT INTO `ApiUnauthorizedErrorResponse`(`status`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `ApiUnauthorizedErrorResponse`
--
UPDATE `ApiUnauthorizedErrorResponse` SET `status` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ApiUnauthorizedErrorResponse`
--
DELETE FROM `ApiUnauthorizedErrorResponse` WHERE 0;

