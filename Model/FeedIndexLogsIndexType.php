<?php
/**
 * FeedIndexLogsIndexType
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
 * Class representing the FeedIndexLogsIndexType model.
 *
 * Тип обновления.  Возможные значения:  * &#x60;DIFF&#x60; — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * &#x60;FAST_PRICE&#x60; — только обновление цен ранее опубликованных предложений. * &#x60;FULL&#x60; — полное обновление данных на Яндекс Маркете.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
enum FeedIndexLogsIndexType: string
{
        case DIFF = "DIFF";
        case FAST_PRICE = "FAST_PRICE";
        case FULL = "FULL";
}



