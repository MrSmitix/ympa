const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'MERCHANT_TO_COURIER',
                    'COURIER_TO_MERCHANT',
                    'CHECKING_BY_MERCHANT',
                ],
            }
        )
    }
