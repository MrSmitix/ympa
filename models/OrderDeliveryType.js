const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Способ доставки заказа:  * `DELIVERY` — курьерская доставка.  * `PICKUP` — самовывоз.  * `POST` — почта.  * `DIGITAL` — для цифровых товаров.  * `UNKNOWN` — неизвестный тип.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DELIVERY',
                    'PICKUP',
                    'POST',
                    'DIGITAL',
                    'UNKNOWN',
                ],
            }
        )
    }
