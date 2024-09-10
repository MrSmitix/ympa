--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GetOutletLicensesResponse' definition.
--


--
-- SELECT template for table `GetOutletLicensesResponse`
--
SELECT `status`, `result` FROM `GetOutletLicensesResponse` WHERE 1;

--
-- INSERT template for table `GetOutletLicensesResponse`
--
INSERT INTO `GetOutletLicensesResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `GetOutletLicensesResponse`
--
UPDATE `GetOutletLicensesResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `GetOutletLicensesResponse`
--
DELETE FROM `GetOutletLicensesResponse` WHERE 0;

