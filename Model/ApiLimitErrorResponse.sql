--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiLimitErrorResponse' definition.
--


--
-- SELECT template for table `ApiLimitErrorResponse`
--
SELECT `status`, `errors` FROM `ApiLimitErrorResponse` WHERE 1;

--
-- INSERT template for table `ApiLimitErrorResponse`
--
INSERT INTO `ApiLimitErrorResponse`(`status`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `ApiLimitErrorResponse`
--
UPDATE `ApiLimitErrorResponse` SET `status` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ApiLimitErrorResponse`
--
DELETE FROM `ApiLimitErrorResponse` WHERE 0;

