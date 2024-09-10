--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UpdateGoodsFeedbackCommentDTO' definition.
--


--
-- SELECT template for table `UpdateGoodsFeedbackCommentDTO`
--
SELECT `id`, `parentId`, `text` FROM `UpdateGoodsFeedbackCommentDTO` WHERE 1;

--
-- INSERT template for table `UpdateGoodsFeedbackCommentDTO`
--
INSERT INTO `UpdateGoodsFeedbackCommentDTO`(`id`, `parentId`, `text`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdateGoodsFeedbackCommentDTO`
--
UPDATE `UpdateGoodsFeedbackCommentDTO` SET `id` = ?, `parentId` = ?, `text` = ? WHERE 1;

--
-- DELETE template for table `UpdateGoodsFeedbackCommentDTO`
--
DELETE FROM `UpdateGoodsFeedbackCommentDTO` WHERE 0;

