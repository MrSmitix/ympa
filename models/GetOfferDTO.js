const utils = require('../utils/utils');
const AgeDTO = require('../models/AgeDTO');
const GetPriceDTO = require('../models/GetPriceDTO');
const GetPriceWithDiscountDTO = require('../models/GetPriceWithDiscountDTO');
const OfferCampaignStatusDTO = require('../models/OfferCampaignStatusDTO');
const OfferCardStatusType = require('../models/OfferCardStatusType');
const OfferConditionDTO = require('../models/OfferConditionDTO');
const OfferManualDTO = require('../models/OfferManualDTO');
const OfferParamDTO = require('../models/OfferParamDTO');
const OfferSellingProgramDTO = require('../models/OfferSellingProgramDTO');
const OfferType = require('../models/OfferType');
const OfferWeightDimensionsDTO = require('../models/OfferWeightDimensionsDTO');
const TimePeriodDTO = require('../models/TimePeriodDTO');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}offerId`,
                label: `Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  - [${labelPrefix}offerId]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}marketCategoryId`,
                label: `Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md).  - [${labelPrefix}marketCategoryId]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}category`,
                label: `Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  - [${labelPrefix}category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pictures`,
                label: `Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html)  - [${labelPrefix}pictures]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}videos`,
                label: `Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html)  - [${labelPrefix}videos]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}manuals`,
                label: `[${labelPrefix}manuals]`,
                children: OfferManualDTO.fields(`${keyPrefix}manuals${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}vendor`,
                label: `Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. - [${labelPrefix}vendor]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}barcodes`,
                label: `Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   - [${labelPrefix}barcodes]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}manufacturerCountries`,
                label: `Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx).  - [${labelPrefix}manufacturerCountries]`,
                list: true,
                type: 'string',
            },
            ...OfferWeightDimensionsDTO.fields(`${keyPrefix}weightDimensions`, isInput),
            {
                key: `${keyPrefix}vendorCode`,
                label: `Артикул товара от производителя. - [${labelPrefix}vendorCode]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}tags`,
                label: `Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов.  - [${labelPrefix}tags]`,
                list: true,
                type: 'string',
            },
            ...TimePeriodDTO.fields(`${keyPrefix}shelfLife`, isInput),
            ...TimePeriodDTO.fields(`${keyPrefix}lifeTime`, isInput),
            ...TimePeriodDTO.fields(`${keyPrefix}guaranteePeriod`, isInput),
            {
                key: `${keyPrefix}customsCommodityCode`,
                label: `Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть.  - [${labelPrefix}customsCommodityCode]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}certificates`,
                label: `Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html).  - [${labelPrefix}certificates]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}boxCount`,
                label: `Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр.  - [${labelPrefix}boxCount]`,
                type: 'integer',
            },
            ...OfferConditionDTO.fields(`${keyPrefix}condition`, isInput),
            {
                key: `${keyPrefix}type`,
                ...OfferType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}downloadable`,
                label: `Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md)  - [${labelPrefix}downloadable]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}adult`,
                label: `Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей.  - [${labelPrefix}adult]`,
                type: 'boolean',
            },
            ...AgeDTO.fields(`${keyPrefix}age`, isInput),
            {
                key: `${keyPrefix}params`,
                label: `[${labelPrefix}params]`,
                children: OfferParamDTO.fields(`${keyPrefix}params${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...GetPriceWithDiscountDTO.fields(`${keyPrefix}basicPrice`, isInput),
            ...GetPriceDTO.fields(`${keyPrefix}purchasePrice`, isInput),
            ...GetPriceDTO.fields(`${keyPrefix}additionalExpenses`, isInput),
            ...GetPriceDTO.fields(`${keyPrefix}cofinancePrice`, isInput),
            {
                key: `${keyPrefix}cardStatus`,
                ...OfferCardStatusType.fields(`${keyPrefix}cardStatus`, isInput),
            },
            {
                key: `${keyPrefix}campaigns`,
                label: `[${labelPrefix}campaigns]`,
                children: OfferCampaignStatusDTO.fields(`${keyPrefix}campaigns${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}sellingPrograms`,
                label: `[${labelPrefix}sellingPrograms]`,
                children: OfferSellingProgramDTO.fields(`${keyPrefix}sellingPrograms${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}archived`,
                label: `Товар помещен в архив.  - [${labelPrefix}archived]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offerId': bundle.inputData?.[`${keyPrefix}offerId`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'marketCategoryId': bundle.inputData?.[`${keyPrefix}marketCategoryId`],
            'category': bundle.inputData?.[`${keyPrefix}category`],
            'pictures': bundle.inputData?.[`${keyPrefix}pictures`],
            'videos': bundle.inputData?.[`${keyPrefix}videos`],
            'manuals': utils.childMapping(bundle.inputData?.[`${keyPrefix}manuals`], `${keyPrefix}manuals`, OfferManualDTO),
            'vendor': bundle.inputData?.[`${keyPrefix}vendor`],
            'barcodes': bundle.inputData?.[`${keyPrefix}barcodes`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'manufacturerCountries': bundle.inputData?.[`${keyPrefix}manufacturerCountries`],
            'weightDimensions': utils.removeIfEmpty(OfferWeightDimensionsDTO.mapping(bundle, `${keyPrefix}weightDimensions`)),
            'vendorCode': bundle.inputData?.[`${keyPrefix}vendorCode`],
            'tags': bundle.inputData?.[`${keyPrefix}tags`],
            'shelfLife': utils.removeIfEmpty(TimePeriodDTO.mapping(bundle, `${keyPrefix}shelfLife`)),
            'lifeTime': utils.removeIfEmpty(TimePeriodDTO.mapping(bundle, `${keyPrefix}lifeTime`)),
            'guaranteePeriod': utils.removeIfEmpty(TimePeriodDTO.mapping(bundle, `${keyPrefix}guaranteePeriod`)),
            'customsCommodityCode': bundle.inputData?.[`${keyPrefix}customsCommodityCode`],
            'certificates': bundle.inputData?.[`${keyPrefix}certificates`],
            'boxCount': bundle.inputData?.[`${keyPrefix}boxCount`],
            'condition': utils.removeIfEmpty(OfferConditionDTO.mapping(bundle, `${keyPrefix}condition`)),
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'downloadable': bundle.inputData?.[`${keyPrefix}downloadable`],
            'adult': bundle.inputData?.[`${keyPrefix}adult`],
            'age': utils.removeIfEmpty(AgeDTO.mapping(bundle, `${keyPrefix}age`)),
            'params': utils.childMapping(bundle.inputData?.[`${keyPrefix}params`], `${keyPrefix}params`, OfferParamDTO),
            'basicPrice': utils.removeIfEmpty(GetPriceWithDiscountDTO.mapping(bundle, `${keyPrefix}basicPrice`)),
            'purchasePrice': utils.removeIfEmpty(GetPriceDTO.mapping(bundle, `${keyPrefix}purchasePrice`)),
            'additionalExpenses': utils.removeIfEmpty(GetPriceDTO.mapping(bundle, `${keyPrefix}additionalExpenses`)),
            'cofinancePrice': utils.removeIfEmpty(GetPriceDTO.mapping(bundle, `${keyPrefix}cofinancePrice`)),
            'cardStatus': bundle.inputData?.[`${keyPrefix}cardStatus`],
            'campaigns': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaigns`], `${keyPrefix}campaigns`, OfferCampaignStatusDTO),
            'sellingPrograms': utils.childMapping(bundle.inputData?.[`${keyPrefix}sellingPrograms`], `${keyPrefix}sellingPrograms`, OfferSellingProgramDTO),
            'archived': bundle.inputData?.[`${keyPrefix}archived`],
        }
    },
}
