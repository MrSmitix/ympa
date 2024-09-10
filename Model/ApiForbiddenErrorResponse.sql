--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ApiForbiddenErrorResponse' definition.
--


--
-- SELECT template for table `ApiForbiddenErrorResponse`
--
SELECT `status`, `errors` FROM `ApiForbiddenErrorResponse` WHERE 1;

--
-- INSERT template for table `ApiForbiddenErrorResponse`
--
INSERT INTO `ApiForbiddenErrorResponse`(`status`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `ApiForbiddenErrorResponse`
--
UPDATE `ApiForbiddenErrorResponse` SET `status` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ApiForbiddenErrorResponse`
--
DELETE FROM `ApiForbiddenErrorResponse` WHERE 0;

