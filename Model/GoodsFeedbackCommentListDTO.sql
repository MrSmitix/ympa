--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackCommentListDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackCommentListDTO`
--
SELECT `comments`, `paging` FROM `GoodsFeedbackCommentListDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackCommentListDTO`
--
INSERT INTO `GoodsFeedbackCommentListDTO`(`comments`, `paging`) VALUES (?, ?);

--
-- UPDATE template for table `GoodsFeedbackCommentListDTO`
--
UPDATE `GoodsFeedbackCommentListDTO` SET `comments` = ?, `paging` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackCommentListDTO`
--
DELETE FROM `GoodsFeedbackCommentListDTO` WHERE 0;

