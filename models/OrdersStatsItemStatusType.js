const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'REJECTED',
                    'RETURNED',
                ],
            }
        )
    }
