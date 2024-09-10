--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiServerErrorResponse' definition.
--


--
-- SELECT template for table `ApiServerErrorResponse`
--
SELECT `status`, `errors` FROM `ApiServerErrorResponse` WHERE 1;

--
-- INSERT template for table `ApiServerErrorResponse`
--
INSERT INTO `ApiServerErrorResponse`(`status`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `ApiServerErrorResponse`
--
UPDATE `ApiServerErrorResponse` SET `status` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ApiServerErrorResponse`
--
DELETE FROM `ApiServerErrorResponse` WHERE 0;

