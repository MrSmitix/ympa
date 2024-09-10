const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OFFER_DOES_NOT_EXIST',
                ],
            }
        )
    }
