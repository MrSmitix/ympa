<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */
class FeedIndexLogsResultDTO
{
    /**
     * @DTA\Data(field="feed", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsFeedDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsFeedDTO::class})
     */
    public ?\App\DTO\FeedIndexLogsFeedDTO $feed = null;

    /**
     * Список отчетов по индексации прайс-листа.
     * @DTA\Data(field="indexLogRecords")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $index_log_records = null;

    /**
     * Количество отчетов на всех страницах выходных данных.
     * @DTA\Data(field="total", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total = null;

}
