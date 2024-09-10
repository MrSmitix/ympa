const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BUYER',
                    'CASHBACK',
                    'MARKETPLACE',
                ],
            }
        )
    }
