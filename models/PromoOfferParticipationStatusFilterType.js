const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'MANUALLY_ADDED',
                    'NOT_MANUALLY_ADDED',
                ],
            }
        )
    }
