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
 * CampaignSettingsLocalRegionDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class CampaignSettingsLocalRegionDTO extends BaseModel
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
      "description" : "Идентификатор региона.",
      "format" : "int64"
    },
    "name" : {
      "type" : "string",
      "description" : "Название региона."
    },
    "type" : {
      "$ref" : "#/components/schemas/RegionType"
    },
    "deliveryOptionsSource" : {
      "$ref" : "#/components/schemas/CampaignSettingsScheduleSourceType"
    },
    "delivery" : {
      "$ref" : "#/components/schemas/CampaignSettingsDeliveryDTO"
    }
  },
  "description" : "Информация о своем регионе магазина."
}
SCHEMA;
}
