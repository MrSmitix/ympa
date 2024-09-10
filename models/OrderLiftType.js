const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип подъема заказа на этаж:  * `NOT_NEEDED` — не требуется.  * `MANUAL` — ручной.  * `ELEVATOR` — лифт.  * `CARGO_ELEVATOR` — грузовой лифт.  * `FREE` — любой из перечисленных выше, если включена опция бесплатного подъема.  * `UNKNOWN` — неизвестный тип.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NOT_NEEDED',
                    'MANUAL',
                    'ELEVATOR',
                    'CARGO_ELEVATOR',
                    'FREE',
                    'UNKNOWN',
                ],
            }
        )
    }
