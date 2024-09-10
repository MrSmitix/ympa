<?php
/**
 * GetModelsOffersResponse
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
 * Class representing the GetModelsOffersResponse model.
 *
 * Ответ на запрос списка предложений для моделей.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class GetModelsOffersResponse  implements \JsonSerializable
{
        /**
     * Список моделей товаров.
     *
     * @var EnrichedModelDTO[]
     * @SerializedName("models")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\EnrichedModelDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\EnrichedModelDTO>")
     */
    public array $models;

    /**
     * @var CurrencyType|null
     * @SerializedName("currency")
        * @Accessor(getter="getSerializedCurrency")
        * @Type("string")
     */
    public ?CurrencyType $currency;

    /**
     * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).
     *
     * @var int|null
     * @SerializedName("regionId")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $regionId;

    /**
     * Constructor
     *
     * @param EnrichedModelDTO[] $models
     * @param CurrencyType|null $currency
     * @param int|null $regionId
     */
    public function __construct(array $models, ?CurrencyType $currency, ?int $regionId)
    {
        $this->models = $models;
        $this->currency = $currency;
        $this->regionId = $regionId;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['models']) ? array_map(fn($item) => EnrichedModelDTO::fromArray($item), $data['models']) : null, 
            isset($data['currency']) ? CurrencyType::tryFrom($data['currency']) : null, 
            $data['regionId'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'models' => $this->models, 
            'currency' => $this->currency, 
            'regionId' => $this->regionId, 
        ];
    }
}


