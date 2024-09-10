const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PARTNER',
                    'CUSTOMER',
                    'MARKET',
                    'SUPPORT',
                ],
            }
        )
    }
