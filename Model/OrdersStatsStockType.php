<?php
/**
 * OrdersStatsStockType
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
 * Class representing the OrdersStatsStockType model.
 *
 * Тип товара:  * &#x60;DEFECT&#x60; — товар бракованный.  * &#x60;FIT&#x60; — товар надлежащего качества.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */
enum OrdersStatsStockType: string
{
        case FIT = 'FIT';
        case FREEZE = 'FREEZE';
        case AVAILABLE = 'AVAILABLE';
        case QUARANTINE = 'QUARANTINE';
        case UTILIZATION = 'UTILIZATION';
        case DEFECT = 'DEFECT';
        case EXPIRED = 'EXPIRED';
}



