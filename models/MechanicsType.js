const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DIRECT_DISCOUNT',
                    'BLUE_FLASH',
                    'MARKET_PROMOCODE',
                ],
            }
        )
    }
