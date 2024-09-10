const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CREATED',
                    'RECEIVED',
                    'IN_TRANSIT',
                    'READY_FOR_PICKUP',
                    'PICKED',
                    'LOST',
                    'EXPIRED',
                    'CANCELLED',
                    'FULFILMENT_RECEIVED',
                    'PREPARED_FOR_UTILIZATION',
                    'NOT_IN_DEMAND',
                    'UTILIZED',
                    'READY_FOR_EXPROPRIATION',
                    'RECEIVED_FOR_EXPROPRIATION',
                ],
            }
        )
    }
