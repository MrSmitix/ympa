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
 * FeedbackGradesDTO
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class FeedbackGradesDTO extends BaseModel
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
  "required" : [ "factors" ],
  "type" : "object",
  "properties" : {
    "average" : {
      "type" : "number",
      "description" : "Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»)."
    },
    "agreeCount" : {
      "type" : "integer",
      "description" : "Количество пользователей, считающих отзыв полезным.",
      "format" : "int64"
    },
    "rejectCount" : {
      "type" : "integer",
      "description" : "Количество пользователей, считающих отзыв бесполезным.",
      "format" : "int64"
    },
    "factors" : {
      "type" : "array",
      "description" : "Информация об оценках по параметрам, указанных в отзыве.\n\nПри создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.\n",
      "items" : {
        "$ref" : "#/components/schemas/FeedbackFactorDTO"
      }
    }
  },
  "description" : "Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета."
}
SCHEMA;
}
