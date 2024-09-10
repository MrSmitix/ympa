const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PAYMENT',
                    'REFUND',
                    'UNKNOWN',
                ],
            }
        )
    }
