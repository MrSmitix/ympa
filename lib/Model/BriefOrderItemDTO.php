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
 * BriefOrderItemDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class BriefOrderItemDTO extends BaseModel
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
    "id" : {
      "type" : "integer",
      "description" : "Идентификатор товара в заказе.\n\nПозволяет идентифицировать товар в рамках данного заказа.\n",
      "format" : "int64"
    },
    "vat" : {
      "$ref" : "#/components/schemas/OrderVatType"
    },
    "count" : {
      "type" : "integer",
      "description" : "Количество единиц товара.",
      "format" : "int32"
    },
    "price" : {
      "type" : "number",
      "description" : "Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.\n"
    },
    "offerName" : {
      "type" : "string",
      "description" : "Название товара."
    },
    "offerId" : {
      "$ref" : "#/components/schemas/ShopSku"
    },
    "instances" : {
      "type" : "array",
      "description" : "Переданные вами коды маркировки.",
      "nullable" : true,
      "items" : {
        "$ref" : "#/components/schemas/OrderItemInstanceDTO"
      }
    }
  },
  "description" : "Информация о маркированном товаре."
}
SCHEMA;
}
