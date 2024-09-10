const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'USER',
                    'BUSINESS',
                ],
            }
        )
    }
