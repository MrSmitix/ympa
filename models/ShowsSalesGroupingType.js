const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CATEGORIES',
                    'OFFERS',
                ],
            }
        )
    }
