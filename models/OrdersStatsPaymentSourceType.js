const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит).  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BUYER',
                    'CASHBACK',
                    'MARKETPLACE',
                    'SPLIT',
                ],
            }
        )
    }
