<?php
/**
 * TariffType
 */
namespace app\Models;

/**
 * TariffType
 * @description Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html).
 */
class TariffType
{
    /**
     * Possible values of this enum
     */
    const AGENCY_COMMISSION = 'AGENCY_COMMISSION';

    const PAYMENT_TRANSFER = 'PAYMENT_TRANSFER';

    const STORAGE = 'STORAGE';

    const WITHDRAW = 'WITHDRAW';

    const SURPLUS = 'SURPLUS';

    const FEE = 'FEE';

    const DELIVERY_TO_CUSTOMER = 'DELIVERY_TO_CUSTOMER';

    const CROSSREGIONAL_DELIVERY = 'CROSSREGIONAL_DELIVERY';

    const CROSSREGIONAL_DELIVERY_RETURN = 'CROSSREGIONAL_DELIVERY_RETURN';

    const DISPOSAL = 'DISPOSAL';

    const SORTING_CENTER_STORAGE = 'SORTING_CENTER_STORAGE';

    const EXPRESS_DELIVERY = 'EXPRESS_DELIVERY';

    const FF_XDOC_SUPPLY_BOX = 'FF_XDOC_SUPPLY_BOX';

    const FF_XDOC_SUPPLY_PALLET = 'FF_XDOC_SUPPLY_PALLET';

    const SORTING = 'SORTING';

    const MIDDLE_MILE = 'MIDDLE_MILE';

    const RETURN_PROCESSING = 'RETURN_PROCESSING';

    const EXPRESS_CANCELLED_BY_PARTNER = 'EXPRESS_CANCELLED_BY_PARTNER';

    const DELIVERY_TO_CUSTOMER_RETURN = 'DELIVERY_TO_CUSTOMER_RETURN';

    const CROSSBORDER_DELIVERY = 'CROSSBORDER_DELIVERY';

    const INTAKE_SORTING_BULKY_CARGO = 'INTAKE_SORTING_BULKY_CARGO';

    const INTAKE_SORTING_SMALL_GOODS = 'INTAKE_SORTING_SMALL_GOODS';

    const INTAKE_SORTING_DAILY = 'INTAKE_SORTING_DAILY';

    const FF_STORAGE_BILLING = 'FF_STORAGE_BILLING';

    const CANCELLED_ORDER_FEE_QI = 'CANCELLED_ORDER_FEE_QI';

    const LATE_ORDER_EXECUTION_FEE_QI = 'LATE_ORDER_EXECUTION_FEE_QI';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::AGENCY_COMMISSION,
            self::PAYMENT_TRANSFER,
            self::STORAGE,
            self::WITHDRAW,
            self::SURPLUS,
            self::FEE,
            self::DELIVERY_TO_CUSTOMER,
            self::CROSSREGIONAL_DELIVERY,
            self::CROSSREGIONAL_DELIVERY_RETURN,
            self::DISPOSAL,
            self::SORTING_CENTER_STORAGE,
            self::EXPRESS_DELIVERY,
            self::FF_XDOC_SUPPLY_BOX,
            self::FF_XDOC_SUPPLY_PALLET,
            self::SORTING,
            self::MIDDLE_MILE,
            self::RETURN_PROCESSING,
            self::EXPRESS_CANCELLED_BY_PARTNER,
            self::DELIVERY_TO_CUSTOMER_RETURN,
            self::CROSSBORDER_DELIVERY,
            self::INTAKE_SORTING_BULKY_CARGO,
            self::INTAKE_SORTING_SMALL_GOODS,
            self::INTAKE_SORTING_DAILY,
            self::FF_STORAGE_BILLING,
            self::CANCELLED_ORDER_FEE_QI,
            self::LATE_ORDER_EXECUTION_FEE_QI
        ];
    }
}
