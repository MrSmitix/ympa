const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats).  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CLICKS',
                    'SHOWS',
                ],
            }
        )
    }
