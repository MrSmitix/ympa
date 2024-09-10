--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GoodsFeedbackMediaDTO' definition.
--


--
-- SELECT template for table `GoodsFeedbackMediaDTO`
--
SELECT `photos`, `videos` FROM `GoodsFeedbackMediaDTO` WHERE 1;

--
-- INSERT template for table `GoodsFeedbackMediaDTO`
--
INSERT INTO `GoodsFeedbackMediaDTO`(`photos`, `videos`) VALUES (?, ?);

--
-- UPDATE template for table `GoodsFeedbackMediaDTO`
--
UPDATE `GoodsFeedbackMediaDTO` SET `photos` = ?, `videos` = ? WHERE 1;

--
-- DELETE template for table `GoodsFeedbackMediaDTO`
--
DELETE FROM `GoodsFeedbackMediaDTO` WHERE 0;

