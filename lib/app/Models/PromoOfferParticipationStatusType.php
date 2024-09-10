<?php
/**
 * PromoOfferParticipationStatusType
 */
namespace app\Models;

/**
 * PromoOfferParticipationStatusType
 * @description Статус товара в акции:  * `AUTO` — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * `PARTIALLY_AUTO` — добавлен автоматически у части магазинов.  * `MANUAL` — добавлен вручную.  * `NOT_PARTICIPATING` — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
 */
class PromoOfferParticipationStatusType
{
    /**
     * Possible values of this enum
     */
    const AUTO = 'AUTO';

    const PARTIALLY_AUTO = 'PARTIALLY_AUTO';

    const MANUAL = 'MANUAL';

    const NOT_PARTICIPATING = 'NOT_PARTICIPATING';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::AUTO,
            self::PARTIALLY_AUTO,
            self::MANUAL,
            self::NOT_PARTICIPATING
        ];
    }
}
