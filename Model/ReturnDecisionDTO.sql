--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'ReturnDecisionDTO' definition.
--


--
-- SELECT template for table `ReturnDecisionDTO`
--
SELECT `returnItemId`, `count`, `comment`, `reasonType`, `subreasonType`, `decisionType`, `refundAmount`, `partnerCompensation`, `images` FROM `ReturnDecisionDTO` WHERE 1;

--
-- INSERT template for table `ReturnDecisionDTO`
--
INSERT INTO `ReturnDecisionDTO`(`returnItemId`, `count`, `comment`, `reasonType`, `subreasonType`, `decisionType`, `refundAmount`, `partnerCompensation`, `images`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ReturnDecisionDTO`
--
UPDATE `ReturnDecisionDTO` SET `returnItemId` = ?, `count` = ?, `comment` = ?, `reasonType` = ?, `subreasonType` = ?, `decisionType` = ?, `refundAmount` = ?, `partnerCompensation` = ?, `images` = ? WHERE 1;

--
-- DELETE template for table `ReturnDecisionDTO`
--
DELETE FROM `ReturnDecisionDTO` WHERE 0;

