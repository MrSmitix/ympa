const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNKNOWN',
                    'BUYER',
                    'MARKET_PARTNER_OUTLET',
                    'MARKET_BRANDED_OUTLET',
                    'SHOP_OUTLET',
                    'DROPOFF',
                ],
            }
        )
    }
