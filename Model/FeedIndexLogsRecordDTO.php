<?php
/**
 * FeedIndexLogsRecordDTO
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */


namespace OpenAPIServer\Model;

/**
 * Class representing the FeedIndexLogsRecordDTO model.
 *
 * Список отчетов по индексации прайс-листа.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class FeedIndexLogsRecordDTO  implements \JsonSerializable
{
        /**
     * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.
     *
     * @var \DateTime|null
     * @SerializedName("downloadTime")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    public ?\DateTime $downloadTime;

    /**
     * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.
     *
     * @var \DateTime|null
     * @SerializedName("fileTime")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    public ?\DateTime $fileTime;

    /**
     * Идентификатор индексации.
     *
     * @var int|null
     * @SerializedName("generationId")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $generationId;

    /**
     * @var FeedIndexLogsIndexType|null
     * @SerializedName("indexType")
        * @Accessor(getter="getSerializedIndexType")
        * @Type("string")
     */
    public ?FeedIndexLogsIndexType $indexType;

    /**
     * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.
     *
     * @var \DateTime|null
     * @SerializedName("publishedTime")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    public ?\DateTime $publishedTime;

    /**
     * @var FeedIndexLogsStatusType|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    public ?FeedIndexLogsStatusType $status;

    /**
     * @var FeedIndexLogsErrorDTO|null
     * @SerializedName("error")
     * @Assert\Type("\OpenAPIServer\Model\FeedIndexLogsErrorDTO")
     * @Type("\OpenAPIServer\Model\FeedIndexLogsErrorDTO")
     */
    public ?FeedIndexLogsErrorDTO $error;

    /**
     * @var FeedIndexLogsOffersDTO|null
     * @SerializedName("offers")
     * @Assert\Type("\OpenAPIServer\Model\FeedIndexLogsOffersDTO")
     * @Type("\OpenAPIServer\Model\FeedIndexLogsOffersDTO")
     */
    public ?FeedIndexLogsOffersDTO $offers;

    /**
     * Constructor
     *
     * @param \DateTime|null $downloadTime
     * @param \DateTime|null $fileTime
     * @param int|null $generationId
     * @param FeedIndexLogsIndexType|null $indexType
     * @param \DateTime|null $publishedTime
     * @param FeedIndexLogsStatusType|null $status
     * @param FeedIndexLogsErrorDTO|null $error
     * @param FeedIndexLogsOffersDTO|null $offers
     */
    public function __construct(?\DateTime $downloadTime, ?\DateTime $fileTime, ?int $generationId, ?FeedIndexLogsIndexType $indexType, ?\DateTime $publishedTime, ?FeedIndexLogsStatusType $status, ?FeedIndexLogsErrorDTO $error, ?FeedIndexLogsOffersDTO $offers)
    {
        $this->downloadTime = $downloadTime;
        $this->fileTime = $fileTime;
        $this->generationId = $generationId;
        $this->indexType = $indexType;
        $this->publishedTime = $publishedTime;
        $this->status = $status;
        $this->error = $error;
        $this->offers = $offers;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['downloadTime']) ? new \DateTime($data['downloadTime']) : null, 
            isset($data['fileTime']) ? new \DateTime($data['fileTime']) : null, 
            $data['generationId'] ?? null, 
            isset($data['indexType']) ? FeedIndexLogsIndexType::tryFrom($data['indexType']) : null, 
            isset($data['publishedTime']) ? new \DateTime($data['publishedTime']) : null, 
            isset($data['status']) ? FeedIndexLogsStatusType::tryFrom($data['status']) : null, 
            isset($data['error']) ? FeedIndexLogsErrorDTO::fromArray($data['error']) : null, 
            isset($data['offers']) ? FeedIndexLogsOffersDTO::fromArray($data['offers']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'downloadTime' => $this->downloadTime?->format('c'), 
            'fileTime' => $this->fileTime?->format('c'), 
            'generationId' => $this->generationId, 
            'indexType' => $this->indexType, 
            'publishedTime' => $this->publishedTime?->format('c'), 
            'status' => $this->status, 
            'error' => $this->error, 
            'offers' => $this->offers, 
        ];
    }
}


