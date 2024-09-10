const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'HOUR',
                    'DAY',
                    'WEEK',
                    'MONTH',
                    'YEAR',
                ],
            }
        )
    }
