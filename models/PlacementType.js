const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FBS',
                    'FBY',
                    'DBS',
                ],
            }
        )
    }
