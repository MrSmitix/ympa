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
 * OrderItemPromoDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class OrderItemPromoDTO extends BaseModel
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
  "required" : [ "type" ],
  "type" : "object",
  "properties" : {
    "type" : {
      "$ref" : "#/components/schemas/OrderPromoType"
    },
    "discount" : {
      "type" : "number",
      "description" : "Размер пользовательской скидки в валюте покупателя.\n",
      "format" : "decimal"
    },
    "subsidy" : {
      "type" : "number",
      "description" : "Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.\n\nПередается в валюте заказа.\n",
      "format" : "decimal"
    },
    "shopPromoId" : {
      "type" : "string",
      "description" : "Идентификатор акции поставщика.\n"
    },
    "marketPromoId" : {
      "type" : "string",
      "description" : "Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.\n\nПараметр передается, только если параметр `type=MARKET_DEAL`.\n"
    }
  },
  "description" : "Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям."
}
SCHEMA;
}
