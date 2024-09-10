--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'EacVerificationResultDTO' definition.
--


--
-- SELECT template for table `EacVerificationResultDTO`
--
SELECT `verificationResult`, `attemptsLeft` FROM `EacVerificationResultDTO` WHERE 1;

--
-- INSERT template for table `EacVerificationResultDTO`
--
INSERT INTO `EacVerificationResultDTO`(`verificationResult`, `attemptsLeft`) VALUES (?, ?);

--
-- UPDATE template for table `EacVerificationResultDTO`
--
UPDATE `EacVerificationResultDTO` SET `verificationResult` = ?, `attemptsLeft` = ? WHERE 1;

--
-- DELETE template for table `EacVerificationResultDTO`
--
DELETE FROM `EacVerificationResultDTO` WHERE 0;

