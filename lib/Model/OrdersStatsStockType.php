<?php
/**
 * OrdersStatsStockType
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.8.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;
use \OpenAPI\Client\ObjectSerializer;

/**
 * OrdersStatsStockType Class Doc Comment
 *
 * @category Class
 * @description Тип товара:  * &#x60;DEFECT&#x60; — товар бракованный.  * &#x60;FIT&#x60; — товар надлежащего качества.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class OrdersStatsStockType
{
    /**
     * Possible values of this enum
     */
    public const FIT = 'FIT';

    public const FREEZE = 'FREEZE';

    public const AVAILABLE = 'AVAILABLE';

    public const QUARANTINE = 'QUARANTINE';

    public const UTILIZATION = 'UTILIZATION';

    public const DEFECT = 'DEFECT';

    public const EXPIRED = 'EXPIRED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FIT,
            self::FREEZE,
            self::AVAILABLE,
            self::QUARANTINE,
            self::UTILIZATION,
            self::DEFECT,
            self::EXPIRED
        ];
    }
}


