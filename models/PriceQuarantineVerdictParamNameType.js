const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CURRENT_PRICE',
                    'LAST_VALID_PRICE',
                    'MIN_PRICE',
                    'CURRENCY',
                ],
            }
        )
    }
