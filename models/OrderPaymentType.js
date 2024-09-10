const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PREPAID',
                    'POSTPAID',
                    'UNKNOWN',
                ],
            }
        )
    }
