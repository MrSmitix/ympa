--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'SkipGoodsFeedbackReactionRequest' definition.
--


--
-- SELECT template for table `SkipGoodsFeedbackReactionRequest`
--
SELECT `feedbackIds` FROM `SkipGoodsFeedbackReactionRequest` WHERE 1;

--
-- INSERT template for table `SkipGoodsFeedbackReactionRequest`
--
INSERT INTO `SkipGoodsFeedbackReactionRequest`(`feedbackIds`) VALUES (?);

--
-- UPDATE template for table `SkipGoodsFeedbackReactionRequest`
--
UPDATE `SkipGoodsFeedbackReactionRequest` SET `feedbackIds` = ? WHERE 1;

--
-- DELETE template for table `SkipGoodsFeedbackReactionRequest`
--
DELETE FROM `SkipGoodsFeedbackReactionRequest` WHERE 0;

