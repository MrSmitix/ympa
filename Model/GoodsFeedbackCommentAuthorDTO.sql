--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackCommentAuthorDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackCommentAuthorDTO`
--
SELECT `type`, `name` FROM `GoodsFeedbackCommentAuthorDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackCommentAuthorDTO`
--
INSERT INTO `GoodsFeedbackCommentAuthorDTO`(`type`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `GoodsFeedbackCommentAuthorDTO`
--
UPDATE `GoodsFeedbackCommentAuthorDTO` SET `type` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackCommentAuthorDTO`
--
DELETE FROM `GoodsFeedbackCommentAuthorDTO` WHERE 0;

