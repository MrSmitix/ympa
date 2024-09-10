const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FILE',
                    'CSV',
                ],
            }
        )
    }
