--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiNotFoundErrorResponse' definition.
--


--
-- SELECT template for table `ApiNotFoundErrorResponse`
--
SELECT `status`, `errors` FROM `ApiNotFoundErrorResponse` WHERE 1;

--
-- INSERT template for table `ApiNotFoundErrorResponse`
--
INSERT INTO `ApiNotFoundErrorResponse`(`status`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `ApiNotFoundErrorResponse`
--
UPDATE `ApiNotFoundErrorResponse` SET `status` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ApiNotFoundErrorResponse`
--
DELETE FROM `ApiNotFoundErrorResponse` WHERE 0;

