const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'REJECTED',
                    'RETURNED',
                ],
            }
        )
    }
