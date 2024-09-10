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
 * GetPromoBestsellerInfoDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class GetPromoBestsellerInfoDTO extends BaseModel
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
  "required" : [ "bestseller" ],
  "type" : "object",
  "properties" : {
    "bestseller" : {
      "type" : "boolean",
      "description" : "Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers)."
    },
    "entryDeadline" : {
      "type" : "string",
      "description" : "До какой даты можно добавить товар в акцию «Бестселлеры Маркета».\n\nПараметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».\n",
      "format" : "date-time"
    }
  },
  "description" : "Информация об акции «Бестселлеры Маркета»."
}
SCHEMA;
}
