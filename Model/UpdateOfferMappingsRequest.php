<?php
/**
 * UpdateOfferMappingsRequest
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
 * Class representing the UpdateOfferMappingsRequest model.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class UpdateOfferMappingsRequest  implements \JsonSerializable
{
        /**
     * Перечень товаров, которые нужно добавить или обновить.
     *
     * @var UpdateOfferMappingDTO[]
     * @SerializedName("offerMappings")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\UpdateOfferMappingDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\UpdateOfferMappingDTO>")
     * @Assert\Count(
     *   max = 500
     * )
     * @Assert\Count(
     *   min = 1
     * )
     */
    public array $offerMappings;

    /**
     * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;.
     *
     * @var bool|null
     * @SerializedName("onlyPartnerMediaContent")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    public ?bool $onlyPartnerMediaContent;

    /**
     * Constructor
     *
     * @param UpdateOfferMappingDTO[] $offerMappings
     * @param bool|null $onlyPartnerMediaContent
     */
    public function __construct(array $offerMappings, ?bool $onlyPartnerMediaContent)
    {
        $this->offerMappings = $offerMappings;
        $this->onlyPartnerMediaContent = $onlyPartnerMediaContent;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['offerMappings']) ? array_map(fn($item) => UpdateOfferMappingDTO::fromArray($item), $data['offerMappings']) : null, 
            $data['onlyPartnerMediaContent'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'offerMappings' => $this->offerMappings, 
            'onlyPartnerMediaContent' => $this->onlyPartnerMediaContent, 
        ];
    }
}


