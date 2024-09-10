//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for MappingsOfferDTO
void main() {
  // final instance = MappingsOfferDTO();

  group('test MappingsOfferDTO', () {
    // Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String shopSku
    test('to test the property `shopSku`', () async {
      // TODO
    });

    // Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
    // String category
    test('to test the property `category`', () async {
      // TODO
    });

    // Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    // String vendor
    test('to test the property `vendor`', () async {
      // TODO
    });

    // Артикул товара от производителя.
    // String vendorCode
    test('to test the property `vendorCode`', () async {
      // TODO
    });

    // Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Идентификатор фида.
    // int feedId
    test('to test the property `feedId`', () async {
      // TODO
    });

    // Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    // List<String> barcodes (default value: const [])
    test('to test the property `barcodes`', () async {
      // TODO
    });

    // URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
    // List<String> urls (default value: const [])
    test('to test the property `urls`', () async {
      // TODO
    });

    // Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
    // List<String> pictures (default value: const [])
    test('to test the property `pictures`', () async {
      // TODO
    });

    // Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
    // String manufacturer
    test('to test the property `manufacturer`', () async {
      // TODO
    });

    // Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
    // List<String> manufacturerCountries (default value: const [])
    test('to test the property `manufacturerCountries`', () async {
      // TODO
    });

    // Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
    // int minShipment
    test('to test the property `minShipment`', () async {
      // TODO
    });

    // Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
    // int transportUnitSize
    test('to test the property `transportUnitSize`', () async {
      // TODO
    });

    // Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
    // int quantumOfSupply
    test('to test the property `quantumOfSupply`', () async {
      // TODO
    });

    // Срок, за который продавец поставляет товары на склад, в днях.
    // int deliveryDurationDays
    test('to test the property `deliveryDurationDays`', () async {
      // TODO
    });

    // Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
    // int boxCount
    test('to test the property `boxCount`', () async {
      // TODO
    });

    // Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
    // List<String> customsCommodityCodes (default value: const [])
    test('to test the property `customsCommodityCodes`', () async {
      // TODO
    });

    // OfferWeightDimensionsDTO weightDimensions
    test('to test the property `weightDimensions`', () async {
      // TODO
    });

    // Дни недели, в которые продавец поставляет товары на склад.
    // List<DayOfWeekType> supplyScheduleDays (default value: const [])
    test('to test the property `supplyScheduleDays`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
    // int shelfLifeDays
    test('to test the property `shelfLifeDays`', () async {
      // TODO
    });

    // {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
    // int lifeTimeDays
    test('to test the property `lifeTimeDays`', () async {
      // TODO
    });

    // Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
    // int guaranteePeriodDays
    test('to test the property `guaranteePeriodDays`', () async {
      // TODO
    });

    // OfferProcessingStateDTO processingState
    test('to test the property `processingState`', () async {
      // TODO
    });

    // OfferAvailabilityStatusType availability
    test('to test the property `availability`', () async {
      // TODO
    });

    // TimePeriodDTO shelfLife
    test('to test the property `shelfLife`', () async {
      // TODO
    });

    // TimePeriodDTO lifeTime
    test('to test the property `lifeTime`', () async {
      // TODO
    });

    // TimePeriodDTO guaranteePeriod
    test('to test the property `guaranteePeriod`', () async {
      // TODO
    });

    // Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
    // String certificate
    test('to test the property `certificate`', () async {
      // TODO
    });

    // Цена на товар в рублях.
    // num price
    test('to test the property `price`', () async {
      // TODO
    });


  });

}
