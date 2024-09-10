const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'TEXT',
                    'ENUM',
                    'BOOLEAN',
                    'NUMERIC',
                ],
            }
        )
    }
