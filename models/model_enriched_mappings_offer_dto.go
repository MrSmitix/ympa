package models

// EnrichedMappingsOfferDto - Информация о рекомендованных карточках товаров.
type EnrichedMappingsOfferDto struct {

	// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
	Name string `json:"name,omitempty"`

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	ShopSku string `json:"shopSku,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
	Category string `json:"category,omitempty"`

	// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
	Vendor string `json:"vendor,omitempty"`

	// Артикул товара от производителя.
	VendorCode string `json:"vendorCode,omitempty"`

	// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
	Description string `json:"description,omitempty"`

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	Id string `json:"id,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Идентификатор фида.
	FeedId int64 `json:"feedId,omitempty"`

	// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
	Barcodes *[]string `json:"barcodes,omitempty"`

	// URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
	Urls *[]string `json:"urls,omitempty"`

	// Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
	Pictures *[]string `json:"pictures,omitempty"`

	// Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
	Manufacturer string `json:"manufacturer,omitempty"`

	// Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
	ManufacturerCountries *[]string `json:"manufacturerCountries,omitempty"`

	// Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
	MinShipment int32 `json:"minShipment,omitempty"`

	// Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
	TransportUnitSize int32 `json:"transportUnitSize,omitempty"`

	// Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
	QuantumOfSupply int32 `json:"quantumOfSupply,omitempty"`

	// Срок, за который продавец поставляет товары на склад, в днях.
	DeliveryDurationDays int32 `json:"deliveryDurationDays,omitempty"`

	// Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
	BoxCount int32 `json:"boxCount,omitempty"`

	// Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
	CustomsCommodityCodes *[]string `json:"customsCommodityCodes,omitempty"`

	WeightDimensions OfferWeightDimensionsDto `json:"weightDimensions,omitempty"`

	// Дни недели, в которые продавец поставляет товары на склад.
	SupplyScheduleDays *[]DayOfWeekType `json:"supplyScheduleDays,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
	ShelfLifeDays int32 `json:"shelfLifeDays,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
	LifeTimeDays int32 `json:"lifeTimeDays,omitempty"`

	// Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
	GuaranteePeriodDays int32 `json:"guaranteePeriodDays,omitempty"`

	ProcessingState OfferProcessingStateDto `json:"processingState,omitempty"`

	Availability OfferAvailabilityStatusType `json:"availability,omitempty"`

	ShelfLife TimePeriodDto `json:"shelfLife,omitempty"`

	LifeTime TimePeriodDto `json:"lifeTime,omitempty"`

	GuaranteePeriod TimePeriodDto `json:"guaranteePeriod,omitempty"`

	// Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
	Certificate string `json:"certificate,omitempty"`

	// Цена на товар в рублях.
	Price float32 `json:"price,omitempty"`

	// Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
	MarketCategoryId int64 `json:"marketCategoryId,omitempty"`

	// Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
	MarketCategoryName string `json:"marketCategoryName,omitempty"`

	// Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
	MarketModelId int64 `json:"marketModelId,omitempty"`

	// Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
	MarketModelName string `json:"marketModelName,omitempty"`

	// SKU на Маркете.
	MarketSku int64 `json:"marketSku,omitempty"`

	// Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. 
	MarketSkuName string `json:"marketSkuName,omitempty"`
}
