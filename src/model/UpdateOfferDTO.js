/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AgeDTO from './AgeDTO';
import BaseOfferDTO from './BaseOfferDTO';
import BasePriceDTO from './BasePriceDTO';
import OfferConditionDTO from './OfferConditionDTO';
import OfferManualDTO from './OfferManualDTO';
import OfferParamDTO from './OfferParamDTO';
import OfferType from './OfferType';
import OfferWeightDimensionsDTO from './OfferWeightDimensionsDTO';
import ParameterValueDTO from './ParameterValueDTO';
import TimePeriodDTO from './TimePeriodDTO';
import UpdatePriceWithDiscountDTO from './UpdatePriceWithDiscountDTO';

/**
 * The UpdateOfferDTO model module.
 * @module model/UpdateOfferDTO
 * @version LATEST
 */
class UpdateOfferDTO {
    /**
     * Constructs a new <code>UpdateOfferDTO</code>.
     * Параметры товара.
     * @alias module:model/UpdateOfferDTO
     * @implements module:model/BaseOfferDTO
     * @param offerId {String} Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     */
    constructor(offerId) { 
        BaseOfferDTO.initialize(this, offerId);
        UpdateOfferDTO.initialize(this, offerId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, offerId) { 
        obj['offerId'] = offerId;
    }

    /**
     * Constructs a <code>UpdateOfferDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateOfferDTO} obj Optional instance to populate.
     * @return {module:model/UpdateOfferDTO} The populated <code>UpdateOfferDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateOfferDTO();
            BaseOfferDTO.constructFromObject(data, obj);

            if (data.hasOwnProperty('offerId')) {
                obj['offerId'] = ApiClient.convertToType(data['offerId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('marketCategoryId')) {
                obj['marketCategoryId'] = ApiClient.convertToType(data['marketCategoryId'], 'Number');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('pictures')) {
                obj['pictures'] = ApiClient.convertToType(data['pictures'], ['String']);
            }
            if (data.hasOwnProperty('videos')) {
                obj['videos'] = ApiClient.convertToType(data['videos'], ['String']);
            }
            if (data.hasOwnProperty('manuals')) {
                obj['manuals'] = ApiClient.convertToType(data['manuals'], [OfferManualDTO]);
            }
            if (data.hasOwnProperty('vendor')) {
                obj['vendor'] = ApiClient.convertToType(data['vendor'], 'String');
            }
            if (data.hasOwnProperty('barcodes')) {
                obj['barcodes'] = ApiClient.convertToType(data['barcodes'], ['String']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('manufacturerCountries')) {
                obj['manufacturerCountries'] = ApiClient.convertToType(data['manufacturerCountries'], ['String']);
            }
            if (data.hasOwnProperty('weightDimensions')) {
                obj['weightDimensions'] = OfferWeightDimensionsDTO.constructFromObject(data['weightDimensions']);
            }
            if (data.hasOwnProperty('vendorCode')) {
                obj['vendorCode'] = ApiClient.convertToType(data['vendorCode'], 'String');
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
            }
            if (data.hasOwnProperty('shelfLife')) {
                obj['shelfLife'] = TimePeriodDTO.constructFromObject(data['shelfLife']);
            }
            if (data.hasOwnProperty('lifeTime')) {
                obj['lifeTime'] = TimePeriodDTO.constructFromObject(data['lifeTime']);
            }
            if (data.hasOwnProperty('guaranteePeriod')) {
                obj['guaranteePeriod'] = TimePeriodDTO.constructFromObject(data['guaranteePeriod']);
            }
            if (data.hasOwnProperty('customsCommodityCode')) {
                obj['customsCommodityCode'] = ApiClient.convertToType(data['customsCommodityCode'], 'String');
            }
            if (data.hasOwnProperty('certificates')) {
                obj['certificates'] = ApiClient.convertToType(data['certificates'], ['String']);
            }
            if (data.hasOwnProperty('boxCount')) {
                obj['boxCount'] = ApiClient.convertToType(data['boxCount'], 'Number');
            }
            if (data.hasOwnProperty('condition')) {
                obj['condition'] = OfferConditionDTO.constructFromObject(data['condition']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = OfferType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('downloadable')) {
                obj['downloadable'] = ApiClient.convertToType(data['downloadable'], 'Boolean');
            }
            if (data.hasOwnProperty('adult')) {
                obj['adult'] = ApiClient.convertToType(data['adult'], 'Boolean');
            }
            if (data.hasOwnProperty('age')) {
                obj['age'] = AgeDTO.constructFromObject(data['age']);
            }
            if (data.hasOwnProperty('params')) {
                obj['params'] = ApiClient.convertToType(data['params'], [OfferParamDTO]);
            }
            if (data.hasOwnProperty('parameterValues')) {
                obj['parameterValues'] = ApiClient.convertToType(data['parameterValues'], [ParameterValueDTO]);
            }
            if (data.hasOwnProperty('basicPrice')) {
                obj['basicPrice'] = UpdatePriceWithDiscountDTO.constructFromObject(data['basicPrice']);
            }
            if (data.hasOwnProperty('purchasePrice')) {
                obj['purchasePrice'] = BasePriceDTO.constructFromObject(data['purchasePrice']);
            }
            if (data.hasOwnProperty('additionalExpenses')) {
                obj['additionalExpenses'] = BasePriceDTO.constructFromObject(data['additionalExpenses']);
            }
            if (data.hasOwnProperty('cofinancePrice')) {
                obj['cofinancePrice'] = BasePriceDTO.constructFromObject(data['cofinancePrice']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UpdateOfferDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UpdateOfferDTO</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of UpdateOfferDTO.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['offerId'] && !(typeof data['offerId'] === 'string' || data['offerId'] instanceof String)) {
            throw new Error("Expected the field `offerId` to be a primitive type in the JSON string but got " + data['offerId']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['category'] && !(typeof data['category'] === 'string' || data['category'] instanceof String)) {
            throw new Error("Expected the field `category` to be a primitive type in the JSON string but got " + data['category']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['pictures'])) {
            throw new Error("Expected the field `pictures` to be an array in the JSON data but got " + data['pictures']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['videos'])) {
            throw new Error("Expected the field `videos` to be an array in the JSON data but got " + data['videos']);
        }
        if (data['manuals']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['manuals'])) {
                throw new Error("Expected the field `manuals` to be an array in the JSON data but got " + data['manuals']);
            }
            // validate the optional field `manuals` (array)
            for (const item of data['manuals']) {
                OfferManualDTO.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['vendor'] && !(typeof data['vendor'] === 'string' || data['vendor'] instanceof String)) {
            throw new Error("Expected the field `vendor` to be a primitive type in the JSON string but got " + data['vendor']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['barcodes'])) {
            throw new Error("Expected the field `barcodes` to be an array in the JSON data but got " + data['barcodes']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['manufacturerCountries'])) {
            throw new Error("Expected the field `manufacturerCountries` to be an array in the JSON data but got " + data['manufacturerCountries']);
        }
        // validate the optional field `weightDimensions`
        if (data['weightDimensions']) { // data not null
          OfferWeightDimensionsDTO.validateJSON(data['weightDimensions']);
        }
        // ensure the json data is a string
        if (data['vendorCode'] && !(typeof data['vendorCode'] === 'string' || data['vendorCode'] instanceof String)) {
            throw new Error("Expected the field `vendorCode` to be a primitive type in the JSON string but got " + data['vendorCode']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['tags'])) {
            throw new Error("Expected the field `tags` to be an array in the JSON data but got " + data['tags']);
        }
        // validate the optional field `shelfLife`
        if (data['shelfLife']) { // data not null
          TimePeriodDTO.validateJSON(data['shelfLife']);
        }
        // validate the optional field `lifeTime`
        if (data['lifeTime']) { // data not null
          TimePeriodDTO.validateJSON(data['lifeTime']);
        }
        // validate the optional field `guaranteePeriod`
        if (data['guaranteePeriod']) { // data not null
          TimePeriodDTO.validateJSON(data['guaranteePeriod']);
        }
        // ensure the json data is a string
        if (data['customsCommodityCode'] && !(typeof data['customsCommodityCode'] === 'string' || data['customsCommodityCode'] instanceof String)) {
            throw new Error("Expected the field `customsCommodityCode` to be a primitive type in the JSON string but got " + data['customsCommodityCode']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['certificates'])) {
            throw new Error("Expected the field `certificates` to be an array in the JSON data but got " + data['certificates']);
        }
        // validate the optional field `condition`
        if (data['condition']) { // data not null
          OfferConditionDTO.validateJSON(data['condition']);
        }
        // validate the optional field `age`
        if (data['age']) { // data not null
          AgeDTO.validateJSON(data['age']);
        }
        if (data['params']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['params'])) {
                throw new Error("Expected the field `params` to be an array in the JSON data but got " + data['params']);
            }
            // validate the optional field `params` (array)
            for (const item of data['params']) {
                OfferParamDTO.validateJSON(item);
            };
        }
        if (data['parameterValues']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['parameterValues'])) {
                throw new Error("Expected the field `parameterValues` to be an array in the JSON data but got " + data['parameterValues']);
            }
            // validate the optional field `parameterValues` (array)
            for (const item of data['parameterValues']) {
                ParameterValueDTO.validateJSON(item);
            };
        }
        // validate the optional field `basicPrice`
        if (data['basicPrice']) { // data not null
          UpdatePriceWithDiscountDTO.validateJSON(data['basicPrice']);
        }
        // validate the optional field `purchasePrice`
        if (data['purchasePrice']) { // data not null
          BasePriceDTO.validateJSON(data['purchasePrice']);
        }
        // validate the optional field `additionalExpenses`
        if (data['additionalExpenses']) { // data not null
          BasePriceDTO.validateJSON(data['additionalExpenses']);
        }
        // validate the optional field `cofinancePrice`
        if (data['cofinancePrice']) { // data not null
          BasePriceDTO.validateJSON(data['cofinancePrice']);
        }

        return true;
    }


}

UpdateOfferDTO.RequiredProperties = ["offerId"];

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @member {String} offerId
 */
UpdateOfferDTO.prototype['offerId'] = undefined;

/**
 * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
 * @member {String} name
 */
UpdateOfferDTO.prototype['name'] = undefined;

/**
 * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
 * @member {Number} marketCategoryId
 */
UpdateOfferDTO.prototype['marketCategoryId'] = undefined;

/**
 * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
 * @member {String} category
 */
UpdateOfferDTO.prototype['category'] = undefined;

/**
 * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
 * @member {Array.<String>} pictures
 */
UpdateOfferDTO.prototype['pictures'] = undefined;

/**
 * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
 * @member {Array.<String>} videos
 */
UpdateOfferDTO.prototype['videos'] = undefined;

/**
 * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
 * @member {Array.<module:model/OfferManualDTO>} manuals
 */
UpdateOfferDTO.prototype['manuals'] = undefined;

/**
 * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
 * @member {String} vendor
 */
UpdateOfferDTO.prototype['vendor'] = undefined;

/**
 * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
 * @member {Array.<String>} barcodes
 */
UpdateOfferDTO.prototype['barcodes'] = undefined;

/**
 * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
 * @member {String} description
 */
UpdateOfferDTO.prototype['description'] = undefined;

/**
 * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
 * @member {Array.<String>} manufacturerCountries
 */
UpdateOfferDTO.prototype['manufacturerCountries'] = undefined;

/**
 * @member {module:model/OfferWeightDimensionsDTO} weightDimensions
 */
UpdateOfferDTO.prototype['weightDimensions'] = undefined;

/**
 * Артикул товара от производителя.
 * @member {String} vendorCode
 */
UpdateOfferDTO.prototype['vendorCode'] = undefined;

/**
 * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
 * @member {Array.<String>} tags
 */
UpdateOfferDTO.prototype['tags'] = undefined;

/**
 * @member {module:model/TimePeriodDTO} shelfLife
 */
UpdateOfferDTO.prototype['shelfLife'] = undefined;

/**
 * @member {module:model/TimePeriodDTO} lifeTime
 */
UpdateOfferDTO.prototype['lifeTime'] = undefined;

/**
 * @member {module:model/TimePeriodDTO} guaranteePeriod
 */
UpdateOfferDTO.prototype['guaranteePeriod'] = undefined;

/**
 * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
 * @member {String} customsCommodityCode
 */
UpdateOfferDTO.prototype['customsCommodityCode'] = undefined;

/**
 * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
 * @member {Array.<String>} certificates
 */
UpdateOfferDTO.prototype['certificates'] = undefined;

/**
 * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
 * @member {Number} boxCount
 */
UpdateOfferDTO.prototype['boxCount'] = undefined;

/**
 * @member {module:model/OfferConditionDTO} condition
 */
UpdateOfferDTO.prototype['condition'] = undefined;

/**
 * @member {module:model/OfferType} type
 */
UpdateOfferDTO.prototype['type'] = undefined;

/**
 * Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
 * @member {Boolean} downloadable
 */
UpdateOfferDTO.prototype['downloadable'] = undefined;

/**
 * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
 * @member {Boolean} adult
 */
UpdateOfferDTO.prototype['adult'] = undefined;

/**
 * @member {module:model/AgeDTO} age
 */
UpdateOfferDTO.prototype['age'] = undefined;

/**
 * {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
 * @member {Array.<module:model/OfferParamDTO>} params
 */
UpdateOfferDTO.prototype['params'] = undefined;

/**
 * Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
 * @member {Array.<module:model/ParameterValueDTO>} parameterValues
 */
UpdateOfferDTO.prototype['parameterValues'] = undefined;

/**
 * @member {module:model/UpdatePriceWithDiscountDTO} basicPrice
 */
UpdateOfferDTO.prototype['basicPrice'] = undefined;

/**
 * @member {module:model/BasePriceDTO} purchasePrice
 */
UpdateOfferDTO.prototype['purchasePrice'] = undefined;

/**
 * @member {module:model/BasePriceDTO} additionalExpenses
 */
UpdateOfferDTO.prototype['additionalExpenses'] = undefined;

/**
 * @member {module:model/BasePriceDTO} cofinancePrice
 */
UpdateOfferDTO.prototype['cofinancePrice'] = undefined;


// Implement BaseOfferDTO interface:
/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @member {String} offerId
 */
BaseOfferDTO.prototype['offerId'] = undefined;
/**
 * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
 * @member {String} name
 */
BaseOfferDTO.prototype['name'] = undefined;
/**
 * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
 * @member {Number} marketCategoryId
 */
BaseOfferDTO.prototype['marketCategoryId'] = undefined;
/**
 * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
 * @member {String} category
 */
BaseOfferDTO.prototype['category'] = undefined;
/**
 * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
 * @member {Array.<String>} pictures
 */
BaseOfferDTO.prototype['pictures'] = undefined;
/**
 * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
 * @member {Array.<String>} videos
 */
BaseOfferDTO.prototype['videos'] = undefined;
/**
 * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
 * @member {Array.<module:model/OfferManualDTO>} manuals
 */
BaseOfferDTO.prototype['manuals'] = undefined;
/**
 * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
 * @member {String} vendor
 */
BaseOfferDTO.prototype['vendor'] = undefined;
/**
 * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
 * @member {Array.<String>} barcodes
 */
BaseOfferDTO.prototype['barcodes'] = undefined;
/**
 * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
 * @member {String} description
 */
BaseOfferDTO.prototype['description'] = undefined;
/**
 * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
 * @member {Array.<String>} manufacturerCountries
 */
BaseOfferDTO.prototype['manufacturerCountries'] = undefined;
/**
 * @member {module:model/OfferWeightDimensionsDTO} weightDimensions
 */
BaseOfferDTO.prototype['weightDimensions'] = undefined;
/**
 * Артикул товара от производителя.
 * @member {String} vendorCode
 */
BaseOfferDTO.prototype['vendorCode'] = undefined;
/**
 * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
 * @member {Array.<String>} tags
 */
BaseOfferDTO.prototype['tags'] = undefined;
/**
 * @member {module:model/TimePeriodDTO} shelfLife
 */
BaseOfferDTO.prototype['shelfLife'] = undefined;
/**
 * @member {module:model/TimePeriodDTO} lifeTime
 */
BaseOfferDTO.prototype['lifeTime'] = undefined;
/**
 * @member {module:model/TimePeriodDTO} guaranteePeriod
 */
BaseOfferDTO.prototype['guaranteePeriod'] = undefined;
/**
 * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
 * @member {String} customsCommodityCode
 */
BaseOfferDTO.prototype['customsCommodityCode'] = undefined;
/**
 * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
 * @member {Array.<String>} certificates
 */
BaseOfferDTO.prototype['certificates'] = undefined;
/**
 * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
 * @member {Number} boxCount
 */
BaseOfferDTO.prototype['boxCount'] = undefined;
/**
 * @member {module:model/OfferConditionDTO} condition
 */
BaseOfferDTO.prototype['condition'] = undefined;
/**
 * @member {module:model/OfferType} type
 */
BaseOfferDTO.prototype['type'] = undefined;
/**
 * Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
 * @member {Boolean} downloadable
 */
BaseOfferDTO.prototype['downloadable'] = undefined;
/**
 * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
 * @member {Boolean} adult
 */
BaseOfferDTO.prototype['adult'] = undefined;
/**
 * @member {module:model/AgeDTO} age
 */
BaseOfferDTO.prototype['age'] = undefined;
/**
 * {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
 * @member {Array.<module:model/OfferParamDTO>} params
 */
BaseOfferDTO.prototype['params'] = undefined;




export default UpdateOfferDTO;

