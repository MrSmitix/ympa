--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'VerifyOrderEacResponse' definition.
--


--
-- SELECT template for table `VerifyOrderEacResponse`
--
SELECT `status`, `result` FROM `VerifyOrderEacResponse` WHERE 1;

--
-- INSERT template for table `VerifyOrderEacResponse`
--
INSERT INTO `VerifyOrderEacResponse`(`status`, `result`) VALUES (?, ?);

--
-- UPDATE template for table `VerifyOrderEacResponse`
--
UPDATE `VerifyOrderEacResponse` SET `status` = ?, `result` = ? WHERE 1;

--
-- DELETE template for table `VerifyOrderEacResponse`
--
DELETE FROM `VerifyOrderEacResponse` WHERE 0;

