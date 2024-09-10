const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PENDING',
                    'PROCESSING',
                    'FAILED',
                    'DONE',
                ],
            }
        )
    }
