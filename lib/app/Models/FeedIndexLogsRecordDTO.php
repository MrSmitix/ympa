<?php
/**
 * FeedIndexLogsRecordDTO
 */
namespace app\Models;

/**
 * FeedIndexLogsRecordDTO
 * @description Список отчетов по индексации прайс-листа.
 */
class FeedIndexLogsRecordDTO {

    /** @var \DateTime $downloadTime Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.*/
    public $downloadTime;

    /** @var \DateTime $fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.*/
    public $fileTime;

    /** @var int $generationId Идентификатор индексации.*/
    public $generationId = 0;

    /** @var string $indexType */
    public $indexType = "";

    /** @var \DateTime $publishedTime Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.*/
    public $publishedTime;

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\FeedIndexLogsErrorDTO $error */
    public $error;

    /** @var \app\Models\FeedIndexLogsOffersDTO $offers */
    public $offers;

}
