const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'A4',
                    'A8',
                ],
            }
        )
    }
