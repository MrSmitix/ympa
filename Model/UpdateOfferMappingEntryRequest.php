<?php
/**
 * UpdateOfferMappingEntryRequest
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
 * Class representing the UpdateOfferMappingEntryRequest model.
 *
 * Запрос на обновление товаров.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class UpdateOfferMappingEntryRequest  implements \JsonSerializable
{
        /**
     * Информация о товарах в каталоге.
     *
     * @var UpdateOfferMappingEntryDTO[]
     * @SerializedName("offerMappingEntries")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\UpdateOfferMappingEntryDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\UpdateOfferMappingEntryDTO>")
     * @Assert\Count(
     *   max = 500
     * )
     * @Assert\Count(
     *   min = 1
     * )
     */
    public array $offerMappingEntries;

    /**
     * Constructor
     *
     * @param UpdateOfferMappingEntryDTO[] $offerMappingEntries
     */
    public function __construct(array $offerMappingEntries)
    {
        $this->offerMappingEntries = $offerMappingEntries;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['offerMappingEntries']) ? array_map(fn($item) => UpdateOfferMappingEntryDTO::fromArray($item), $data['offerMappingEntries']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'offerMappingEntries' => $this->offerMappingEntries, 
        ];
    }
}


