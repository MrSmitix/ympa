<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список отчетов по индексации прайс-листа.
 */
class FeedIndexLogsRecordDTO
{
    /**
     * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.
     * @DTA\Data(field="downloadTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $download_time = null;

    /**
     * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.
     * @DTA\Data(field="fileTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $file_time = null;

    /**
     * Идентификатор индексации.
     * @DTA\Data(field="generationId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $generation_id = null;

    /**
     * @DTA\Data(field="indexType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsIndexType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsIndexType::class})
     */
    public ?\App\DTO\FeedIndexLogsIndexType $index_type = null;

    /**
     * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.
     * @DTA\Data(field="publishedTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $published_time = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsStatusType::class})
     */
    public ?\App\DTO\FeedIndexLogsStatusType $status = null;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsErrorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsErrorDTO::class})
     */
    public ?\App\DTO\FeedIndexLogsErrorDTO $error = null;

    /**
     * @DTA\Data(field="offers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsOffersDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsOffersDTO::class})
     */
    public ?\App\DTO\FeedIndexLogsOffersDTO $offers = null;

}
