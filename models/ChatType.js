const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CHAT',
                    'ARBITRAGE',
                ],
            }
        )
    }
