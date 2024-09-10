<?php
/**
 * OrderPromoType
 */
namespace app\Models;

/**
 * OrderPromoType
 * @description Тип скидки:  * `DIRECT_DISCOUNT` — прямая скидка, которую устанавливает продавец или Маркет.  * `BLUE_SET` — комплекты.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_COUPON` — скидка по промокоду Маркета.  * `MARKET_PROMOCODE` — скидка по промокоду магазина.  * `MARKET_BLUE` — скидка на Маркете.  * `YANDEX_PLUS` — бесплатная доставка с подпиской Яндекс Плюс.  * `YANDEX_EMPLOYEE` — бесплатная доставка по определенным адресам.  * `LIMITED_FREE_DELIVERY_PROMO` — бесплатная доставка по ограниченному предложению.  * `FREE_DELIVERY_THRESHOLD` — бесплатная доставка при достижении определенной суммы заказа.  * `MULTICART_DISCOUNT` — скидка за то, что оформлена мультикорзина.  * `FREE_DELIVERY_FOR_LDI` — бесплатная доставка за то, что один из товаров крупногабаритный.  * `FREE_DELIVERY_FOR_LSC` — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * `FREE_PICKUP` — бесплатная доставка в пункт выдачи заказов.  * `CHEAPEST_AS_GIFT` — самый дешевый товар в подарок.  * `CASHBACK` — кешбэк.  * `SUPPLIER_MULTICART_DISCOUNT` — скидка за доставку.  * `SPREAD_DISCOUNT_COUNT` — скидка за количество одинаковых товаров.  * `SPREAD_DISCOUNT_RECEIPT` — скидка от суммы чека.  * `ANNOUNCEMENT_PROMO` — информационная акция, скидка не применяется к товарам.  * `DISCOUNT_BY_PAYMENT_TYPE` — прямая скидка при оплате картой Плюса.  * `PERCENT_DISCOUNT` — прямая скидка в процентах.  * `DCO_EXTRA_DISCOUNT` — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * `EMPTY_PROMO` — скрытые промокоды.  * `BLOCKING_PROMO` — блокирующее промо.  * `UNKNOWN` — неизвестный тип.  Устаревшие типы:  * `GENERIC_BUNDLE`.  * `MARKET_DEAL`.  * `MARKET_PRIME`.  * `MARKET_COIN`.  * `BERU_PLUS`.  * `PRICE_DROP_AS_YOU_SHOP`.  * `SECRET_SALE`.
 */
class OrderPromoType
{
    /**
     * Possible values of this enum
     */
    const DIRECT_DISCOUNT = 'DIRECT_DISCOUNT';

    const BLUE_SET = 'BLUE_SET';

    const BLUE_FLASH = 'BLUE_FLASH';

    const GENERIC_BUNDLE = 'GENERIC_BUNDLE';

    const MARKET_COUPON = 'MARKET_COUPON';

    const MARKET_PROMOCODE = 'MARKET_PROMOCODE';

    const MARKET_DEAL = 'MARKET_DEAL';

    const MARKET_BLUE = 'MARKET_BLUE';

    const MARKET_PRIME = 'MARKET_PRIME';

    const YANDEX_PLUS = 'YANDEX_PLUS';

    const BERU_PLUS = 'BERU_PLUS';

    const MARKET_COIN = 'MARKET_COIN';

    const YANDEX_EMPLOYEE = 'YANDEX_EMPLOYEE';

    const LIMITED_FREE_DELIVERY_PROMO = 'LIMITED_FREE_DELIVERY_PROMO';

    const FREE_DELIVERY_THRESHOLD = 'FREE_DELIVERY_THRESHOLD';

    const MULTICART_DISCOUNT = 'MULTICART_DISCOUNT';

    const PRICE_DROP_AS_YOU_SHOP = 'PRICE_DROP_AS_YOU_SHOP';

    const FREE_DELIVERY_FOR_LDI = 'FREE_DELIVERY_FOR_LDI';

    const FREE_DELIVERY_FOR_LSC = 'FREE_DELIVERY_FOR_LSC';

    const SECRET_SALE = 'SECRET_SALE';

    const FREE_PICKUP = 'FREE_PICKUP';

    const CHEAPEST_AS_GIFT = 'CHEAPEST_AS_GIFT';

    const CASHBACK = 'CASHBACK';

    const SUPPLIER_MULTICART_DISCOUNT = 'SUPPLIER_MULTICART_DISCOUNT';

    const SPREAD_DISCOUNT_COUNT = 'SPREAD_DISCOUNT_COUNT';

    const SPREAD_DISCOUNT_RECEIPT = 'SPREAD_DISCOUNT_RECEIPT';

    const ANNOUNCEMENT_PROMO = 'ANNOUNCEMENT_PROMO';

    const DISCOUNT_BY_PAYMENT_TYPE = 'DISCOUNT_BY_PAYMENT_TYPE';

    const PERCENT_DISCOUNT = 'PERCENT_DISCOUNT';

    const DCO_EXTRA_DISCOUNT = 'DCO_EXTRA_DISCOUNT';

    const EMPTY_PROMO = 'EMPTY_PROMO';

    const BLOCKING_PROMO = 'BLOCKING_PROMO';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DIRECT_DISCOUNT,
            self::BLUE_SET,
            self::BLUE_FLASH,
            self::GENERIC_BUNDLE,
            self::MARKET_COUPON,
            self::MARKET_PROMOCODE,
            self::MARKET_DEAL,
            self::MARKET_BLUE,
            self::MARKET_PRIME,
            self::YANDEX_PLUS,
            self::BERU_PLUS,
            self::MARKET_COIN,
            self::YANDEX_EMPLOYEE,
            self::LIMITED_FREE_DELIVERY_PROMO,
            self::FREE_DELIVERY_THRESHOLD,
            self::MULTICART_DISCOUNT,
            self::PRICE_DROP_AS_YOU_SHOP,
            self::FREE_DELIVERY_FOR_LDI,
            self::FREE_DELIVERY_FOR_LSC,
            self::SECRET_SALE,
            self::FREE_PICKUP,
            self::CHEAPEST_AS_GIFT,
            self::CASHBACK,
            self::SUPPLIER_MULTICART_DISCOUNT,
            self::SPREAD_DISCOUNT_COUNT,
            self::SPREAD_DISCOUNT_RECEIPT,
            self::ANNOUNCEMENT_PROMO,
            self::DISCOUNT_BY_PAYMENT_TYPE,
            self::PERCENT_DISCOUNT,
            self::DCO_EXTRA_DISCOUNT,
            self::EMPTY_PROMO,
            self::BLOCKING_PROMO,
            self::UNKNOWN
        ];
    }
}
