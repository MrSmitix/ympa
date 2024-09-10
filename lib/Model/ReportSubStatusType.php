<?php
/**
 * ReportSubStatusType
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
 * ReportSubStatusType Class Doc Comment
 *
 * @category Class
 * @description Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class ReportSubStatusType
{
    /**
     * Possible values of this enum
     */
    public const NO_DATA = 'NO_DATA';

    public const TOO_LARGE = 'TOO_LARGE';

    public const RESOURCE_NOT_FOUND = 'RESOURCE_NOT_FOUND';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::NO_DATA,
            self::TOO_LARGE,
            self::RESOURCE_NOT_FOUND
        ];
    }
}


