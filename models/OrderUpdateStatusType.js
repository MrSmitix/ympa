const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OK',
                    'ERROR',
                ],
            }
        )
    }
