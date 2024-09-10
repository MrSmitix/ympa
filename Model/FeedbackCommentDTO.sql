--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedbackCommentDTO' definition.
--


--
-- SELECT template for table `FeedbackCommentDTO`
--
SELECT `id`, `parentId`, `body`, `createdAt`, `updatedAt`, `author`, `children` FROM `FeedbackCommentDTO` WHERE 1;

--
-- INSERT template for table `FeedbackCommentDTO`
--
INSERT INTO `FeedbackCommentDTO`(`id`, `parentId`, `body`, `createdAt`, `updatedAt`, `author`, `children`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FeedbackCommentDTO`
--
UPDATE `FeedbackCommentDTO` SET `id` = ?, `parentId` = ?, `body` = ?, `createdAt` = ?, `updatedAt` = ?, `author` = ?, `children` = ? WHERE 1;

--
-- DELETE template for table `FeedbackCommentDTO`
--
DELETE FROM `FeedbackCommentDTO` WHERE 0;

