const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ALL',
                    'NEED_REACTION',
                ],
            }
        )
    }
