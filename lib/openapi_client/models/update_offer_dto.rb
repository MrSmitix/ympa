=begin
#Партнерский API Маркета

#API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech
Generator version: 7.8.0

=end

require 'date'
require 'time'

module OpenapiClient
  # Параметры товара.
  class UpdateOfferDTO
    # Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    attr_accessor :offer_id

    # Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    attr_accessor :name

    # Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    attr_accessor :market_category_id

    # Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
    attr_accessor :category

    # Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
    attr_accessor :pictures

    # Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
    attr_accessor :videos

    # Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
    attr_accessor :manuals

    # Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    attr_accessor :vendor

    # Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    attr_accessor :barcodes

    # Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    attr_accessor :description

    # Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
    attr_accessor :manufacturer_countries

    attr_accessor :weight_dimensions

    # Артикул товара от производителя.
    attr_accessor :vendor_code

    # Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
    attr_accessor :tags

    attr_accessor :shelf_life

    attr_accessor :life_time

    attr_accessor :guarantee_period

    # Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
    attr_accessor :customs_commodity_code

    # Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
    attr_accessor :certificates

    # Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
    attr_accessor :box_count

    attr_accessor :condition

    attr_accessor :type

    # Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
    attr_accessor :downloadable

    # Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
    attr_accessor :adult

    attr_accessor :age

    # {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
    attr_accessor :params

    # Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
    attr_accessor :parameter_values

    attr_accessor :basic_price

    attr_accessor :purchase_price

    attr_accessor :additional_expenses

    attr_accessor :cofinance_price

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'offer_id' => :'offerId',
        :'name' => :'name',
        :'market_category_id' => :'marketCategoryId',
        :'category' => :'category',
        :'pictures' => :'pictures',
        :'videos' => :'videos',
        :'manuals' => :'manuals',
        :'vendor' => :'vendor',
        :'barcodes' => :'barcodes',
        :'description' => :'description',
        :'manufacturer_countries' => :'manufacturerCountries',
        :'weight_dimensions' => :'weightDimensions',
        :'vendor_code' => :'vendorCode',
        :'tags' => :'tags',
        :'shelf_life' => :'shelfLife',
        :'life_time' => :'lifeTime',
        :'guarantee_period' => :'guaranteePeriod',
        :'customs_commodity_code' => :'customsCommodityCode',
        :'certificates' => :'certificates',
        :'box_count' => :'boxCount',
        :'condition' => :'condition',
        :'type' => :'type',
        :'downloadable' => :'downloadable',
        :'adult' => :'adult',
        :'age' => :'age',
        :'params' => :'params',
        :'parameter_values' => :'parameterValues',
        :'basic_price' => :'basicPrice',
        :'purchase_price' => :'purchasePrice',
        :'additional_expenses' => :'additionalExpenses',
        :'cofinance_price' => :'cofinancePrice'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'offer_id' => :'String',
        :'name' => :'String',
        :'market_category_id' => :'Integer',
        :'category' => :'String',
        :'pictures' => :'Array<String>',
        :'videos' => :'Array<String>',
        :'manuals' => :'Array<OfferManualDTO>',
        :'vendor' => :'String',
        :'barcodes' => :'Array<String>',
        :'description' => :'String',
        :'manufacturer_countries' => :'Array<String>',
        :'weight_dimensions' => :'OfferWeightDimensionsDTO',
        :'vendor_code' => :'String',
        :'tags' => :'Array<String>',
        :'shelf_life' => :'TimePeriodDTO',
        :'life_time' => :'TimePeriodDTO',
        :'guarantee_period' => :'TimePeriodDTO',
        :'customs_commodity_code' => :'String',
        :'certificates' => :'Array<String>',
        :'box_count' => :'Integer',
        :'condition' => :'OfferConditionDTO',
        :'type' => :'OfferType',
        :'downloadable' => :'Boolean',
        :'adult' => :'Boolean',
        :'age' => :'AgeDTO',
        :'params' => :'Array<OfferParamDTO>',
        :'parameter_values' => :'Array<ParameterValueDTO>',
        :'basic_price' => :'UpdatePriceWithDiscountDTO',
        :'purchase_price' => :'BasePriceDTO',
        :'additional_expenses' => :'BasePriceDTO',
        :'cofinance_price' => :'BasePriceDTO'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'pictures',
        :'videos',
        :'manuals',
        :'barcodes',
        :'manufacturer_countries',
        :'tags',
        :'certificates',
        :'params',
        :'parameter_values',
      ])
    end

    # List of class defined in allOf (OpenAPI v3)
    def self.openapi_all_of
      [
      :'BaseOfferDTO'
      ]
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::UpdateOfferDTO` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::UpdateOfferDTO`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'offer_id')
        self.offer_id = attributes[:'offer_id']
      else
        self.offer_id = nil
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'market_category_id')
        self.market_category_id = attributes[:'market_category_id']
      end

      if attributes.key?(:'category')
        self.category = attributes[:'category']
      end

      if attributes.key?(:'pictures')
        if (value = attributes[:'pictures']).is_a?(Array)
          self.pictures = value
        end
      end

      if attributes.key?(:'videos')
        if (value = attributes[:'videos']).is_a?(Array)
          self.videos = value
        end
      end

      if attributes.key?(:'manuals')
        if (value = attributes[:'manuals']).is_a?(Array)
          self.manuals = value
        end
      end

      if attributes.key?(:'vendor')
        self.vendor = attributes[:'vendor']
      end

      if attributes.key?(:'barcodes')
        if (value = attributes[:'barcodes']).is_a?(Array)
          self.barcodes = value
        end
      end

      if attributes.key?(:'description')
        self.description = attributes[:'description']
      end

      if attributes.key?(:'manufacturer_countries')
        if (value = attributes[:'manufacturer_countries']).is_a?(Array)
          self.manufacturer_countries = value
        end
      end

      if attributes.key?(:'weight_dimensions')
        self.weight_dimensions = attributes[:'weight_dimensions']
      end

      if attributes.key?(:'vendor_code')
        self.vendor_code = attributes[:'vendor_code']
      end

      if attributes.key?(:'tags')
        if (value = attributes[:'tags']).is_a?(Array)
          self.tags = value
        end
      end

      if attributes.key?(:'shelf_life')
        self.shelf_life = attributes[:'shelf_life']
      end

      if attributes.key?(:'life_time')
        self.life_time = attributes[:'life_time']
      end

      if attributes.key?(:'guarantee_period')
        self.guarantee_period = attributes[:'guarantee_period']
      end

      if attributes.key?(:'customs_commodity_code')
        self.customs_commodity_code = attributes[:'customs_commodity_code']
      end

      if attributes.key?(:'certificates')
        if (value = attributes[:'certificates']).is_a?(Array)
          self.certificates = value
        end
      end

      if attributes.key?(:'box_count')
        self.box_count = attributes[:'box_count']
      end

      if attributes.key?(:'condition')
        self.condition = attributes[:'condition']
      end

      if attributes.key?(:'type')
        self.type = attributes[:'type']
      end

      if attributes.key?(:'downloadable')
        self.downloadable = attributes[:'downloadable']
      end

      if attributes.key?(:'adult')
        self.adult = attributes[:'adult']
      end

      if attributes.key?(:'age')
        self.age = attributes[:'age']
      end

      if attributes.key?(:'params')
        if (value = attributes[:'params']).is_a?(Array)
          self.params = value
        end
      end

      if attributes.key?(:'parameter_values')
        if (value = attributes[:'parameter_values']).is_a?(Array)
          self.parameter_values = value
        end
      end

      if attributes.key?(:'basic_price')
        self.basic_price = attributes[:'basic_price']
      end

      if attributes.key?(:'purchase_price')
        self.purchase_price = attributes[:'purchase_price']
      end

      if attributes.key?(:'additional_expenses')
        self.additional_expenses = attributes[:'additional_expenses']
      end

      if attributes.key?(:'cofinance_price')
        self.cofinance_price = attributes[:'cofinance_price']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @offer_id.nil?
        invalid_properties.push('invalid value for "offer_id", offer_id cannot be nil.')
      end

      if @offer_id.to_s.length > 255
        invalid_properties.push('invalid value for "offer_id", the character length must be smaller than or equal to 255.')
      end

      if @offer_id.to_s.length < 1
        invalid_properties.push('invalid value for "offer_id", the character length must be great than or equal to 1.')
      end

      pattern = Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      if @offer_id !~ pattern
        invalid_properties.push("invalid value for \"offer_id\", must conform to the pattern #{pattern}.")
      end

      if !@name.nil? && @name.to_s.length > 256
        invalid_properties.push('invalid value for "name", the character length must be smaller than or equal to 256.')
      end

      if !@videos.nil? && @videos.length > 6
        invalid_properties.push('invalid value for "videos", number of items must be less than or equal to 6.')
      end

      if !@manuals.nil? && @manuals.length > 6
        invalid_properties.push('invalid value for "manuals", number of items must be less than or equal to 6.')
      end

      if !@description.nil? && @description.to_s.length > 6000
        invalid_properties.push('invalid value for "description", the character length must be smaller than or equal to 6000.')
      end

      if !@parameter_values.nil? && @parameter_values.length > 300
        invalid_properties.push('invalid value for "parameter_values", number of items must be less than or equal to 300.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @offer_id.nil?
      return false if @offer_id.to_s.length > 255
      return false if @offer_id.to_s.length < 1
      return false if @offer_id !~ Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      return false if !@name.nil? && @name.to_s.length > 256
      return false if !@videos.nil? && @videos.length > 6
      return false if !@manuals.nil? && @manuals.length > 6
      return false if !@description.nil? && @description.to_s.length > 6000
      return false if !@parameter_values.nil? && @parameter_values.length > 300
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] offer_id Value to be assigned
    def offer_id=(offer_id)
      if offer_id.nil?
        fail ArgumentError, 'offer_id cannot be nil'
      end

      if offer_id.to_s.length > 255
        fail ArgumentError, 'invalid value for "offer_id", the character length must be smaller than or equal to 255.'
      end

      if offer_id.to_s.length < 1
        fail ArgumentError, 'invalid value for "offer_id", the character length must be great than or equal to 1.'
      end

      pattern = Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      if offer_id !~ pattern
        fail ArgumentError, "invalid value for \"offer_id\", must conform to the pattern #{pattern}."
      end

      @offer_id = offer_id
    end

    # Custom attribute writer method with validation
    # @param [Object] name Value to be assigned
    def name=(name)
      if name.nil?
        fail ArgumentError, 'name cannot be nil'
      end

      if name.to_s.length > 256
        fail ArgumentError, 'invalid value for "name", the character length must be smaller than or equal to 256.'
      end

      @name = name
    end

    # Custom attribute writer method with validation
    # @param [Object] videos Value to be assigned
    def videos=(videos)
      if !videos.nil? && videos.length > 6
        fail ArgumentError, 'invalid value for "videos", number of items must be less than or equal to 6.'
      end

      @videos = videos
    end

    # Custom attribute writer method with validation
    # @param [Object] manuals Value to be assigned
    def manuals=(manuals)
      if !manuals.nil? && manuals.length > 6
        fail ArgumentError, 'invalid value for "manuals", number of items must be less than or equal to 6.'
      end

      @manuals = manuals
    end

    # Custom attribute writer method with validation
    # @param [Object] description Value to be assigned
    def description=(description)
      if description.nil?
        fail ArgumentError, 'description cannot be nil'
      end

      if description.to_s.length > 6000
        fail ArgumentError, 'invalid value for "description", the character length must be smaller than or equal to 6000.'
      end

      @description = description
    end

    # Custom attribute writer method with validation
    # @param [Object] parameter_values Value to be assigned
    def parameter_values=(parameter_values)
      if !parameter_values.nil? && parameter_values.length > 300
        fail ArgumentError, 'invalid value for "parameter_values", number of items must be less than or equal to 300.'
      end

      @parameter_values = parameter_values
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          offer_id == o.offer_id &&
          name == o.name &&
          market_category_id == o.market_category_id &&
          category == o.category &&
          pictures == o.pictures &&
          videos == o.videos &&
          manuals == o.manuals &&
          vendor == o.vendor &&
          barcodes == o.barcodes &&
          description == o.description &&
          manufacturer_countries == o.manufacturer_countries &&
          weight_dimensions == o.weight_dimensions &&
          vendor_code == o.vendor_code &&
          tags == o.tags &&
          shelf_life == o.shelf_life &&
          life_time == o.life_time &&
          guarantee_period == o.guarantee_period &&
          customs_commodity_code == o.customs_commodity_code &&
          certificates == o.certificates &&
          box_count == o.box_count &&
          condition == o.condition &&
          type == o.type &&
          downloadable == o.downloadable &&
          adult == o.adult &&
          age == o.age &&
          params == o.params &&
          parameter_values == o.parameter_values &&
          basic_price == o.basic_price &&
          purchase_price == o.purchase_price &&
          additional_expenses == o.additional_expenses &&
          cofinance_price == o.cofinance_price
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [offer_id, name, market_category_id, category, pictures, videos, manuals, vendor, barcodes, description, manufacturer_countries, weight_dimensions, vendor_code, tags, shelf_life, life_time, guarantee_period, customs_commodity_code, certificates, box_count, condition, type, downloadable, adult, age, params, parameter_values, basic_price, purchase_price, additional_expenses, cofinance_price].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      transformed_hash = {}
      openapi_types.each_pair do |key, type|
        if attributes.key?(attribute_map[key]) && attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = nil
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[attribute_map[key]].is_a?(Array)
            transformed_hash["#{key}"] = attributes[attribute_map[key]].map { |v| _deserialize($1, v) }
          end
        elsif !attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = _deserialize(type, attributes[attribute_map[key]])
        end
      end
      new(transformed_hash)
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def self._deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenapiClient.const_get(type)
        klass.respond_to?(:openapi_any_of) || klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
