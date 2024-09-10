const utils = require('../utils/utils');
const DayOfWeekType = require('../models/DayOfWeekType');
const OfferAvailabilityStatusType = require('../models/OfferAvailabilityStatusType');
const OfferProcessingStateDTO = require('../models/OfferProcessingStateDTO');
const OfferWeightDimensionsDTO = require('../models/OfferWeightDimensionsDTO');
const TimePeriodDTO = require('../models/TimePeriodDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shopSku`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}shopSku]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}category`,
                label: `Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  - [${labelPrefix}category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}vendor`,
                label: `Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. - [${labelPrefix}vendor]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}vendorCode`,
                label: `Артикул товара от производителя. - [${labelPrefix}vendorCode]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}feedId`,
                label: `Идентификатор фида. - [${labelPrefix}feedId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}barcodes`,
                label: `Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   - [${labelPrefix}barcodes]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}urls`,
                label: `URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url.  - [${labelPrefix}urls]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}pictures`,
                label: `Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`.  - [${labelPrefix}pictures]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}manufacturer`,
                label: `Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.  - [${labelPrefix}manufacturer]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}manufacturerCountries`,
                label: `Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран.  - [${labelPrefix}manufacturerCountries]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}minShipment`,
                label: `Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.  - [${labelPrefix}minShipment]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}transportUnitSize`,
                label: `Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.  - [${labelPrefix}transportUnitSize]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}quantumOfSupply`,
                label: `Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.  - [${labelPrefix}quantumOfSupply]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}deliveryDurationDays`,
                label: `Срок, за который продавец поставляет товары на склад, в днях. - [${labelPrefix}deliveryDurationDays]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}boxCount`,
                label: `Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.  - [${labelPrefix}boxCount]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}customsCommodityCodes`,
                label: `Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД.  - [${labelPrefix}customsCommodityCodes]`,
                list: true,
                type: 'string',
            },
            ...OfferWeightDimensionsDTO.fields(`${keyPrefix}weightDimensions`, isInput),
            {
                key: `${keyPrefix}supplyScheduleDays`,
                list: true,
                type: 'string',
                ...DayOfWeekType.fields(`${keyPrefix}supplyScheduleDays`, isInput),
            },
            {
                key: `${keyPrefix}shelfLifeDays`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования.  - [${labelPrefix}shelfLifeDays]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}lifeTimeDays`,
                label: `{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.  - [${labelPrefix}lifeTimeDays]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}guaranteePeriodDays`,
                label: `Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.  - [${labelPrefix}guaranteePeriodDays]`,
                type: 'integer',
            },
            ...OfferProcessingStateDTO.fields(`${keyPrefix}processingState`, isInput),
            {
                key: `${keyPrefix}availability`,
                ...OfferAvailabilityStatusType.fields(`${keyPrefix}availability`, isInput),
            },
            ...TimePeriodDTO.fields(`${keyPrefix}shelfLife`, isInput),
            ...TimePeriodDTO.fields(`${keyPrefix}lifeTime`, isInput),
            ...TimePeriodDTO.fields(`${keyPrefix}guaranteePeriod`, isInput),
            {
                key: `${keyPrefix}certificate`,
                label: `Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)  - [${labelPrefix}certificate]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}price`,
                label: `Цена на товар в рублях. - [${labelPrefix}price]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'shopSku': bundle.inputData?.[`${keyPrefix}shopSku`],
            'category': bundle.inputData?.[`${keyPrefix}category`],
            'vendor': bundle.inputData?.[`${keyPrefix}vendor`],
            'vendorCode': bundle.inputData?.[`${keyPrefix}vendorCode`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'feedId': bundle.inputData?.[`${keyPrefix}feedId`],
            'barcodes': bundle.inputData?.[`${keyPrefix}barcodes`],
            'urls': bundle.inputData?.[`${keyPrefix}urls`],
            'pictures': bundle.inputData?.[`${keyPrefix}pictures`],
            'manufacturer': bundle.inputData?.[`${keyPrefix}manufacturer`],
            'manufacturerCountries': bundle.inputData?.[`${keyPrefix}manufacturerCountries`],
            'minShipment': bundle.inputData?.[`${keyPrefix}minShipment`],
            'transportUnitSize': bundle.inputData?.[`${keyPrefix}transportUnitSize`],
            'quantumOfSupply': bundle.inputData?.[`${keyPrefix}quantumOfSupply`],
            'deliveryDurationDays': bundle.inputData?.[`${keyPrefix}deliveryDurationDays`],
            'boxCount': bundle.inputData?.[`${keyPrefix}boxCount`],
            'customsCommodityCodes': bundle.inputData?.[`${keyPrefix}customsCommodityCodes`],
            'weightDimensions': utils.removeIfEmpty(OfferWeightDimensionsDTO.mapping(bundle, `${keyPrefix}weightDimensions`)),
            'supplyScheduleDays': utils.childMapping(bundle.inputData?.[`${keyPrefix}supplyScheduleDays`], `${keyPrefix}supplyScheduleDays`, DayOfWeekType),
            'shelfLifeDays': bundle.inputData?.[`${keyPrefix}shelfLifeDays`],
            'lifeTimeDays': bundle.inputData?.[`${keyPrefix}lifeTimeDays`],
            'guaranteePeriodDays': bundle.inputData?.[`${keyPrefix}guaranteePeriodDays`],
            'processingState': utils.removeIfEmpty(OfferProcessingStateDTO.mapping(bundle, `${keyPrefix}processingState`)),
            'availability': bundle.inputData?.[`${keyPrefix}availability`],
            'shelfLife': utils.removeIfEmpty(TimePeriodDTO.mapping(bundle, `${keyPrefix}shelfLife`)),
            'lifeTime': utils.removeIfEmpty(TimePeriodDTO.mapping(bundle, `${keyPrefix}lifeTime`)),
            'guaranteePeriod': utils.removeIfEmpty(TimePeriodDTO.mapping(bundle, `${keyPrefix}guaranteePeriod`)),
            'certificate': bundle.inputData?.[`${keyPrefix}certificate`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
        }
    },
}
