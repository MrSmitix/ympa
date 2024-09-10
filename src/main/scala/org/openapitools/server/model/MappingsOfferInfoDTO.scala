package org.openapitools.server.model


/**
 * Базовая информация о товарах в каталоге.
 *
 * @param name Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  for example: ''Ударная дрель Makita HP1630, 710 Вт''
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param category Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  for example: ''null''
 * @param vendor Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. for example: ''LEVENHUK''
 * @param vendorCode Артикул товара от производителя. for example: ''VNDR-0005A''
 * @param description Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  for example: ''null''
 * @param id Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param feedId Идентификатор фида. for example: ''null''
 * @param barcodes Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)   for example: ''null''
 * @param urls URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url.  for example: ''null''
 * @param pictures Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`.  for example: ''null''
 * @param manufacturer Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.  for example: ''null''
 * @param manufacturerCountries Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран.  for example: ''null''
 * @param minShipment Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.  for example: ''null''
 * @param transportUnitSize Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.  for example: ''null''
 * @param quantumOfSupply Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.  for example: ''null''
 * @param deliveryDurationDays Срок, за который продавец поставляет товары на склад, в днях. for example: ''null''
 * @param boxCount Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.  for example: ''null''
 * @param customsCommodityCodes Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД.  for example: ''null''
 * @param weightDimensions  for example: ''null''
 * @param supplyScheduleDays Дни недели, в которые продавец поставляет товары на склад. for example: ''null''
 * @param shelfLifeDays {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования.  for example: ''null''
 * @param lifeTimeDays {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.  for example: ''null''
 * @param guaranteePeriodDays Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.  for example: ''null''
 * @param processingState  for example: ''null''
 * @param availability  for example: ''null''
 * @param shelfLife  for example: ''null''
 * @param lifeTime  for example: ''null''
 * @param guaranteePeriod  for example: ''null''
 * @param certificate Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)  for example: ''null''
*/
final case class MappingsOfferInfoDTO (
  name: Option[String] = None,
  shopSku: Option[String] = None,
  category: Option[String] = None,
  vendor: Option[String] = None,
  vendorCode: Option[String] = None,
  description: Option[String] = None,
  id: Option[String] = None,
  feedId: Option[Long] = None,
  barcodes: Option[Seq[String]] = None,
  urls: Option[Seq[String]] = None,
  pictures: Option[Seq[String]] = None,
  manufacturer: Option[String] = None,
  manufacturerCountries: Option[Seq[String]] = None,
  minShipment: Option[Int] = None,
  transportUnitSize: Option[Int] = None,
  quantumOfSupply: Option[Int] = None,
  deliveryDurationDays: Option[Int] = None,
  boxCount: Option[Int] = None,
  customsCommodityCodes: Option[Seq[String]] = None,
  weightDimensions: Option[OfferWeightDimensionsDTO] = None,
  supplyScheduleDays: Option[Seq[DayOfWeekType]] = None,
  shelfLifeDays: Option[Int] = None,
  lifeTimeDays: Option[Int] = None,
  guaranteePeriodDays: Option[Int] = None,
  processingState: Option[OfferProcessingStateDTO] = None,
  availability: Option[OfferAvailabilityStatusType] = None,
  shelfLife: Option[TimePeriodDTO] = None,
  lifeTime: Option[TimePeriodDTO] = None,
  guaranteePeriod: Option[TimePeriodDTO] = None,
  certificate: Option[String] = None
)

