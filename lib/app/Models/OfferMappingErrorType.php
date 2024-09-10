<?php
/**
 * OfferMappingErrorType
 */
namespace app\Models;

/**
 * OfferMappingErrorType
 * @description Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `EMPTY_MARKET_CATEGORY` — не указана категория Маркета при передаче характеристик категории. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). * `INVALID_PICKER_URL` — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара.
 */
class OfferMappingErrorType
{
    /**
     * Possible values of this enum
     */
    const UNKNOWN_CATEGORY = 'UNKNOWN_CATEGORY';

    const CATEGORY_MISMATCH = 'CATEGORY_MISMATCH';

    const EMPTY_MARKET_CATEGORY = 'EMPTY_MARKET_CATEGORY';

    const UNKNOWN_PARAMETER = 'UNKNOWN_PARAMETER';

    const UNEXPECTED_BOOLEAN_VALUE = 'UNEXPECTED_BOOLEAN_VALUE';

    const NUMBER_FORMAT = 'NUMBER_FORMAT';

    const VALUE_BLANK = 'VALUE_BLANK';

    const INVALID_UNIT_ID = 'INVALID_UNIT_ID';

    const INVALID_GROUP_ID_LENGTH = 'INVALID_GROUP_ID_LENGTH';

    const INVALID_GROUP_ID_CHARACTERS = 'INVALID_GROUP_ID_CHARACTERS';

    const INVALID_PICKER_URL = 'INVALID_PICKER_URL';

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
