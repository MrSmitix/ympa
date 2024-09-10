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
 * OrderDeliveryDatesDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class OrderDeliveryDatesDTO extends BaseModel
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
    "fromDate" : {
      "$ref" : "#/components/schemas/DateDdMmYyyy"
    },
    "toDate" : {
      "$ref" : "#/components/schemas/DateDdMmYyyy"
    },
    "fromTime" : {
      "type" : "string",
      "description" : "Начало интервала времени доставки.\n\nПередается только совместно с параметром `type=DELIVERY`.\n\nФормат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).\n\nМинимальное значение: `00:00`.\n",
      "format" : "time"
    },
    "toTime" : {
      "type" : "string",
      "description" : "Конец интервала времени доставки.\n\nПередается только совместно с параметром `type=DELIVERY`.\n\nФормат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).\n\nМаксимальное значение: `23:59`.\n",
      "format" : "time"
    },
    "realDeliveryDate" : {
      "$ref" : "#/components/schemas/DateDdMmYyyy"
    }
  },
  "description" : "Диапазон дат доставки."
}
SCHEMA;
}
