<?php
/**
 * UpdateBusinessPricesRequest
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
 * Class representing the UpdateBusinessPricesRequest model.
 *
 * Запрос на установку базовых цен на товары.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class UpdateBusinessPricesRequest  implements \JsonSerializable
{
        /**
     * Список товаров с ценами.
     *
     * @var UpdateBusinessOfferPriceDTO[]
     * @SerializedName("offers")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\UpdateBusinessOfferPriceDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\UpdateBusinessOfferPriceDTO>")
     * @Assert\Count(
     *   max = 500
     * )
     * @Assert\Count(
     *   min = 1
     * )
     */
    public array $offers;

    /**
     * Constructor
     *
     * @param UpdateBusinessOfferPriceDTO[] $offers
     */
    public function __construct(array $offers)
    {
        $this->offers = $offers;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['offers']) ? array_map(fn($item) => UpdateBusinessOfferPriceDTO::fromArray($item), $data['offers']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'offers' => $this->offers, 
        ];
    }
}


