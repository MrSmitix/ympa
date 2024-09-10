#tag Class
Protected Class UpdateOfferDTO

	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		offerId As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
		#tag EndNote
		marketCategoryId As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
		#tag EndNote
		category As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
		#tag EndNote
		pictures() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
		#tag EndNote
		videos() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
		#tag EndNote
		manuals() As OpenAPIClient.Models.OfferManualDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
		#tag EndNote
		vendor As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
		#tag EndNote
		barcodes() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * <h>, <h1>, <h2> и так далее — для заголовков; * <br> и <p> — для переноса строки; * <ol> — для нумерованного списка; * <ul> — для маркированного списка; * <li> — для создания элементов списка (должен находиться внутри <ol> или <ul>); * <div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
		#tag EndNote
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
		#tag EndNote
		manufacturerCountries() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		weightDimensions As OpenAPIClient.Models.OfferWeightDimensionsDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Артикул товара от производителя.
		#tag EndNote
		vendorCode As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
		#tag EndNote
		tags() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		shelfLife As OpenAPIClient.Models.TimePeriodDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		lifeTime As OpenAPIClient.Models.TimePeriodDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		guaranteePeriod As OpenAPIClient.Models.TimePeriodDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
		#tag EndNote
		customsCommodityCode As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
		#tag EndNote
		certificates() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
		#tag EndNote
		boxCount As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		condition As OpenAPIClient.Models.OfferConditionDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
		#tag EndNote
		downloadable As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
		#tag EndNote
		adult As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		age As OpenAPIClient.Models.AgeDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
		#tag EndNote
		Attributes( Deprecated ) params() As OpenAPIClient.Models.OfferParamDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
		#tag EndNote
		parameterValues() As OpenAPIClient.Models.ParameterValueDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		basicPrice As OpenAPIClient.Models.UpdatePriceWithDiscountDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		purchasePrice As OpenAPIClient.Models.BasePriceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		additionalExpenses As OpenAPIClient.Models.BasePriceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		cofinancePrice As OpenAPIClient.Models.BasePriceDTO
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="offerId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="marketCategoryId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="category"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pictures"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="videos"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="manuals"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferManualDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="vendor"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="barcodes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="manufacturerCountries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weightDimensions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferWeightDimensionsDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="vendorCode"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tags"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shelfLife"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TimePeriodDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lifeTime"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TimePeriodDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="guaranteePeriod"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TimePeriodDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="customsCommodityCode"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="certificates"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="boxCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="condition"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferConditionDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="downloadable"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="adult"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="age"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AgeDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="params"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferParamDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parameterValues"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ParameterValueDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="basicPrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdatePriceWithDiscountDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="purchasePrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BasePriceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="additionalExpenses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BasePriceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cofinancePrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BasePriceDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


