const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NO_DATA',
                    'TOO_LARGE',
                    'RESOURCE_NOT_FOUND',
                ],
            }
        )
    }
