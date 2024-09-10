--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'FeedPublicationPriceAndStockUpdateDTO' definition.
--


--
-- SELECT template for table `FeedPublicationPriceAndStockUpdateDTO`
--
SELECT `fileTime`, `publishedTime` FROM `FeedPublicationPriceAndStockUpdateDTO` WHERE 1;

--
-- INSERT template for table `FeedPublicationPriceAndStockUpdateDTO`
--
INSERT INTO `FeedPublicationPriceAndStockUpdateDTO`(`fileTime`, `publishedTime`) VALUES (?, ?);

--
-- UPDATE template for table `FeedPublicationPriceAndStockUpdateDTO`
--
UPDATE `FeedPublicationPriceAndStockUpdateDTO` SET `fileTime` = ?, `publishedTime` = ? WHERE 1;

--
-- DELETE template for table `FeedPublicationPriceAndStockUpdateDTO`
--
DELETE FROM `FeedPublicationPriceAndStockUpdateDTO` WHERE 0;

