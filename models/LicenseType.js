const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ALCOHOL',
                    'UNKNOWN',
                ],
            }
        )
    }
