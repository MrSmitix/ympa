const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNKNOWN_CATEGORY',
                    'CATEGORY_IS_NOT_LEAF',
                ],
            }
        )
    }
