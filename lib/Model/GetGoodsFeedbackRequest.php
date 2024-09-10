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
 * GetGoodsFeedbackRequest
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class GetGoodsFeedbackRequest extends BaseModel
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
    "dateTimeFrom" : {
      "type" : "string",
      "description" : "Начало периода. Не включительно.\n\nЕсли параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.\n",
      "format" : "date-time"
    },
    "dateTimeTo" : {
      "type" : "string",
      "description" : "Конец периода. Не включительно.\n\nЕсли параметр не указан, используется текущая дата.\n",
      "format" : "date-time"
    },
    "reactionStatus" : {
      "$ref" : "#/components/schemas/FeedbackReactionStatusType"
    },
    "ratingValues" : {
      "maxItems" : 5,
      "uniqueItems" : true,
      "type" : "array",
      "description" : "Оценка товара.",
      "nullable" : true,
      "items" : {
        "type" : "integer",
        "format" : "int32"
      }
    },
    "modelIds" : {
      "maxItems" : 20,
      "uniqueItems" : true,
      "type" : "array",
      "description" : "Фильтр по идентификатору модели товара.\n\nПолучить идентификатор модели можно с помощью одного из запросов:\n\n* [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);\n\n* [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);\n\n* [POST models](../../reference/models/getModels.md).\n",
      "nullable" : true,
      "items" : {
        "type" : "integer",
        "format" : "int64"
      }
    },
    "paid" : {
      "type" : "boolean",
      "description" : "Фильтр отзывов за баллы Плюса."
    }
  },
  "description" : "Фильтр запроса отзывов в кабинете.\n"
}
SCHEMA;
}
