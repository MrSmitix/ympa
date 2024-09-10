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
 * UpdatePromoOffersRequest
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class UpdatePromoOffersRequest extends BaseModel
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
  "required" : [ "offers", "promoId" ],
  "type" : "object",
  "properties" : {
    "promoId" : {
      "type" : "string",
      "description" : "Идентификатор акции."
    },
    "offers" : {
      "maxItems" : 500,
      "minItems" : 1,
      "type" : "array",
      "description" : "Товары, которые необходимо добавить в акцию или цены которых нужно изменить.",
      "items" : {
        "$ref" : "#/components/schemas/UpdatePromoOfferDTO"
      }
    }
  },
  "description" : "Добавление товаров в акцию или обновление их параметров.\n\nЧтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`.\n"
}
SCHEMA;
}
