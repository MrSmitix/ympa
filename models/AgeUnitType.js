const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'YEAR',
                    'MONTH',
                ],
            }
        )
    }
