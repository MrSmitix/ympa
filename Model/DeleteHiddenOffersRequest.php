<?php
/**
 * DeleteHiddenOffersRequest
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
 * Class representing the DeleteHiddenOffersRequest model.
 *
 * Запрос на возобновление показа оферов.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class DeleteHiddenOffersRequest  implements \JsonSerializable
{
        /**
     * Список скрытых товаров.
     *
     * @var HiddenOfferDTO[]
     * @SerializedName("hiddenOffers")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\HiddenOfferDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\HiddenOfferDTO>")
     * @Assert\Count(
     *   max = 500
     * )
     * @Assert\Count(
     *   min = 1
     * )
     */
    public array $hiddenOffers;

    /**
     * Constructor
     *
     * @param HiddenOfferDTO[] $hiddenOffers
     */
    public function __construct(array $hiddenOffers)
    {
        $this->hiddenOffers = $hiddenOffers;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['hiddenOffers']) ? array_map(fn($item) => HiddenOfferDTO::fromArray($item), $data['hiddenOffers']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'hiddenOffers' => $this->hiddenOffers, 
        ];
    }
}


