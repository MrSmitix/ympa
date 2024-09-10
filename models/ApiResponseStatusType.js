const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип ответа. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OK',
                    'ERROR',
                ],
            }
        )
    }
