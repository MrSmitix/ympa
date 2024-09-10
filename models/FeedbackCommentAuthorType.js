const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип автора:  * `USER` — пользователь. * `SHOP` — магазин.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'USER',
                    'SHOP',
                ],
            }
        )
    }
