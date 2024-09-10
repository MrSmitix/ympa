--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateGoodsFeedbackCommentRequest' definition.
--


--
-- SELECT template for table `UpdateGoodsFeedbackCommentRequest`
--
SELECT `feedbackId`, `comment` FROM `UpdateGoodsFeedbackCommentRequest` WHERE 1;

--
-- INSERT template for table `UpdateGoodsFeedbackCommentRequest`
--
INSERT INTO `UpdateGoodsFeedbackCommentRequest`(`feedbackId`, `comment`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateGoodsFeedbackCommentRequest`
--
UPDATE `UpdateGoodsFeedbackCommentRequest` SET `feedbackId` = ?, `comment` = ? WHERE 1;

--
-- DELETE template for table `UpdateGoodsFeedbackCommentRequest`
--
DELETE FROM `UpdateGoodsFeedbackCommentRequest` WHERE 0;

