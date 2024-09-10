const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Способ отгрузки заказов:  * `IMPORT` — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * `WITHDRAW` — вы отгружаете заказы со своего склада курьерам Яндекс Маркета.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'IMPORT',
                    'WITHDRAW',
                ],
            }
        )
    }
