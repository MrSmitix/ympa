--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiLockedErrorResponse' definition.
--


--
-- SELECT template for table `ApiLockedErrorResponse`
--
SELECT `status`, `errors` FROM `ApiLockedErrorResponse` WHERE 1;

--
-- INSERT template for table `ApiLockedErrorResponse`
--
INSERT INTO `ApiLockedErrorResponse`(`status`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `ApiLockedErrorResponse`
--
UPDATE `ApiLockedErrorResponse` SET `status` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ApiLockedErrorResponse`
--
DELETE FROM `ApiLockedErrorResponse` WHERE 0;

