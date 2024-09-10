<?php
/**
 * OfferType
 */
namespace app\Models;

/**
 * OfferType
 * @description Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %}
 */
class OfferType
{
    /**
     * Possible values of this enum
     */
    const _DEFAULT = 'DEFAULT';

    const MEDICINE = 'MEDICINE';

    const BOOK = 'BOOK';

    const AUDIOBOOK = 'AUDIOBOOK';

    const ARTIST_TITLE = 'ARTIST_TITLE';

    const ON_DEMAND = 'ON_DEMAND';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::_DEFAULT,
            self::MEDICINE,
            self::BOOK,
            self::AUDIOBOOK,
            self::ARTIST_TITLE,
            self::ON_DEMAND
        ];
    }
}
