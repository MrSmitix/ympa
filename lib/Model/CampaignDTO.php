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
 * CampaignDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class CampaignDTO extends BaseModel
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
    "domain" : {
      "type" : "string",
      "description" : "URL магазина."
    },
    "id" : {
      "type" : "integer",
      "description" : "Идентификатор кампании.",
      "format" : "int64"
    },
    "clientId" : {
      "type" : "integer",
      "description" : "Идентификатор плательщика в Яндекс Балансе.",
      "format" : "int64"
    },
    "business" : {
      "$ref" : "#/components/schemas/BusinessDTO"
    },
    "placementType" : {
      "$ref" : "#/components/schemas/PlacementType"
    }
  },
  "description" : "Информация о магазине."
}
SCHEMA;
}
