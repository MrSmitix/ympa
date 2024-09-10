const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ACCEPTED',
                    'REJECTED',
                    'NEED_UPDATE',
                ],
            }
        )
    }
