const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DBS_CANCELLATION_RATE',
                    'DBS_LATE_DELIVERY_RATE',
                    'FBS_CANCELLATION_RATE',
                    'FBS_LATE_SHIP_RATE',
                ],
            }
        )
    }
