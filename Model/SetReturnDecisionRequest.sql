--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SetReturnDecisionRequest' definition.
--


--
-- SELECT template for table `SetReturnDecisionRequest`
--
SELECT `returnItemId`, `decisionType`, `comment` FROM `SetReturnDecisionRequest` WHERE 1;

--
-- INSERT template for table `SetReturnDecisionRequest`
--
INSERT INTO `SetReturnDecisionRequest`(`returnItemId`, `decisionType`, `comment`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SetReturnDecisionRequest`
--
UPDATE `SetReturnDecisionRequest` SET `returnItemId` = ?, `decisionType` = ?, `comment` = ? WHERE 1;

--
-- DELETE template for table `SetReturnDecisionRequest`
--
DELETE FROM `SetReturnDecisionRequest` WHERE 0;

