const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CREDIT',
                    'POSTPAID',
                    'PREPAID',
                    'TINKOFF_CREDIT',
                ],
            }
        )
    }
