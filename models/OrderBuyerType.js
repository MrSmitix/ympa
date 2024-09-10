const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PERSON',
                    'BUSINESS',
                ],
            }
        )
    }
