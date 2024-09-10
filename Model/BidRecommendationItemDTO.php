<?php
/**
 * BidRecommendationItemDTO
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
 * Class representing the BidRecommendationItemDTO model.
 *
 * Рекомендованная ставка и возможная доля показов.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class BidRecommendationItemDTO  implements \JsonSerializable
{
        /**
     * Значение ставки.
     *
     * @var int
     * @SerializedName("bid")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     * @Assert\GreaterThanOrEqual(0)
     * @Assert\LessThanOrEqual(9999)
     */
    public int $bid;

    /**
     * Доля показов.
     *
     * @var int
     * @SerializedName("showPercent")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     * @Assert\GreaterThanOrEqual(0)
     * @Assert\LessThanOrEqual(100)
     */
    public int $showPercent;

    /**
     * Constructor
     *
     * @param int $bid
     * @param int $showPercent
     */
    public function __construct(int $bid, int $showPercent)
    {
        $this->bid = $bid;
        $this->showPercent = $showPercent;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['bid'] ?? null, 
            $data['showPercent'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'bid' => $this->bid, 
            'showPercent' => $this->showPercent, 
        ];
    }
}


