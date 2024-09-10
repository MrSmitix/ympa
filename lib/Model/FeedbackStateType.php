<?php
/**
 * FeedbackStateType
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
 * FeedbackStateType Class Doc Comment
 *
 * @category Class
 * @description Статус отзыва:  * &#x60;LAST&#x60; — актуален. * &#x60;PREVIOUS&#x60; — устарел. * &#x60;DELETED&#x60; — удален.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class FeedbackStateType
{
    /**
     * Possible values of this enum
     */
    public const LAST = 'LAST';

    public const PREVIOUS = 'PREVIOUS';

    public const DELETED = 'DELETED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::LAST,
            self::PREVIOUS,
            self::DELETED
        ];
    }
}


