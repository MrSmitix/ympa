const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NEW',
                    'SUCCESS',
                    'FAIL',
                    'REVOKE',
                    'DONT_WANT',
                    'FAIL_MANUAL',
                ],
            }
        )
    }
