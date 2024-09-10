const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус документа:  * `READY` — готов. * `NOT_READY` — не готов.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'READY',
                    'NOT_READY',
                ],
            }
        )
    }
