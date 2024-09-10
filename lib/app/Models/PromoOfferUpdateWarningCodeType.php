<?php
/**
 * PromoOfferUpdateWarningCodeType
 */
namespace app\Models;

/**
 * PromoOfferUpdateWarningCodeType
 * @description Предупреждение, которое появилось при добавлении товара:  * `DEEP_DISCOUNT_OFFER` — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * `CATALOG_PRICE_IS_LOWER_THAN_PROMO` — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * `SHOP_PRICES_ARE_LOWER_THAN_PROMO` — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * `PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE` — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * `SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар в отдельном магазине не подходит под условия акции.
 */
class PromoOfferUpdateWarningCodeType
{
    /**
     * Possible values of this enum
     */
    const DEEP_DISCOUNT_OFFER = 'DEEP_DISCOUNT_OFFER';

    const CATALOG_PRICE_IS_LOWER_THAN_PROMO = 'CATALOG_PRICE_IS_LOWER_THAN_PROMO';

    const SHOP_PRICES_ARE_LOWER_THAN_PROMO = 'SHOP_PRICES_ARE_LOWER_THAN_PROMO';

    const PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE = 'PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE';

    const SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO = 'SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DEEP_DISCOUNT_OFFER,
            self::CATALOG_PRICE_IS_LOWER_THAN_PROMO,
            self::SHOP_PRICES_ARE_LOWER_THAN_PROMO,
            self::PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE,
            self::SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO
        ];
    }
}
