<?php
/**
 * FeedStatusType
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the FeedStatusType model.
 *
 * Статус прайс-листа.  Возможные значения:    * &#x60;ERROR&#x60; — найдены ошибки.   * &#x60;NA&#x60; — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * &#x60;OK&#x60; — ошибок не найдено.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
enum FeedStatusType: string
{
        case ERROR = "ERROR";
        case NA = "NA";
        case OK = "OK";
}



