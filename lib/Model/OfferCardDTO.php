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
 * OfferCardDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class OfferCardDTO extends BaseModel
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
  "required" : [ "offerId" ],
  "type" : "object",
  "properties" : {
    "offerId" : {
      "$ref" : "#/components/schemas/ShopSku"
    },
    "mapping" : {
      "$ref" : "#/components/schemas/GetMappingDTO"
    },
    "parameterValues" : {
      "type" : "array",
      "description" : "Список характеристик с их значениями.\n",
      "nullable" : true,
      "items" : {
        "$ref" : "#/components/schemas/ParameterValueDTO"
      }
    },
    "cardStatus" : {
      "$ref" : "#/components/schemas/OfferCardStatusType"
    },
    "contentRating" : {
      "type" : "integer",
      "description" : "Процент заполненности карточки.",
      "format" : "int32"
    },
    "recommendations" : {
      "type" : "array",
      "description" : "Список рекомендаций к заполнению карточки.\n\nРекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.\n",
      "nullable" : true,
      "items" : {
        "$ref" : "#/components/schemas/OfferCardRecommendationDTO"
      }
    },
    "errors" : {
      "type" : "array",
      "description" : "Ошибки в контенте, препятствующие размещению товара на витрине.",
      "nullable" : true,
      "items" : {
        "$ref" : "#/components/schemas/OfferErrorDTO"
      }
    },
    "warnings" : {
      "type" : "array",
      "description" : "Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.",
      "nullable" : true,
      "items" : {
        "$ref" : "#/components/schemas/OfferErrorDTO"
      }
    }
  },
  "description" : "Информация о состоянии карточки товара.\n\nЕсли поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут.\n"
}
SCHEMA;
}
