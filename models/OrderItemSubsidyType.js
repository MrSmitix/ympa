const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.).  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'YANDEX_CASHBACK',
                    'SUBSIDY',
                ],
            }
        )
    }
