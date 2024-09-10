const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'LAST',
                    'PREVIOUS',
                    'DELETED',
                ],
            }
        )
    }
