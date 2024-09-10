const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NEW',
                    'WAITING_FOR_CUSTOMER',
                    'WAITING_FOR_PARTNER',
                    'WAITING_FOR_ARBITER',
                    'WAITING_FOR_MARKET',
                    'FINISHED',
                ],
            }
        )
    }
