/* tslint:disable */
/* eslint-disable */
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
 */

import { mapValues } from '../runtime';
import type { BasePriceDTO } from './BasePriceDTO';
import {
    BasePriceDTOFromJSON,
    BasePriceDTOFromJSONTyped,
    BasePriceDTOToJSON,
} from './BasePriceDTO';
import type { UpdatePriceWithDiscountDTO } from './UpdatePriceWithDiscountDTO';
import {
    UpdatePriceWithDiscountDTOFromJSON,
    UpdatePriceWithDiscountDTOFromJSONTyped,
    UpdatePriceWithDiscountDTOToJSON,
} from './UpdatePriceWithDiscountDTO';
import type { AgeDTO } from './AgeDTO';
import {
    AgeDTOFromJSON,
    AgeDTOFromJSONTyped,
    AgeDTOToJSON,
} from './AgeDTO';
import type { OfferConditionDTO } from './OfferConditionDTO';
import {
    OfferConditionDTOFromJSON,
    OfferConditionDTOFromJSONTyped,
    OfferConditionDTOToJSON,
} from './OfferConditionDTO';
import type { OfferParamDTO } from './OfferParamDTO';
import {
    OfferParamDTOFromJSON,
    OfferParamDTOFromJSONTyped,
    OfferParamDTOToJSON,
} from './OfferParamDTO';
import type { OfferManualDTO } from './OfferManualDTO';
import {
    OfferManualDTOFromJSON,
    OfferManualDTOFromJSONTyped,
    OfferManualDTOToJSON,
} from './OfferManualDTO';
import type { OfferWeightDimensionsDTO } from './OfferWeightDimensionsDTO';
import {
    OfferWeightDimensionsDTOFromJSON,
    OfferWeightDimensionsDTOFromJSONTyped,
    OfferWeightDimensionsDTOToJSON,
} from './OfferWeightDimensionsDTO';
import type { TimePeriodDTO } from './TimePeriodDTO';
import {
    TimePeriodDTOFromJSON,
    TimePeriodDTOFromJSONTyped,
    TimePeriodDTOToJSON,
} from './TimePeriodDTO';
import type { ParameterValueDTO } from './ParameterValueDTO';
import {
    ParameterValueDTOFromJSON,
    ParameterValueDTOFromJSONTyped,
    ParameterValueDTOToJSON,
} from './ParameterValueDTO';
import type { OfferType } from './OfferType';
import {
    OfferTypeFromJSON,
    OfferTypeFromJSONTyped,
    OfferTypeToJSON,
} from './OfferType';

/**
 * Параметры товара.
 * @export
 * @interface UpdateOfferDTO
 */
export interface UpdateOfferDTO {
    /**
     * Ваш SKU — идентификатор товара в вашей системе.
     * 
     * Разрешена любая последовательность длиной до 255 знаков.
     * 
     * Правила использования SKU:
     * 
     * * У каждого товара SKU должен быть свой.
     * 
     * * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.
     * 
     * * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.
     * 
     * [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * 
     * @type {string}
     * @memberof UpdateOfferDTO
     */
    offerId: string;
    /**
     * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.
     * 
     * Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.
     * 
     * Оптимальная длина — 50–60 символов, максимальная — 256.
     * 
     * [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)
     * 
     * @type {string}
     * @memberof UpdateOfferDTO
     */
    name?: string;
    /**
     * Идентификатор категории на Маркете, к которой вы относите свой товар.
     * 
     * Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.
     * 
     * При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.
     * 
     * Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     * 
     * @type {number}
     * @memberof UpdateOfferDTO
     */
    marketCategoryId?: number;
    /**
     * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.
     * 
     * Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.
     * 
     * Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.
     * 
     * Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.
     * 
     * @type {string}
     * @memberof UpdateOfferDTO
     */
    category?: string;
    /**
     * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.
     * 
     * **Требования к ссылкам**
     * 
     * * Ссылок может быть до 30.
     * * Указывайте ссылку целиком, включая протокол http или https.
     * * Максимальная длина — 512 символов.
     * * Русские буквы в URL можно.
     * * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.
     * 
     * ✅ `https://example-shop.ru/images/sku12345.jpg`
     * 
     * ✅ `https://yadi.sk/i/NaBoRsimVOLov`
     * 
     * ❌ `/images/sku12345.jpg`
     * 
     * ❌ `https://www.dropbox.com/s/818f/tovar.jpg`
     * 
     * Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.
     * 
     * Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.
     * 
     * [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html)
     * 
     * @type {Array<string>}
     * @memberof UpdateOfferDTO
     */
    pictures?: Array<string> | null;
    /**
     * Ссылка (URL) на видео товара.
     * 
     * Максимальное количество ссылок — 6.
     * 
     * **Требования к ссылке**
     * 
     * * Указывайте ссылку целиком, включая протокол http или https.
     * * Максимальная длина — 512 символов.
     * * Русские буквы в URL можно.
     * * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.
     * 
     * ✅ `https://example-shop.ru/video/sku12345.avi`
     * 
     * ✅ `https://yadi.sk/i/NaBoRsimVOLov`
     * 
     * ❌ `/video/sku12345.avi`
     * 
     * ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`
     * 
     * Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.
     * 
     * Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.
     * 
     * [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html)
     * 
     * @type {Array<string>}
     * @memberof UpdateOfferDTO
     */
    videos?: Array<string> | null;
    /**
     * Список инструкций по использованию товара.
     * 
     * Максимальное количество инструкций — 6.
     * 
     * Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся.
     * 
     * @type {Array<OfferManualDTO>}
     * @memberof UpdateOfferDTO
     */
    manuals?: Array<OfferManualDTO> | null;
    /**
     * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
     * @type {string}
     * @memberof UpdateOfferDTO
     */
    vendor?: string;
    /**
     * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.
     * 
     * Для книг указывайте ISBN.
     * 
     * Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.
     * 
     * [Что такое GTIN](*gtin)
     * 
     * 
     * @type {Array<string>}
     * @memberof UpdateOfferDTO
     */
    barcodes?: Array<string> | null;
    /**
     * Подробное описание товара: например, его преимущества и особенности.
     * 
     * Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.
     * 
     * Можно использовать теги:
     * 
     * * \<h>, \<h1>, \<h2> и так далее — для заголовков;
     * * \<br> и \<p> — для переноса строки;
     * * \<ol> — для нумерованного списка;
     * * \<ul> — для маркированного списка;
     * * \<li> — для создания элементов списка (должен находиться внутри \<ol> или \<ul>);
     * * \<div> — поддерживается, но не влияет на отображение текста.
     * 
     * Оптимальная длина — 400–600 символов, максимальная — 6000.
     * 
     * [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)
     * 
     * @type {string}
     * @memberof UpdateOfferDTO
     */
    description?: string;
    /**
     * Страна, где был произведен товар.
     * 
     * Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx).
     * 
     * @type {Array<string>}
     * @memberof UpdateOfferDTO
     */
    manufacturerCountries?: Array<string> | null;
    /**
     * 
     * @type {OfferWeightDimensionsDTO}
     * @memberof UpdateOfferDTO
     */
    weightDimensions?: OfferWeightDimensionsDTO;
    /**
     * Артикул товара от производителя.
     * @type {string}
     * @memberof UpdateOfferDTO
     */
    vendorCode?: string;
    /**
     * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.
     * 
     * Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов.
     * 
     * @type {Array<string>}
     * @memberof UpdateOfferDTO
     */
    tags?: Array<string> | null;
    /**
     * 
     * @type {TimePeriodDTO}
     * @memberof UpdateOfferDTO
     */
    shelfLife?: TimePeriodDTO;
    /**
     * 
     * @type {TimePeriodDTO}
     * @memberof UpdateOfferDTO
     */
    lifeTime?: TimePeriodDTO;
    /**
     * 
     * @type {TimePeriodDTO}
     * @memberof UpdateOfferDTO
     */
    guaranteePeriod?: TimePeriodDTO;
    /**
     * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.
     * 
     * Обязательно укажите, если он есть.
     * 
     * @type {string}
     * @memberof UpdateOfferDTO
     */
    customsCommodityCode?: string;
    /**
     * Номера документов на товар: сертификата, декларации соответствия и т. п.
     * 
     * Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html).
     * 
     * @type {Array<string>}
     * @memberof UpdateOfferDTO
     */
    certificates?: Array<string> | null;
    /**
     * Количество грузовых мест.
     * 
     * Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.
     * 
     * Для товаров, занимающих одно место, не передавайте этот параметр.
     * 
     * @type {number}
     * @memberof UpdateOfferDTO
     */
    boxCount?: number;
    /**
     * 
     * @type {OfferConditionDTO}
     * @memberof UpdateOfferDTO
     */
    condition?: OfferConditionDTO;
    /**
     * 
     * @type {OfferType}
     * @memberof UpdateOfferDTO
     */
    type?: OfferType;
    /**
     * Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.
     * 
     * [Как работать с цифровыми товарами](../../step-by-step/digital.md)
     * 
     * @type {boolean}
     * @memberof UpdateOfferDTO
     */
    downloadable?: boolean;
    /**
     * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей.
     * 
     * @type {boolean}
     * @memberof UpdateOfferDTO
     */
    adult?: boolean;
    /**
     * 
     * @type {AgeDTO}
     * @memberof UpdateOfferDTO
     */
    age?: AgeDTO;
    /**
     * {% note warning "" %}
     * 
     * Этот параметр устарел. При передаче характеристик используйте `parameterValues`.
     * 
     * {% endnote %}
     * 
     * Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви.
     * 
     * @type {Array<OfferParamDTO>}
     * @memberof UpdateOfferDTO
     * @deprecated
     */
    params?: Array<OfferParamDTO> | null;
    /**
     * Список характеристик с их значениями.
     * 
     * С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.
     * 
     * При **изменении** характеристик передавайте только те, значение которых нужно обновить.
     * 
     * Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.
     * 
     * Максимальное количество характеристик — 300.
     * 
     * @type {Array<ParameterValueDTO>}
     * @memberof UpdateOfferDTO
     */
    parameterValues?: Array<ParameterValueDTO> | null;
    /**
     * 
     * @type {UpdatePriceWithDiscountDTO}
     * @memberof UpdateOfferDTO
     */
    basicPrice?: UpdatePriceWithDiscountDTO;
    /**
     * 
     * @type {BasePriceDTO}
     * @memberof UpdateOfferDTO
     */
    purchasePrice?: BasePriceDTO;
    /**
     * 
     * @type {BasePriceDTO}
     * @memberof UpdateOfferDTO
     */
    additionalExpenses?: BasePriceDTO;
    /**
     * 
     * @type {BasePriceDTO}
     * @memberof UpdateOfferDTO
     */
    cofinancePrice?: BasePriceDTO;
}



/**
 * Check if a given object implements the UpdateOfferDTO interface.
 */
export function instanceOfUpdateOfferDTO(value: object): value is UpdateOfferDTO {
    if (!('offerId' in value) || value['offerId'] === undefined) return false;
    return true;
}

export function UpdateOfferDTOFromJSON(json: any): UpdateOfferDTO {
    return UpdateOfferDTOFromJSONTyped(json, false);
}

export function UpdateOfferDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateOfferDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'offerId': json['offerId'],
        'name': json['name'] == null ? undefined : json['name'],
        'marketCategoryId': json['marketCategoryId'] == null ? undefined : json['marketCategoryId'],
        'category': json['category'] == null ? undefined : json['category'],
        'pictures': json['pictures'] == null ? undefined : json['pictures'],
        'videos': json['videos'] == null ? undefined : json['videos'],
        'manuals': json['manuals'] == null ? undefined : ((json['manuals'] as Array<any>).map(OfferManualDTOFromJSON)),
        'vendor': json['vendor'] == null ? undefined : json['vendor'],
        'barcodes': json['barcodes'] == null ? undefined : json['barcodes'],
        'description': json['description'] == null ? undefined : json['description'],
        'manufacturerCountries': json['manufacturerCountries'] == null ? undefined : json['manufacturerCountries'],
        'weightDimensions': json['weightDimensions'] == null ? undefined : OfferWeightDimensionsDTOFromJSON(json['weightDimensions']),
        'vendorCode': json['vendorCode'] == null ? undefined : json['vendorCode'],
        'tags': json['tags'] == null ? undefined : json['tags'],
        'shelfLife': json['shelfLife'] == null ? undefined : TimePeriodDTOFromJSON(json['shelfLife']),
        'lifeTime': json['lifeTime'] == null ? undefined : TimePeriodDTOFromJSON(json['lifeTime']),
        'guaranteePeriod': json['guaranteePeriod'] == null ? undefined : TimePeriodDTOFromJSON(json['guaranteePeriod']),
        'customsCommodityCode': json['customsCommodityCode'] == null ? undefined : json['customsCommodityCode'],
        'certificates': json['certificates'] == null ? undefined : json['certificates'],
        'boxCount': json['boxCount'] == null ? undefined : json['boxCount'],
        'condition': json['condition'] == null ? undefined : OfferConditionDTOFromJSON(json['condition']),
        'type': json['type'] == null ? undefined : OfferTypeFromJSON(json['type']),
        'downloadable': json['downloadable'] == null ? undefined : json['downloadable'],
        'adult': json['adult'] == null ? undefined : json['adult'],
        'age': json['age'] == null ? undefined : AgeDTOFromJSON(json['age']),
        'params': json['params'] == null ? undefined : ((json['params'] as Array<any>).map(OfferParamDTOFromJSON)),
        'parameterValues': json['parameterValues'] == null ? undefined : ((json['parameterValues'] as Array<any>).map(ParameterValueDTOFromJSON)),
        'basicPrice': json['basicPrice'] == null ? undefined : UpdatePriceWithDiscountDTOFromJSON(json['basicPrice']),
        'purchasePrice': json['purchasePrice'] == null ? undefined : BasePriceDTOFromJSON(json['purchasePrice']),
        'additionalExpenses': json['additionalExpenses'] == null ? undefined : BasePriceDTOFromJSON(json['additionalExpenses']),
        'cofinancePrice': json['cofinancePrice'] == null ? undefined : BasePriceDTOFromJSON(json['cofinancePrice']),
    };
}

export function UpdateOfferDTOToJSON(value?: UpdateOfferDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offerId': value['offerId'],
        'name': value['name'],
        'marketCategoryId': value['marketCategoryId'],
        'category': value['category'],
        'pictures': value['pictures'],
        'videos': value['videos'],
        'manuals': value['manuals'] == null ? undefined : ((value['manuals'] as Array<any>).map(OfferManualDTOToJSON)),
        'vendor': value['vendor'],
        'barcodes': value['barcodes'],
        'description': value['description'],
        'manufacturerCountries': value['manufacturerCountries'],
        'weightDimensions': OfferWeightDimensionsDTOToJSON(value['weightDimensions']),
        'vendorCode': value['vendorCode'],
        'tags': value['tags'],
        'shelfLife': TimePeriodDTOToJSON(value['shelfLife']),
        'lifeTime': TimePeriodDTOToJSON(value['lifeTime']),
        'guaranteePeriod': TimePeriodDTOToJSON(value['guaranteePeriod']),
        'customsCommodityCode': value['customsCommodityCode'],
        'certificates': value['certificates'],
        'boxCount': value['boxCount'],
        'condition': OfferConditionDTOToJSON(value['condition']),
        'type': OfferTypeToJSON(value['type']),
        'downloadable': value['downloadable'],
        'adult': value['adult'],
        'age': AgeDTOToJSON(value['age']),
        'params': value['params'] == null ? undefined : ((value['params'] as Array<any>).map(OfferParamDTOToJSON)),
        'parameterValues': value['parameterValues'] == null ? undefined : ((value['parameterValues'] as Array<any>).map(ParameterValueDTOToJSON)),
        'basicPrice': UpdatePriceWithDiscountDTOToJSON(value['basicPrice']),
        'purchasePrice': BasePriceDTOToJSON(value['purchasePrice']),
        'additionalExpenses': BasePriceDTOToJSON(value['additionalExpenses']),
        'cofinancePrice': BasePriceDTOToJSON(value['cofinancePrice']),
    };
}
