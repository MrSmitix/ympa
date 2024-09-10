<?php
/**
 * FeedIndexLogsOffersDTO
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
 * Class representing the FeedIndexLogsOffersDTO model.
 *
 * Информация о предложениях прайс-листа.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class FeedIndexLogsOffersDTO  implements \JsonSerializable
{
        /**
     * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
     *
     * @var int|null
     * @SerializedName("rejectedCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $rejectedCount;

    /**
     * Количество предложений в прайс-листе.
     *
     * @var int|null
     * @SerializedName("totalCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $totalCount;

    /**
     * Constructor
     *
     * @param int|null $rejectedCount
     * @param int|null $totalCount
     */
    public function __construct(?int $rejectedCount, ?int $totalCount)
    {
        $this->rejectedCount = $rejectedCount;
        $this->totalCount = $totalCount;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['rejectedCount'] ?? null, 
            $data['totalCount'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'rejectedCount' => $this->rejectedCount, 
            'totalCount' => $this->totalCount, 
        ];
    }
}


