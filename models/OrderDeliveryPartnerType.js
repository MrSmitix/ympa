const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SHOP',
                    'YANDEX_MARKET',
                    'UNKNOWN',
                ],
            }
        )
    }
