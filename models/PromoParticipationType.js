const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PARTICIPATING_NOW',
                    'PARTICIPATED',
                ],
            }
        )
    }
