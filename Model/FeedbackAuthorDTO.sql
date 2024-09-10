--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedbackAuthorDTO' definition.
--


--
-- SELECT template for table `FeedbackAuthorDTO`
--
SELECT `name`, `region` FROM `FeedbackAuthorDTO` WHERE 1;

--
-- INSERT template for table `FeedbackAuthorDTO`
--
INSERT INTO `FeedbackAuthorDTO`(`name`, `region`) VALUES (?, ?);

--
-- UPDATE template for table `FeedbackAuthorDTO`
--
UPDATE `FeedbackAuthorDTO` SET `name` = ?, `region` = ? WHERE 1;

--
-- DELETE template for table `FeedbackAuthorDTO`
--
DELETE FROM `FeedbackAuthorDTO` WHERE 0;

