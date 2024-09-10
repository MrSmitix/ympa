const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ORDER_DELIVERED',
                    'ORDER_IN_DELIVERY',
                ],
            }
        )
    }
