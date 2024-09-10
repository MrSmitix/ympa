<?php
/**
 * FeedIndexLogsResultDTO
 */
namespace app\Models;

/**
 * FeedIndexLogsResultDTO
 * @description Результат выполнения запроса отчета по индексации прайс-листа.
 */
class FeedIndexLogsResultDTO {

    /** @var \app\Models\FeedIndexLogsFeedDTO $feed */
    public $feed;

    /** @var \app\Models\FeedIndexLogsRecordDTO[] $indexLogRecords Список отчетов по индексации прайс-листа.*/
    public $indexLogRecords = [];

    /** @var int $total Количество отчетов на всех страницах выходных данных.*/
    public $total = 0;

}
