const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AT_MODERATION',
                    'FAILED',
                    'MODERATED',
                    'NONMODERATED',
                    'UNKNOWN',
                ],
            }
        )
    }
