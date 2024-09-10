const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html)  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PUBLISHED',
                    'CHECKING',
                    'DISABLED_BY_PARTNER',
                    'DISABLED_AUTOMATICALLY',
                    'REJECTED_BY_MARKET',
                    'CREATING_CARD',
                    'NO_CARD',
                    'NO_STOCKS',
                    'ARCHIVED',
                ],
            }
        )
    }
