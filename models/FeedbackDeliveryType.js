const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DELIVERY',
                    'PICKUP',
                    'INSTORE',
                ],
            }
        )
    }
