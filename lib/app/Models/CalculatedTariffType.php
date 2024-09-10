<?php
/**
 * CalculatedTariffType
 */
namespace app\Models;

/**
 * CalculatedTariffType
 * @description Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html).
 */
class CalculatedTariffType
{
    /**
     * Possible values of this enum
     */
    const AGENCY_COMMISSION = 'AGENCY_COMMISSION';

    const PAYMENT_TRANSFER = 'PAYMENT_TRANSFER';

    const FEE = 'FEE';

    const DELIVERY_TO_CUSTOMER = 'DELIVERY_TO_CUSTOMER';

    const CROSSREGIONAL_DELIVERY = 'CROSSREGIONAL_DELIVERY';

    const EXPRESS_DELIVERY = 'EXPRESS_DELIVERY';

    const SORTING = 'SORTING';

    const MIDDLE_MILE = 'MIDDLE_MILE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::AGENCY_COMMISSION,
            self::PAYMENT_TRANSFER,
            self::FEE,
            self::DELIVERY_TO_CUSTOMER,
            self::CROSSREGIONAL_DELIVERY,
            self::EXPRESS_DELIVERY,
            self::SORTING,
            self::MIDDLE_MILE
        ];
    }
}
