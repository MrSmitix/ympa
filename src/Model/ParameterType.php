<?php
/**
 * ParameterType
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
 * ParameterType Class Doc Comment
 *
 * @description Тип данных:  * &#x60;TEXT&#x60; — текст. * &#x60;ENUM&#x60; — список возможных значений. * &#x60;BOOLEAN&#x60; — &#x60;true&#x60; или &#x60;false&#x60;. * &#x60;NUMERIC&#x60; — число.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
enum ParameterType: string
{
    case TEXT = 'TEXT';

    case ENUM = 'ENUM';

    case BOOLEAN = 'BOOLEAN';

    case NUMERIC = 'NUMERIC';

}

