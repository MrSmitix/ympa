<?php

/**
 * Партнерский API Маркета
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

use OpenAPIServer\BaseModel;

/**
 * GetOrdersStatsRequest
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class GetOrdersStatsRequest extends BaseModel
{
    /**
     * @var string Models namespace.
     * Can be required for data deserialization when model contains referenced schemas.
     */
    protected const MODELS_NAMESPACE = '\OpenAPIServer\Model';

    /**
     * @var string Constant with OAS schema of current class.
     * Should be overwritten by inherited class.
     */
    protected const MODEL_SCHEMA = <<<'SCHEMA'
{
  "type" : "object",
  "properties" : {
    "dateFrom" : {
      "type" : "string",
      "description" : "Начальная дата, когда заказ был сформирован.\n\nФормат даты: `ГГГГ‑ММ‑ДД`.\n\nНельзя использовать вместе с параметрами `updateFrom` и `updateTo`.\n",
      "format" : "date"
    },
    "dateTo" : {
      "type" : "string",
      "description" : "Конечная дата, когда заказ был сформирован.\n\nФормат даты: `ГГГГ‑ММ‑ДД`.\n\nНельзя использовать вместе с параметрами `updateFrom` и `updateTo`.\n",
      "format" : "date"
    },
    "updateFrom" : {
      "type" : "string",
      "description" : "Начальная дата периода, за который были изменения статуса заказа.\n\nФормат даты: `ГГГГ‑ММ‑ДД`.\n\nНельзя использовать вместе с параметрами `dateFrom` и `dateTo`.\n",
      "format" : "date"
    },
    "updateTo" : {
      "type" : "string",
      "description" : "Конечная дата периода, за который были изменения статуса заказа.\n\nФормат даты: `ГГГГ‑ММ‑ДД`.\n\nНельзя использовать вместе с параметрами `dateFrom` и `dateTo`.\n",
      "format" : "date"
    },
    "orders" : {
      "type" : "array",
      "description" : "Список идентификаторов заказов.",
      "nullable" : true,
      "items" : {
        "type" : "integer",
        "description" : "Список товаров в заказе после возможных изменений.\n\nВ ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.\n\n* Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.\n\n* Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`).\n",
        "format" : "int64"
      }
    },
    "statuses" : {
      "type" : "array",
      "description" : "Список статусов заказов.",
      "nullable" : true,
      "items" : {
        "$ref" : "#/components/schemas/OrderStatsStatusType"
      }
    },
    "hasCis" : {
      "type" : "boolean",
      "description" : "Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):\n\n* `true` — да.\n* `false` — нет.\nТакие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.\n"
    }
  },
  "description" : "Запрос информации по заказам."
}
SCHEMA;
}
