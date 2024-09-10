const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PREOWNED',
                    'SHOWCASESAMPLE',
                    'REFURBISHED',
                    'REDUCTION',
                    'RENOVATED',
                    'NOT_SPECIFIED',
                ],
            }
        )
    }
