const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Язык:  * `RU` — русский.  * `EN` — английский.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'RU',
                    'EN',
                ],
            }
        )
    }
