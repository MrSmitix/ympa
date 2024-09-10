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
 * OfferType
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class OfferType extends BaseModel
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
  "description" : "Особый тип товара:\n\n* `MEDICINE` — лекарства.\n* `BOOK` — бумажные и электронные книги.\n* `AUDIOBOOK` — аудиокниги.\n* `ARTIST_TITLE` — музыкальная и видеопродукция.\n* `ON_DEMAND` — товары на заказ.\n\n{% note info \"Если ваш товар — книга\" %}\n\nУкажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)\n\n{% endnote %}\n",
  "enum" : [ "DEFAULT", "MEDICINE", "BOOK", "AUDIOBOOK", "ARTIST_TITLE", "ON_DEMAND" ]
}
SCHEMA;
}
