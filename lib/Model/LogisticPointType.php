<?php
/**
 * LogisticPointType
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
 * LogisticPointType Class Doc Comment
 *
 * @category Class
 * @description Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class LogisticPointType
{
    /**
     * Possible values of this enum
     */
    public const WAREHOUSE = 'WAREHOUSE';

    public const PICKUP_POINT = 'PICKUP_POINT';

    public const PICKUP_TERMINAL = 'PICKUP_TERMINAL';

    public const PICKUP_POST_OFFICE = 'PICKUP_POST_OFFICE';

    public const PICKUP_MIXED = 'PICKUP_MIXED';

    public const PICKUP_RETAIL = 'PICKUP_RETAIL';

    public const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::WAREHOUSE,
            self::PICKUP_POINT,
            self::PICKUP_TERMINAL,
            self::PICKUP_POST_OFFICE,
            self::PICKUP_MIXED,
            self::PICKUP_RETAIL,
            self::UNKNOWN
        ];
    }
}


