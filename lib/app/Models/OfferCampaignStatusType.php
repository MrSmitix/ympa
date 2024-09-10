<?php
/**
 * OfferCampaignStatusType
 */
namespace app\Models;

/**
 * OfferCampaignStatusType
 * @description Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html)
 */
class OfferCampaignStatusType
{
    /**
     * Possible values of this enum
     */
    const PUBLISHED = 'PUBLISHED';

    const CHECKING = 'CHECKING';

    const DISABLED_BY_PARTNER = 'DISABLED_BY_PARTNER';

    const DISABLED_AUTOMATICALLY = 'DISABLED_AUTOMATICALLY';

    const REJECTED_BY_MARKET = 'REJECTED_BY_MARKET';

    const CREATING_CARD = 'CREATING_CARD';

    const NO_CARD = 'NO_CARD';

    const NO_STOCKS = 'NO_STOCKS';

    const ARCHIVED = 'ARCHIVED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PUBLISHED,
            self::CHECKING,
            self::DISABLED_BY_PARTNER,
            self::DISABLED_AUTOMATICALLY,
            self::REJECTED_BY_MARKET,
            self::CREATING_CARD,
            self::NO_CARD,
            self::NO_STOCKS,
            self::ARCHIVED
        ];
    }
}
