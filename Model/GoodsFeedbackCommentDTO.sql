--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackCommentDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackCommentDTO`
--
SELECT `id`, `text`, `canModify`, `parentId`, `author`, `status` FROM `GoodsFeedbackCommentDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackCommentDTO`
--
INSERT INTO `GoodsFeedbackCommentDTO`(`id`, `text`, `canModify`, `parentId`, `author`, `status`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GoodsFeedbackCommentDTO`
--
UPDATE `GoodsFeedbackCommentDTO` SET `id` = ?, `text` = ?, `canModify` = ?, `parentId` = ?, `author` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackCommentDTO`
--
DELETE FROM `GoodsFeedbackCommentDTO` WHERE 0;

