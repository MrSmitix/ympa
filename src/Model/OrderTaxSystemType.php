<?php
/**
 * OrderTaxSystemType
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
 * OrderTaxSystemType Class Doc Comment
 *
 * @description Система налогообложения (СНО) магазина на момент оформления заказа:  * &#x60;ECHN&#x60; — единый сельскохозяйственный налог (ЕСХН).  * &#x60;ENVD&#x60; — единый налог на вмененный доход (ЕНВД).  * &#x60;OSN&#x60; — общая система налогообложения (ОСН).  * &#x60;PSN&#x60; — патентная система налогообложения (ПСН).  * &#x60;USN&#x60; — упрощенная система налогообложения (УСН).  * &#x60;USN_MINUS_COST&#x60; — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * &#x60;NPD&#x60; — налог на профессиональный доход (НПД).  * &#x60;UNKNOWN_VALUE&#x60; — неизвестное значение. Используется только совместно с параметром &#x60;payment-method&#x3D;YANDEX&#x60;.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
enum OrderTaxSystemType: string
{
    case OSN = 'OSN';

    case USN = 'USN';

    case USN_MINUS_COST = 'USN_MINUS_COST';

    case ENVD = 'ENVD';

    case ECHN = 'ECHN';

    case PSN = 'PSN';

    case NPD = 'NPD';

    case UNKNOWN_VALUE = 'UNKNOWN_VALUE';

}


