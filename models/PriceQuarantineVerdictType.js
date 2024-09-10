const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Типы карантина:  * `PRICE_CHANGE` — новая цена слишком сильно отличается от прежней. В поле `params` будет  новая цена `CURRENT_PRICE` и последняя цена до попадания в карантин `LAST_VALID_PRICE`. * `LOW_PRICE` — установленная цена слишком сильно отличается от рыночной. В поле `params` будет установленная вами цена `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. * `LOW_PRICE_PROMO` — цена после применения акций слишком сильно отличается от рыночной. В поле `params` будет цена после применения акций `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PRICE_CHANGE',
                    'LOW_PRICE',
                    'LOW_PRICE_PROMO',
                ],
            }
        )
    }
