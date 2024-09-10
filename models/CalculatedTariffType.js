const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html).  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AGENCY_COMMISSION',
                    'PAYMENT_TRANSFER',
                    'FEE',
                    'DELIVERY_TO_CUSTOMER',
                    'CROSSREGIONAL_DELIVERY',
                    'EXPRESS_DELIVERY',
                    'SORTING',
                    'MIDDLE_MILE',
                ],
            }
        )
    }
