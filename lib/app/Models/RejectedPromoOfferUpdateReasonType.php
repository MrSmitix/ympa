<?php
/**
 * RejectedPromoOfferUpdateReasonType
 */
namespace app\Models;

/**
 * RejectedPromoOfferUpdateReasonType
 * @description Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены.
 */
class RejectedPromoOfferUpdateReasonType
{
    /**
     * Possible values of this enum
     */
    const OFFER_DOES_NOT_EXIST = 'OFFER_DOES_NOT_EXIST';

    const OFFER_DUPLICATION = 'OFFER_DUPLICATION';

    const OFFER_NOT_ELIGIBLE_FOR_PROMO = 'OFFER_NOT_ELIGIBLE_FOR_PROMO';

    const OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED = 'OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED';

    const DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED = 'DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED';

    const EMPTY_OLD_PRICE = 'EMPTY_OLD_PRICE';

    const EMPTY_PROMO_PRICE = 'EMPTY_PROMO_PRICE';

    const MAX_PROMO_PRICE_EXCEEDED = 'MAX_PROMO_PRICE_EXCEEDED';

    const PROMO_PRICE_BIGGER_THAN_MAX = 'PROMO_PRICE_BIGGER_THAN_MAX';

    const PROMO_PRICE_SMALLER_THAN_MIN = 'PROMO_PRICE_SMALLER_THAN_MIN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OFFER_DOES_NOT_EXIST,
            self::OFFER_DUPLICATION,
            self::OFFER_NOT_ELIGIBLE_FOR_PROMO,
            self::OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED,
            self::DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED,
            self::EMPTY_OLD_PRICE,
            self::EMPTY_PROMO_PRICE,
            self::MAX_PROMO_PRICE_EXCEEDED,
            self::PROMO_PRICE_BIGGER_THAN_MAX,
            self::PROMO_PRICE_SMALLER_THAN_MIN
        ];
    }
}
