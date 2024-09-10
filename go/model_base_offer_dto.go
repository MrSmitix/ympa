// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// BaseOfferDto - Основные параметры товара.
type BaseOfferDto struct {

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
	Name string `json:"name,omitempty"`

	// Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
	MarketCategoryId int64 `json:"marketCategoryId,omitempty"`

	// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
	Category string `json:"category,omitempty"`

	// Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
	Pictures *[]string `json:"pictures,omitempty"`

	// Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
	Videos *[]string `json:"videos,omitempty"`

	// Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
	Manuals *[]OfferManualDto `json:"manuals,omitempty"`

	// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
	Vendor string `json:"vendor,omitempty"`

	// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
	Barcodes *[]string `json:"barcodes,omitempty"`

	// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
	Description string `json:"description,omitempty"`

	// Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
	ManufacturerCountries *[]string `json:"manufacturerCountries,omitempty"`

	WeightDimensions OfferWeightDimensionsDto `json:"weightDimensions,omitempty"`

	// Артикул товара от производителя.
	VendorCode string `json:"vendorCode,omitempty"`

	// Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
	Tags *[]string `json:"tags,omitempty"`

	ShelfLife TimePeriodDto `json:"shelfLife,omitempty"`

	LifeTime TimePeriodDto `json:"lifeTime,omitempty"`

	GuaranteePeriod TimePeriodDto `json:"guaranteePeriod,omitempty"`

	// Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
	CustomsCommodityCode string `json:"customsCommodityCode,omitempty"`

	// Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
	Certificates *[]string `json:"certificates,omitempty"`

	// Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
	BoxCount int32 `json:"boxCount,omitempty"`

	Condition OfferConditionDto `json:"condition,omitempty"`

	Type OfferType `json:"type,omitempty"`

	// Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
	Downloadable bool `json:"downloadable,omitempty"`

	// Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
	Adult bool `json:"adult,omitempty"`

	Age AgeDto `json:"age,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
	// Deprecated
	Params *[]OfferParamDto `json:"params,omitempty"`
}

// AssertBaseOfferDtoRequired checks if the required fields are not zero-ed
func AssertBaseOfferDtoRequired(obj BaseOfferDto) error {
	elements := map[string]interface{}{
		"offerId": obj.OfferId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if obj.Manuals != nil {
		for _, el := range *obj.Manuals {
			if err := AssertOfferManualDtoRequired(el); err != nil {
				return err
			}
		}
	}
	if err := AssertOfferWeightDimensionsDtoRequired(obj.WeightDimensions); err != nil {
		return err
	}
	if err := AssertTimePeriodDtoRequired(obj.ShelfLife); err != nil {
		return err
	}
	if err := AssertTimePeriodDtoRequired(obj.LifeTime); err != nil {
		return err
	}
	if err := AssertTimePeriodDtoRequired(obj.GuaranteePeriod); err != nil {
		return err
	}
	if err := AssertOfferConditionDtoRequired(obj.Condition); err != nil {
		return err
	}
	if err := AssertAgeDtoRequired(obj.Age); err != nil {
		return err
	}
	if obj.Params != nil {
		for _, el := range *obj.Params {
			if err := AssertOfferParamDtoRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertBaseOfferDtoConstraints checks if the values respects the defined constraints
func AssertBaseOfferDtoConstraints(obj BaseOfferDto) error {
    if obj.Manuals != nil {
     	for _, el := range *obj.Manuals {
     		if err := AssertOfferManualDtoConstraints(el); err != nil {
     			return err
     		}
     	}
    }
	if err := AssertOfferWeightDimensionsDtoConstraints(obj.WeightDimensions); err != nil {
		return err
	}
	if err := AssertTimePeriodDtoConstraints(obj.ShelfLife); err != nil {
		return err
	}
	if err := AssertTimePeriodDtoConstraints(obj.LifeTime); err != nil {
		return err
	}
	if err := AssertTimePeriodDtoConstraints(obj.GuaranteePeriod); err != nil {
		return err
	}
	if err := AssertOfferConditionDtoConstraints(obj.Condition); err != nil {
		return err
	}
	if err := AssertAgeDtoConstraints(obj.Age); err != nil {
		return err
	}
    if obj.Params != nil {
     	for _, el := range *obj.Params {
     		if err := AssertOfferParamDtoConstraints(el); err != nil {
     			return err
     		}
     	}
    }
	return nil
}
