const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html).  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DAILY',
                    'WEEKLY',
                    'BIWEEKLY',
                    'MONTHLY',
                ],
            }
        )
    }
