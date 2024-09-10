<?php
/**
 * OfferCardStatusType
 */
namespace app\Models;

/**
 * OfferCardStatusType
 * @description Статус карточки товара:  * `HAS_CARD_CAN_NOT_UPDATE` — Карточка Маркета. * `HAS_CARD_CAN_UPDATE` — Можно дополнить. * `HAS_CARD_CAN_UPDATE_ERRORS` — Изменения не приняты. * `HAS_CARD_CAN_UPDATE_PROCESSING` — Изменения на проверке. * `NO_CARD_NEED_CONTENT` — Создайте карточку. * `NO_CARD_MARKET_WILL_CREATE` — Создаст Маркет. * `NO_CARD_ERRORS` — Не создана из-за ошибки. * `NO_CARD_PROCESSING` — Проверяем данные. * `NO_CARD_ADD_TO_CAMPAIGN` — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html)
 */
class OfferCardStatusType
{
    /**
     * Possible values of this enum
     */
    const HAS_CARD_CAN_NOT_UPDATE = 'HAS_CARD_CAN_NOT_UPDATE';

    const HAS_CARD_CAN_UPDATE = 'HAS_CARD_CAN_UPDATE';

    const HAS_CARD_CAN_UPDATE_ERRORS = 'HAS_CARD_CAN_UPDATE_ERRORS';

    const HAS_CARD_CAN_UPDATE_PROCESSING = 'HAS_CARD_CAN_UPDATE_PROCESSING';

    const NO_CARD_NEED_CONTENT = 'NO_CARD_NEED_CONTENT';

    const NO_CARD_MARKET_WILL_CREATE = 'NO_CARD_MARKET_WILL_CREATE';

    const NO_CARD_ERRORS = 'NO_CARD_ERRORS';

    const NO_CARD_PROCESSING = 'NO_CARD_PROCESSING';

    const NO_CARD_ADD_TO_CAMPAIGN = 'NO_CARD_ADD_TO_CAMPAIGN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::HAS_CARD_CAN_NOT_UPDATE,
            self::HAS_CARD_CAN_UPDATE,
            self::HAS_CARD_CAN_UPDATE_ERRORS,
            self::HAS_CARD_CAN_UPDATE_PROCESSING,
            self::NO_CARD_NEED_CONTENT,
            self::NO_CARD_MARKET_WILL_CREATE,
            self::NO_CARD_ERRORS,
            self::NO_CARD_PROCESSING,
            self::NO_CARD_ADD_TO_CAMPAIGN
        ];
    }
}
