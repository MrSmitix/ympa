const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SPECIFIED',
                    'EMPTY',
                ],
            }
        )
    }
