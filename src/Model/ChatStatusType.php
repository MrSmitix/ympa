<?php
/**
 * ChatStatusType
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
 * ChatStatusType Class Doc Comment
 *
 * @description Статус чата:  * &#x60;NEW&#x60; — новый чат. * &#x60;WAITING_FOR_CUSTOMER&#x60; — нужен ответ покупателя. * &#x60;WAITING_FOR_PARTNER&#x60; — нужен ответ магазина. * &#x60;WAITING_FOR_ARBITER&#x60; — нужен ответ арбитра. * &#x60;WAITING_FOR_MARKET&#x60; — нужен ответ Маркета. * &#x60;FINISHED&#x60; — чат завершен.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
enum ChatStatusType: string
{
    case _NEW = 'NEW';

    case WAITING_FOR_CUSTOMER = 'WAITING_FOR_CUSTOMER';

    case WAITING_FOR_PARTNER = 'WAITING_FOR_PARTNER';

    case WAITING_FOR_ARBITER = 'WAITING_FOR_ARBITER';

    case WAITING_FOR_MARKET = 'WAITING_FOR_MARKET';

    case FINISHED = 'FINISHED';

}


