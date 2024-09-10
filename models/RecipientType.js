const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SHOP',
                    'DELIVERY_SERVICE',
                    'POST',
                ],
            }
        )
    }
