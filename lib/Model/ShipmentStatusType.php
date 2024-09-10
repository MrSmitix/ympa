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
 * ShipmentStatusType
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class ShipmentStatusType extends BaseModel
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
  "description" : "Статус отгрузки:\n\n* `OUTBOUND_CREATED` — формируется.\n* `OUTBOUND_READY_FOR_CONFIRMATION` — можно обрабатывать.\n* `OUTBOUND_CONFIRMED` — подтверждена и готова к отправке.\n* `OUTBOUND_SIGNED` — по ней подписан электронный акт приема-передачи.\n* `ACCEPTED` — принята в сортировочном центре или пункте приема.\n* `ACCEPTED_WITH_DISCREPANCIES` — принята с расхождениями.\n* `FINISHED` — завершена.\n* `ERROR` — отменена из-за ошибки.\n",
  "enum" : [ "OUTBOUND_CREATED", "OUTBOUND_READY_FOR_CONFIRMATION", "OUTBOUND_CONFIRMED", "OUTBOUND_SIGNED", "FINISHED", "ACCEPTED", "ACCEPTED_WITH_DISCREPANCIES", "ERROR" ]
}
SCHEMA;
}
