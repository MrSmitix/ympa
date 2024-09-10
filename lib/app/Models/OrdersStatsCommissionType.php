<?php
/**
 * OrdersStatsCommissionType
 */
namespace app\Models;

/**
 * OrdersStatsCommissionType
 * @description Услуга:  * `FEE` — размещение товара на Маркете. * `FULFILLMENT` — складская обработка. Не возвращается с 1 января 2024 года. * `LOYALTY_PARTICIPATION_FEE` — участие в программе лояльности и отзывы за баллы. * `AUCTION_PROMOTION` — буст продаж с оплатой за продажи. * `INSTALLMENT` — рассрочка. Не возвращается с 24 февраля 2022 года. * `DELIVERY_TO_CUSTOMER` — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `EXPRESS_DELIVERY_TO_CUSTOMER` — экспресс-доставка покупателю (Экспресс). * `AGENCY` — прием платежа покупателя. * `PAYMENT_TRANSFER` — перевод платежа покупателя. * `RETURNED_ORDERS_STORAGE` — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `SORTING` — обработка заказа (FBS). * `INTAKE_SORTING` — организация забора заказов со склада продавца (FBS). * `RETURN_PROCESSING` — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `ILLIQUID_GOODS_SALE` — вознаграждение за продажу невывезенных товаров.
 */
class OrdersStatsCommissionType
{
    /**
     * Possible values of this enum
     */
    const FEE = 'FEE';

    const FULFILLMENT = 'FULFILLMENT';

    const LOYALTY_PARTICIPATION_FEE = 'LOYALTY_PARTICIPATION_FEE';

    const AUCTION_PROMOTION = 'AUCTION_PROMOTION';

    const INSTALLMENT = 'INSTALLMENT';

    const DELIVERY_TO_CUSTOMER = 'DELIVERY_TO_CUSTOMER';

    const EXPRESS_DELIVERY_TO_CUSTOMER = 'EXPRESS_DELIVERY_TO_CUSTOMER';

    const AGENCY = 'AGENCY';

    const PAYMENT_TRANSFER = 'PAYMENT_TRANSFER';

    const RETURNED_ORDERS_STORAGE = 'RETURNED_ORDERS_STORAGE';

    const SORTING = 'SORTING';

    const INTAKE_SORTING = 'INTAKE_SORTING';

    const RETURN_PROCESSING = 'RETURN_PROCESSING';

    const ILLIQUID_GOODS_SALE = 'ILLIQUID_GOODS_SALE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FEE,
            self::FULFILLMENT,
            self::LOYALTY_PARTICIPATION_FEE,
            self::AUCTION_PROMOTION,
            self::INSTALLMENT,
            self::DELIVERY_TO_CUSTOMER,
            self::EXPRESS_DELIVERY_TO_CUSTOMER,
            self::AGENCY,
            self::PAYMENT_TRANSFER,
            self::RETURNED_ORDERS_STORAGE,
            self::SORTING,
            self::INTAKE_SORTING,
            self::RETURN_PROCESSING,
            self::ILLIQUID_GOODS_SALE
        ];
    }
}
