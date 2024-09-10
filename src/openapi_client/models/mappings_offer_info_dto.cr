# #Партнерский API Маркета
#
##API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
#
#The version of the OpenAPI document: LATEST
#
#Generated by: https://openapi-generator.tech
#Generator version: 7.8.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  # Базовая информация о товарах в каталоге.
  class MappingsOfferInfoDTO
    include JSON::Serializable

    # Optional properties
    # Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    @[JSON::Field(key: "name", type: String?, nillable: true, emit_null: false)]
    property name : String?

    # Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    @[JSON::Field(key: "shopSku", type: String?, nillable: true, emit_null: false)]
    property shop_sku : String?

    # Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
    @[JSON::Field(key: "category", type: String?, nillable: true, emit_null: false)]
    property category : String?

    # Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    @[JSON::Field(key: "vendor", type: String?, nillable: true, emit_null: false)]
    property vendor : String?

    # Артикул товара от производителя.
    @[JSON::Field(key: "vendorCode", type: String?, nillable: true, emit_null: false)]
    property vendor_code : String?

    # Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    @[JSON::Field(key: "description", type: String?, nillable: true, emit_null: false)]
    property description : String?

    # Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    @[JSON::Field(key: "id", type: String?, nillable: true, emit_null: false)]
    property id : String?

    # Идентификатор фида.
    @[JSON::Field(key: "feedId", type: Int64?, nillable: true, emit_null: false)]
    property feed_id : Int64?

    # Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    @[JSON::Field(key: "barcodes", type: Array(String)?, nillable: true, emit_null: false)]
    property barcodes : Array(String)?

    # URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
    @[JSON::Field(key: "urls", type: Array(String)?, nillable: true, emit_null: false)]
    property urls : Array(String)?

    # Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
    @[JSON::Field(key: "pictures", type: Array(String)?, nillable: true, emit_null: false)]
    property pictures : Array(String)?

    # Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
    @[JSON::Field(key: "manufacturer", type: String?, nillable: true, emit_null: false)]
    property manufacturer : String?

    # Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
    @[JSON::Field(key: "manufacturerCountries", type: Array(String)?, nillable: true, emit_null: false)]
    property manufacturer_countries : Array(String)?

    # Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
    @[JSON::Field(key: "minShipment", type: Int32?, nillable: true, emit_null: false)]
    property min_shipment : Int32?

    # Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
    @[JSON::Field(key: "transportUnitSize", type: Int32?, nillable: true, emit_null: false)]
    property transport_unit_size : Int32?

    # Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
    @[JSON::Field(key: "quantumOfSupply", type: Int32?, nillable: true, emit_null: false)]
    property quantum_of_supply : Int32?

    # Срок, за который продавец поставляет товары на склад, в днях.
    @[JSON::Field(key: "deliveryDurationDays", type: Int32?, nillable: true, emit_null: false)]
    property delivery_duration_days : Int32?

    # Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
    @[JSON::Field(key: "boxCount", type: Int32?, nillable: true, emit_null: false)]
    property box_count : Int32?

    # Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
    @[JSON::Field(key: "customsCommodityCodes", type: Array(String)?, nillable: true, emit_null: false)]
    property customs_commodity_codes : Array(String)?

    @[JSON::Field(key: "weightDimensions", type: OfferWeightDimensionsDTO?, nillable: true, emit_null: false)]
    property weight_dimensions : OfferWeightDimensionsDTO?

    # Дни недели, в которые продавец поставляет товары на склад.
    @[JSON::Field(key: "supplyScheduleDays", type: Array(DayOfWeekType)?, nillable: true, emit_null: false)]
    property supply_schedule_days : Array(DayOfWeekType)?

    # {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
    @[JSON::Field(key: "shelfLifeDays", type: Int32?, nillable: true, emit_null: false)]
    property shelf_life_days : Int32?

    # {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
    @[JSON::Field(key: "lifeTimeDays", type: Int32?, nillable: true, emit_null: false)]
    property life_time_days : Int32?

    # Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
    @[JSON::Field(key: "guaranteePeriodDays", type: Int32?, nillable: true, emit_null: false)]
    property guarantee_period_days : Int32?

    @[JSON::Field(key: "processingState", type: OfferProcessingStateDTO?, nillable: true, emit_null: false)]
    property processing_state : OfferProcessingStateDTO?

    @[JSON::Field(key: "availability", type: OfferAvailabilityStatusType?, nillable: true, emit_null: false)]
    property availability : OfferAvailabilityStatusType?

    @[JSON::Field(key: "shelfLife", type: TimePeriodDTO?, nillable: true, emit_null: false)]
    property shelf_life : TimePeriodDTO?

    @[JSON::Field(key: "lifeTime", type: TimePeriodDTO?, nillable: true, emit_null: false)]
    property life_time : TimePeriodDTO?

    @[JSON::Field(key: "guaranteePeriod", type: TimePeriodDTO?, nillable: true, emit_null: false)]
    property guarantee_period : TimePeriodDTO?

    # Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
    @[JSON::Field(key: "certificate", type: String?, nillable: true, emit_null: false)]
    property certificate : String?

    class EnumAttributeValidator
      getter datatype : String
      getter allowable_values : Array(String)

      def initialize(datatype, allowable_values)
        @datatype = datatype
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
        !value || allowable_values.includes?(value)
      end
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@name : String?, @shop_sku : String?, @category : String?, @vendor : String?, @vendor_code : String?, @description : String?, @id : String?, @feed_id : Int64?, @barcodes : Array(String)?, @urls : Array(String)?, @pictures : Array(String)?, @manufacturer : String?, @manufacturer_countries : Array(String)?, @min_shipment : Int32?, @transport_unit_size : Int32?, @quantum_of_supply : Int32?, @delivery_duration_days : Int32?, @box_count : Int32?, @customs_commodity_codes : Array(String)?, @weight_dimensions : OfferWeightDimensionsDTO?, @supply_schedule_days : Array(DayOfWeekType)?, @shelf_life_days : Int32?, @life_time_days : Int32?, @guarantee_period_days : Int32?, @processing_state : OfferProcessingStateDTO?, @availability : OfferAvailabilityStatusType?, @shelf_life : TimePeriodDTO?, @life_time : TimePeriodDTO?, @guarantee_period : TimePeriodDTO?, @certificate : String?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@name.nil? && @name.to_s.size > 256
        invalid_properties.push("invalid value for \"name\", the character length must be smaller than or equal to 256.")
      end

      if !@shop_sku.nil? && @shop_sku.to_s.size > 255
        invalid_properties.push("invalid value for \"shop_sku\", the character length must be smaller than or equal to 255.")
      end

      if !@shop_sku.nil? && @shop_sku.to_s.size < 1
        invalid_properties.push("invalid value for \"shop_sku\", the character length must be great than or equal to 1.")
      end

      pattern = Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      if !@shop_sku.nil? && @shop_sku !~ pattern
        invalid_properties.push("invalid value for \"shop_sku\", must conform to the pattern #{pattern}.")
      end

      if !@description.nil? && @description.to_s.size > 6000
        invalid_properties.push("invalid value for \"description\", the character length must be smaller than or equal to 6000.")
      end

      if !@id.nil? && @id.to_s.size > 255
        invalid_properties.push("invalid value for \"id\", the character length must be smaller than or equal to 255.")
      end

      if !@id.nil? && @id.to_s.size < 1
        invalid_properties.push("invalid value for \"id\", the character length must be great than or equal to 1.")
      end

      pattern = Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      if !@id.nil? && @id !~ pattern
        invalid_properties.push("invalid value for \"id\", must conform to the pattern #{pattern}.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@name.nil? && @name.to_s.size > 256
      return false if !@shop_sku.nil? && @shop_sku.to_s.size > 255
      return false if !@shop_sku.nil? && @shop_sku.to_s.size < 1
      return false if !@shop_sku.nil? && @shop_sku !~ Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      return false if !@description.nil? && @description.to_s.size > 6000
      return false if !@id.nil? && @id.to_s.size > 255
      return false if !@id.nil? && @id.to_s.size < 1
      return false if !@id.nil? && @id !~ Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] name Value to be assigned
    def name=(name)
      if !name.nil? && name.to_s.size > 256
        raise ArgumentError.new("invalid value for \"name\", the character length must be smaller than or equal to 256.")
      end

      @name = name
    end

    # Custom attribute writer method with validation
    # @param [Object] shop_sku Value to be assigned
    def shop_sku=(shop_sku)
      if !shop_sku.nil? && shop_sku.to_s.size > 255
        raise ArgumentError.new("invalid value for \"shop_sku\", the character length must be smaller than or equal to 255.")
      end

      if !shop_sku.nil? && shop_sku.to_s.size < 1
        raise ArgumentError.new("invalid value for \"shop_sku\", the character length must be great than or equal to 1.")
      end

      pattern = Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      if !shop_sku.nil? && shop_sku !~ pattern
        raise ArgumentError.new("invalid value for \"shop_sku\", must conform to the pattern #{pattern}.")
      end

      @shop_sku = shop_sku
    end

    # Custom attribute writer method with validation
    # @param [Object] description Value to be assigned
    def description=(description)
      if !description.nil? && description.to_s.size > 6000
        raise ArgumentError.new("invalid value for \"description\", the character length must be smaller than or equal to 6000.")
      end

      @description = description
    end

    # Custom attribute writer method with validation
    # @param [Object] id Value to be assigned
    def id=(id)
      if !id.nil? && id.to_s.size > 255
        raise ArgumentError.new("invalid value for \"id\", the character length must be smaller than or equal to 255.")
      end

      if !id.nil? && id.to_s.size < 1
        raise ArgumentError.new("invalid value for \"id\", the character length must be great than or equal to 1.")
      end

      pattern = Regexp.new(/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/)
      if !id.nil? && id !~ pattern
        raise ArgumentError.new("invalid value for \"id\", must conform to the pattern #{pattern}.")
      end

      @id = id
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          name == o.name &&
          shop_sku == o.shop_sku &&
          category == o.category &&
          vendor == o.vendor &&
          vendor_code == o.vendor_code &&
          description == o.description &&
          id == o.id &&
          feed_id == o.feed_id &&
          barcodes == o.barcodes &&
          urls == o.urls &&
          pictures == o.pictures &&
          manufacturer == o.manufacturer &&
          manufacturer_countries == o.manufacturer_countries &&
          min_shipment == o.min_shipment &&
          transport_unit_size == o.transport_unit_size &&
          quantum_of_supply == o.quantum_of_supply &&
          delivery_duration_days == o.delivery_duration_days &&
          box_count == o.box_count &&
          customs_commodity_codes == o.customs_commodity_codes &&
          weight_dimensions == o.weight_dimensions &&
          supply_schedule_days == o.supply_schedule_days &&
          shelf_life_days == o.shelf_life_days &&
          life_time_days == o.life_time_days &&
          guarantee_period_days == o.guarantee_period_days &&
          processing_state == o.processing_state &&
          availability == o.availability &&
          shelf_life == o.shelf_life &&
          life_time == o.life_time &&
          guarantee_period == o.guarantee_period &&
          certificate == o.certificate
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [name, shop_sku, category, vendor, vendor_code, description, id, feed_id, barcodes, urls, pictures, manufacturer, manufacturer_countries, min_shipment, transport_unit_size, quantum_of_supply, delivery_duration_days, box_count, customs_commodity_codes, weight_dimensions, supply_schedule_days, shelf_life_days, life_time_days, guarantee_period_days, processing_state, availability, shelf_life, life_time, guarantee_period, certificate].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
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
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenAPIClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
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
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
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
        ({} of Symbol => String).tap do |hash|
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
