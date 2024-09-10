--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'AcceptOrderCancellationRequest' definition.
--


--
-- SELECT template for table `AcceptOrderCancellationRequest`
--
SELECT `accepted`, `reason` FROM `AcceptOrderCancellationRequest` WHERE 1;

--
-- INSERT template for table `AcceptOrderCancellationRequest`
--
INSERT INTO `AcceptOrderCancellationRequest`(`accepted`, `reason`) VALUES (?, ?);

--
-- UPDATE template for table `AcceptOrderCancellationRequest`
--
UPDATE `AcceptOrderCancellationRequest` SET `accepted` = ?, `reason` = ? WHERE 1;

--
-- DELETE template for table `AcceptOrderCancellationRequest`
--
DELETE FROM `AcceptOrderCancellationRequest` WHERE 0;

