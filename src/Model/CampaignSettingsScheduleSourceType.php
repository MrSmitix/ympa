<?php
/**
 * CampaignSettingsScheduleSourceType
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
 * CampaignSettingsScheduleSourceType Class Doc Comment
 *
 * @description Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
enum CampaignSettingsScheduleSourceType: string
{
    case WEB = 'WEB';

    case YML = 'YML';

}


