<?php
/**
 * PromoOfferParticipationStatusFilterType
 */
namespace app\Models;

/**
 * PromoOfferParticipationStatusFilterType
 * @description Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
 */
class PromoOfferParticipationStatusFilterType
{
    /**
     * Possible values of this enum
     */
    const MANUALLY_ADDED = 'MANUALLY_ADDED';

    const NOT_MANUALLY_ADDED = 'NOT_MANUALLY_ADDED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::MANUALLY_ADDED,
            self::NOT_MANUALLY_ADDED
        ];
    }
}
