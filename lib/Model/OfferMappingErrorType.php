<?php
/**
 * OfferMappingErrorType
 *
 * PHP version 7.4
 *
 * @category Class
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
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.8.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;
use \OpenAPI\Client\ObjectSerializer;

/**
 * OfferMappingErrorType Class Doc Comment
 *
 * @category Class
 * @description Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_MISMATCH&#x60; — указана категория, которая не совпадает с категорией товара. * &#x60;EMPTY_MARKET_CATEGORY&#x60; — не указана категория Маркета при передаче характеристик категории. * &#x60;UNKNOWN_PARAMETER&#x60; — передана характеристика, которой нет среди характеристик категории. * &#x60;UNEXPECTED_BOOLEAN_VALUE&#x60; — вместо boolean-значения передано что-то другое. * &#x60;NUMBER_FORMAT&#x60; — передана строка, не обозначающая число, вместо числа. * &#x60;VALUE_BLANK&#x60; — передано пустое значение. * &#x60;INVALID_UNIT_ID&#x60; — передана единица измерения, недопустимая для характеристики. * &#x60;INVALID_GROUP_ID_LENGTH&#x60; — в названии превышено допустимое значение символов — 255. * &#x60;INVALID_GROUP_ID_CHARACTERS&#x60; — переданы [недопустимые символы](*ascii-code). * &#x60;INVALID_PICKER_URL&#x60; — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class OfferMappingErrorType
{
    /**
     * Possible values of this enum
     */
    public const UNKNOWN_CATEGORY = 'UNKNOWN_CATEGORY';

    public const CATEGORY_MISMATCH = 'CATEGORY_MISMATCH';

    public const EMPTY_MARKET_CATEGORY = 'EMPTY_MARKET_CATEGORY';

    public const UNKNOWN_PARAMETER = 'UNKNOWN_PARAMETER';

    public const UNEXPECTED_BOOLEAN_VALUE = 'UNEXPECTED_BOOLEAN_VALUE';

    public const NUMBER_FORMAT = 'NUMBER_FORMAT';

    public const VALUE_BLANK = 'VALUE_BLANK';

    public const INVALID_UNIT_ID = 'INVALID_UNIT_ID';

    public const INVALID_GROUP_ID_LENGTH = 'INVALID_GROUP_ID_LENGTH';

    public const INVALID_GROUP_ID_CHARACTERS = 'INVALID_GROUP_ID_CHARACTERS';

    public const INVALID_PICKER_URL = 'INVALID_PICKER_URL';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::UNKNOWN_CATEGORY,
            self::CATEGORY_MISMATCH,
            self::EMPTY_MARKET_CATEGORY,
            self::UNKNOWN_PARAMETER,
            self::UNEXPECTED_BOOLEAN_VALUE,
            self::NUMBER_FORMAT,
            self::VALUE_BLANK,
            self::INVALID_UNIT_ID,
            self::INVALID_GROUP_ID_LENGTH,
            self::INVALID_GROUP_ID_CHARACTERS,
            self::INVALID_PICKER_URL
        ];
    }
}


