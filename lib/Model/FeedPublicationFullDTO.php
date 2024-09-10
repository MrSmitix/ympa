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
 * FeedPublicationFullDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class FeedPublicationFullDTO extends BaseModel
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
    "fileTime" : {
      "type" : "string",
      "description" : "Дата и время, которые магазин указал в прайс-листе.\n\nФормат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.\n",
      "format" : "date-time"
    },
    "publishedTime" : {
      "type" : "string",
      "description" : "Дата и время публикации предложений из прайс-листа на Маркете.\n\nФормат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.\n",
      "format" : "date-time"
    }
  },
  "description" : "Информация о последней публикации предложений из прайс-листа на Маркете.\n"
}
SCHEMA;
}
