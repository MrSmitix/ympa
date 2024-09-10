<?php
/**
 * FeedPublicationDTO
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
 * Class representing the FeedPublicationDTO model.
 *
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class FeedPublicationDTO  implements \JsonSerializable
{
        /**
     * @var FeedStatusType|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    public ?FeedStatusType $status;

    /**
     * @var FeedPublicationFullDTO|null
     * @SerializedName("full")
     * @Assert\Type("\OpenAPIServer\Model\FeedPublicationFullDTO")
     * @Type("\OpenAPIServer\Model\FeedPublicationFullDTO")
     */
    public ?FeedPublicationFullDTO $full;

    /**
     * @var FeedPublicationPriceAndStockUpdateDTO|null
     * @SerializedName("priceAndStockUpdate")
     * @Assert\Type("\OpenAPIServer\Model\FeedPublicationPriceAndStockUpdateDTO")
     * @Type("\OpenAPIServer\Model\FeedPublicationPriceAndStockUpdateDTO")
     */
    public ?FeedPublicationPriceAndStockUpdateDTO $priceAndStockUpdate;

    /**
     * Constructor
     *
     * @param FeedStatusType|null $status
     * @param FeedPublicationFullDTO|null $full
     * @param FeedPublicationPriceAndStockUpdateDTO|null $priceAndStockUpdate
     */
    public function __construct(?FeedStatusType $status, ?FeedPublicationFullDTO $full, ?FeedPublicationPriceAndStockUpdateDTO $priceAndStockUpdate)
    {
        $this->status = $status;
        $this->full = $full;
        $this->priceAndStockUpdate = $priceAndStockUpdate;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['status']) ? FeedStatusType::tryFrom($data['status']) : null, 
            isset($data['full']) ? FeedPublicationFullDTO::fromArray($data['full']) : null, 
            isset($data['priceAndStockUpdate']) ? FeedPublicationPriceAndStockUpdateDTO::fromArray($data['priceAndStockUpdate']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'status' => $this->status, 
            'full' => $this->full, 
            'priceAndStockUpdate' => $this->priceAndStockUpdate, 
        ];
    }
}


