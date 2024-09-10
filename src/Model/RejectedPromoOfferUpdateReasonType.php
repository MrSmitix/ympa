<?php
/**
 * RejectedPromoOfferUpdateReasonType
 *
 * PHP version 8.1
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * @generated Generated by: https://openapi-generator.tech
 * Generator version: 7.8.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

/**
 * RejectedPromoOfferUpdateReasonType Class Doc Comment
 *
 * @description Причина отклонения изменения:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU.  * &#x60;OFFER_DUPLICATION&#x60; — один и тот же товар передан несколько раз.  * &#x60;OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар не подходит под условия акции.  * &#x60;OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED&#x60; — товар не добавлен в акцию по техническим причинам.  * &#x60;DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED&#x60; — истек срок добавления товаров в акцию.  * &#x60;EMPTY_OLD_PRICE&#x60; — не указана зачеркнутая цена.  * &#x60;EMPTY_PROMO_PRICE&#x60; — не указана цена по акции.  * &#x60;MAX_PROMO_PRICE_EXCEEDED&#x60; — цена по акции превышает максимально возможную цену для участия в акции.  * &#x60;PROMO_PRICE_BIGGER_THAN_MAX&#x60; — цена по акции больше 95% от зачеркнутой цены.  * &#x60;PROMO_PRICE_SMALLER_THAN_MIN&#x60; — цена по акции меньше 1% от зачеркнутой цены.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
enum RejectedPromoOfferUpdateReasonType: string
{
    case OFFER_DOES_NOT_EXIST = 'OFFER_DOES_NOT_EXIST';

    case OFFER_DUPLICATION = 'OFFER_DUPLICATION';

    case OFFER_NOT_ELIGIBLE_FOR_PROMO = 'OFFER_NOT_ELIGIBLE_FOR_PROMO';

    case OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED = 'OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED';

    case DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED = 'DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED';

    case EMPTY_OLD_PRICE = 'EMPTY_OLD_PRICE';

    case EMPTY_PROMO_PRICE = 'EMPTY_PROMO_PRICE';

    case MAX_PROMO_PRICE_EXCEEDED = 'MAX_PROMO_PRICE_EXCEEDED';

    case PROMO_PRICE_BIGGER_THAN_MAX = 'PROMO_PRICE_BIGGER_THAN_MAX';

    case PROMO_PRICE_SMALLER_THAN_MIN = 'PROMO_PRICE_SMALLER_THAN_MIN';

}


