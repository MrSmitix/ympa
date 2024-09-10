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
 * OfferProcessingStatusType
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class OfferProcessingStatusType extends BaseModel
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
  "type" : "string",
  "description" : "Статус публикации товара:\n\n* `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену.\n* `IN_WORK` — товар проходит модерацию. Это занимает несколько дней.\n* `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете.\n* `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`.\n* `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары.\n* `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.\n",
  "enum" : [ "UNKNOWN", "READY", "IN_WORK", "NEED_INFO", "NEED_MAPPING", "NEED_CONTENT", "CONTENT_PROCESSING", "SUSPENDED", "REJECTED", "REVIEW", "CREATE_ERROR", "UPDATE_ERROR" ]
}
SCHEMA;
}
