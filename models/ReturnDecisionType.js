const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Решение по возврату:  * `REFUND_MONEY` — вернуть деньги покупателю.  * `REFUND_MONEY_INCLUDING_SHIPMENT` — вернуть деньги за товар и пересылку.  * `REPAIR` — отремонтировать товар.  * `REPLACE` — заменить товар.  * `SEND_TO_EXAMINATION` — взять товар на экспертизу.  * `DECLINE_REFUND` — отказать в возврате.  * `OTHER_DECISION` — другое решение.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'REFUND_MONEY',
                    'REFUND_MONEY_INCLUDING_SHIPMENT',
                    'REPAIR',
                    'REPLACE',
                    'SEND_TO_EXAMINATION',
                    'DECLINE_REFUND',
                    'OTHER_DECISION',
                    'UNKNOWN',
                ],
            }
        )
    }
