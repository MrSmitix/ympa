const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ERROR',
                    'OK',
                    'WARNING',
                ],
            }
        )
    }
