<?php
/**
 * PriceQuarantineVerdictType
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
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


namespace OpenAPIServer\Model;

/**
 * Class representing the PriceQuarantineVerdictType model.
 *
 * Типы карантина:  * &#x60;PRICE_CHANGE&#x60; — новая цена слишком сильно отличается от прежней. В поле &#x60;params&#x60; будет  новая цена &#x60;CURRENT_PRICE&#x60; и последняя цена до попадания в карантин &#x60;LAST_VALID_PRICE&#x60;. * &#x60;LOW_PRICE&#x60; — установленная цена слишком сильно отличается от рыночной. В поле &#x60;params&#x60; будет установленная вами цена &#x60;CURRENT_PRICE&#x60; и порог попадания в карантин &#x60;MIN_PRICE&#x60;. * &#x60;LOW_PRICE_PROMO&#x60; — цена после применения акций слишком сильно отличается от рыночной. В поле &#x60;params&#x60; будет цена после применения акций &#x60;CURRENT_PRICE&#x60; и порог попадания в карантин &#x60;MIN_PRICE&#x60;.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */
enum PriceQuarantineVerdictType: string
{
        case PRICE_CHANGE = 'PRICE_CHANGE';
        case LOW_PRICE = 'LOW_PRICE';
        case LOW_PRICE_PROMO = 'LOW_PRICE_PROMO';
}



