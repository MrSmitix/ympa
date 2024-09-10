const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус заказа:  * `CANCELLED` — отменен.  * `DELIVERED` — получен покупателем.  * `DELIVERY` — передан в службу доставки.  * `PICKUP` — доставлен в пункт самовывоза.  * `PROCESSING` — находится в обработке.  * `PENDING` — ожидает обработки со стороны продавца.  * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * `PLACING` — оформляется, подготовка к резервированию.  * `RESERVED` — зарезервирован, но недооформлен.  * `PARTIALLY_RETURNED` — возвращен частично.  * `RETURNED` — возвращен полностью.  * `UNKNOWN` — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PLACING',
                    'RESERVED',
                    'UNPAID',
                    'PROCESSING',
                    'DELIVERY',
                    'PICKUP',
                    'DELIVERED',
                    'CANCELLED',
                    'PENDING',
                    'PARTIALLY_RETURNED',
                    'RETURNED',
                    'UNKNOWN',
                ],
            }
        )
    }
