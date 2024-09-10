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
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $download_time;

    /**
     * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.
     * @DTA\Data(field="fileTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $file_time;

    /**
     * Идентификатор индексации.
     * @DTA\Data(field="generationId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $generation_id;

    /**
     * @DTA\Data(field="indexType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsIndexType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsIndexType::class})
     * @var \App\DTO\FeedIndexLogsIndexType|null
     */
    public $index_type;

    /**
     * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.
     * @DTA\Data(field="publishedTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $published_time;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsStatusType::class})
     * @var \App\DTO\FeedIndexLogsStatusType|null
     */
    public $status;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsErrorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsErrorDTO::class})
     * @var \App\DTO\FeedIndexLogsErrorDTO|null
     */
    public $error;

    /**
     * @DTA\Data(field="offers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedIndexLogsOffersDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedIndexLogsOffersDTO::class})
     * @var \App\DTO\FeedIndexLogsOffersDTO|null
     */
    public $offers;

}
