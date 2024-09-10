<?php
/**
 * UpdateOfferMappingDTO
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
 * Class representing the UpdateOfferMappingDTO model.
 *
 * Информация о товаре.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class UpdateOfferMappingDTO  implements \JsonSerializable
{
        /**
     * @var UpdateOfferDTO
     * @SerializedName("offer")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("\OpenAPIServer\Model\UpdateOfferDTO")
     * @Type("\OpenAPIServer\Model\UpdateOfferDTO")
     */
    public UpdateOfferDTO $offer;

    /**
     * @var UpdateMappingDTO|null
     * @SerializedName("mapping")
     * @Assert\Type("\OpenAPIServer\Model\UpdateMappingDTO")
     * @Type("\OpenAPIServer\Model\UpdateMappingDTO")
     */
    public ?UpdateMappingDTO $mapping;

    /**
     * Constructor
     *
     * @param UpdateOfferDTO $offer
     * @param UpdateMappingDTO|null $mapping
     */
    public function __construct(UpdateOfferDTO $offer, ?UpdateMappingDTO $mapping)
    {
        $this->offer = $offer;
        $this->mapping = $mapping;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['offer']) ? UpdateOfferDTO::fromArray($data['offer']) : null, 
            isset($data['mapping']) ? UpdateMappingDTO::fromArray($data['mapping']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'offer' => $this->offer, 
            'mapping' => $this->mapping, 
        ];
    }
}


