<?php
/**
 * OfferCardRecommendationDTO
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
 * Class representing the OfferCardRecommendationDTO model.
 *
 * Рекомендация по заполнению карточки товара.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OfferCardRecommendationDTO  implements \JsonSerializable
{
        /**
     * @var OfferCardRecommendationType
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public OfferCardRecommendationType $type;

    /**
     * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
     *
     * @var int|null
     * @SerializedName("percent")
     * @Assert\Type("int")
     * @Type("int")
     * @Assert\GreaterThanOrEqual(0)
     * @Assert\LessThan(100)
     */
    public ?int $percent;

    /**
     * Constructor
     *
     * @param OfferCardRecommendationType $type
     * @param int|null $percent
     */
    public function __construct(OfferCardRecommendationType $type, ?int $percent)
    {
        $this->type = $type;
        $this->percent = $percent;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['type']) ? OfferCardRecommendationType::tryFrom($data['type']) : null, 
            $data['percent'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'type' => $this->type, 
            'percent' => $this->percent, 
        ];
    }
}


