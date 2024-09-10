const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNREDEEMED',
                    'RETURN',
                ],
            }
        )
    }
