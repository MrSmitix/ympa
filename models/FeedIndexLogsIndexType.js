const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DIFF',
                    'FAST_PRICE',
                    'FULL',
                ],
            }
        )
    }
