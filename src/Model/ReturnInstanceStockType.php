<?php
/**
 * ReturnInstanceStockType
 *
 * PHP version 8.1
 *
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
 * @generated Generated by: https://openapi-generator.tech
 * Generator version: 7.8.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

/**
 * ReturnInstanceStockType Class Doc Comment
 *
 * @description Тип остатка на складе.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
enum ReturnInstanceStockType: string
{
    case FIT = 'FIT';

    case DEFECT = 'DEFECT';

    case ANOMALY = 'ANOMALY';

    case SURPLUS = 'SURPLUS';

    case EXPIRED = 'EXPIRED';

    case MISGRADING = 'MISGRADING';

    case UNDEFINED = 'UNDEFINED';

    case INCORRECT_IMEI = 'INCORRECT_IMEI';

    case INCORRECT_SERIAL_NUMBER = 'INCORRECT_SERIAL_NUMBER';

    case INCORRECT_CIS = 'INCORRECT_CIS';

    case PART_MISSING = 'PART_MISSING';

    case NON_COMPLIENT = 'NON_COMPLIENT';

    case NOT_ACCEPTABLE = 'NOT_ACCEPTABLE';

    case SERVICE = 'SERVICE';

    case MARKDOWN = 'MARKDOWN';

    case DEMO = 'DEMO';

    case REPAIR = 'REPAIR';

    case FIRMWARE = 'FIRMWARE';

    case UNKNOWN = 'UNKNOWN';

}

