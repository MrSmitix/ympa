--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedbackFactorDTO' definition.
--


--
-- SELECT template for table `FeedbackFactorDTO`
--
SELECT `id`, `title`, `description`, `value` FROM `FeedbackFactorDTO` WHERE 1;

--
-- INSERT template for table `FeedbackFactorDTO`
--
INSERT INTO `FeedbackFactorDTO`(`id`, `title`, `description`, `value`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `FeedbackFactorDTO`
--
UPDATE `FeedbackFactorDTO` SET `id` = ?, `title` = ?, `description` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `FeedbackFactorDTO`
--
DELETE FROM `FeedbackFactorDTO` WHERE 0;

