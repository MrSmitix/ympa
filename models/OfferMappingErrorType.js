const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `EMPTY_MARKET_CATEGORY` — не указана категория Маркета при передаче характеристик категории. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). * `INVALID_PICKER_URL` — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNKNOWN_CATEGORY',
                    'CATEGORY_MISMATCH',
                    'EMPTY_MARKET_CATEGORY',
                    'UNKNOWN_PARAMETER',
                    'UNEXPECTED_BOOLEAN_VALUE',
                    'NUMBER_FORMAT',
                    'VALUE_BLANK',
                    'INVALID_UNIT_ID',
                    'INVALID_GROUP_ID_LENGTH',
                    'INVALID_GROUP_ID_CHARACTERS',
                    'INVALID_PICKER_URL',
                ],
            }
        )
    }
