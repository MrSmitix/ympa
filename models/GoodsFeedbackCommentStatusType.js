const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PUBLISHED',
                    'UNMODERATED',
                    'BANNED',
                    'DELETED',
                ],
            }
        )
    }
