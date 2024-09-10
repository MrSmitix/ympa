--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackDTO`
--
SELECT `feedbackId`, `createdAt`, `needReaction`, `identifiers`, `author`, `description`, `media`, `statistics` FROM `GoodsFeedbackDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackDTO`
--
INSERT INTO `GoodsFeedbackDTO`(`feedbackId`, `createdAt`, `needReaction`, `identifiers`, `author`, `description`, `media`, `statistics`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GoodsFeedbackDTO`
--
UPDATE `GoodsFeedbackDTO` SET `feedbackId` = ?, `createdAt` = ?, `needReaction` = ?, `identifiers` = ?, `author` = ?, `description` = ?, `media` = ?, `statistics` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackDTO`
--
DELETE FROM `GoodsFeedbackDTO` WHERE 0;

