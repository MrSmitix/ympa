const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FINE',
                    'REJECT',
                ],
            }
        )
    }
