const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Услуга:  * `FEE` — размещение товара на Маркете. * `FULFILLMENT` — складская обработка. Не возвращается с 1 января 2024 года. * `LOYALTY_PARTICIPATION_FEE` — участие в программе лояльности и отзывы за баллы. * `AUCTION_PROMOTION` — буст продаж с оплатой за продажи. * `INSTALLMENT` — рассрочка. Не возвращается с 24 февраля 2022 года. * `DELIVERY_TO_CUSTOMER` — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `EXPRESS_DELIVERY_TO_CUSTOMER` — экспресс-доставка покупателю (Экспресс). * `AGENCY` — прием платежа покупателя. * `PAYMENT_TRANSFER` — перевод платежа покупателя. * `RETURNED_ORDERS_STORAGE` — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `SORTING` — обработка заказа (FBS). * `INTAKE_SORTING` — организация забора заказов со склада продавца (FBS). * `RETURN_PROCESSING` — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `ILLIQUID_GOODS_SALE` — вознаграждение за продажу невывезенных товаров.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FEE',
                    'FULFILLMENT',
                    'LOYALTY_PARTICIPATION_FEE',
                    'AUCTION_PROMOTION',
                    'INSTALLMENT',
                    'DELIVERY_TO_CUSTOMER',
                    'EXPRESS_DELIVERY_TO_CUSTOMER',
                    'AGENCY',
                    'PAYMENT_TRANSFER',
                    'RETURNED_ORDERS_STORAGE',
                    'SORTING',
                    'INTAKE_SORTING',
                    'RETURN_PROCESSING',
                    'ILLIQUID_GOODS_SALE',
                ],
            }
        )
    }
