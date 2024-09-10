<?php
/**
 * OrdersStatsCommissionDTO
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
 * Class representing the OrdersStatsCommissionDTO model.
 *
 * Информация о стоимости услуг.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OrdersStatsCommissionDTO  implements \JsonSerializable
{
        /**
     * @var OrdersStatsCommissionType|null
     * @SerializedName("type")
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public ?OrdersStatsCommissionType $type;

    /**
     * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.
     *
     * @var float|null
     * @SerializedName("actual")
     * @Assert\Type("float")
     * @Type("float")
     */
    public ?float $actual;

    /**
     * Constructor
     *
     * @param OrdersStatsCommissionType|null $type
     * @param float|null $actual
     */
    public function __construct(?OrdersStatsCommissionType $type, ?float $actual)
    {
        $this->type = $type;
        $this->actual = $actual;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['type']) ? OrdersStatsCommissionType::tryFrom($data['type']) : null, 
            $data['actual'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'type' => $this->type, 
            'actual' => $this->actual, 
        ];
    }
}


