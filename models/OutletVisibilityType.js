const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'HIDDEN',
                    'VISIBLE',
                    'UNKNOWN',
                ],
            }
        )
    }
