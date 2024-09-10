--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedbackCommentAuthorDTO' definition.
--


--
-- SELECT template for table `FeedbackCommentAuthorDTO`
--
SELECT `type`, `name` FROM `FeedbackCommentAuthorDTO` WHERE 1;

--
-- INSERT template for table `FeedbackCommentAuthorDTO`
--
INSERT INTO `FeedbackCommentAuthorDTO`(`type`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `FeedbackCommentAuthorDTO`
--
UPDATE `FeedbackCommentAuthorDTO` SET `type` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `FeedbackCommentAuthorDTO`
--
DELETE FROM `FeedbackCommentAuthorDTO` WHERE 0;

