const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PERFECT',
                    'EXCELLENT',
                    'GOOD',
                    'NOT_SPECIFIED',
                ],
            }
        )
    }
