const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FBY',
                    'FBS',
                    'DBS',
                    'EXPRESS',
                ],
            }
        )
    }
