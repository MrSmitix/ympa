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
  # Предложение.
  class OfferDTO
    include JSON::Serializable

    # Required properties
    # Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
    @[JSON::Field(key: "modelId", type: Int64, nillable: false, emit_null: false)]
    property model_id : Int64

    # Optional properties
    # Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
    @[JSON::Field(key: "price", type: Float64?, nillable: true, emit_null: false)]
    property price : Float64?

    # Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
    @[JSON::Field(key: "feedId", type: Int64?, nillable: true, emit_null: false)]
    property feed_id : Int64?

    # Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
    @[JSON::Field(key: "id", type: String?, nillable: true, emit_null: false)]
    property id : String?

    # Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
    @[JSON::Field(key: "shopCategoryId", type: String?, nillable: true, emit_null: false)]
    property shop_category_id : String?

    # Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
    @[JSON::Field(key: "marketCategoryId", type: Int32?, nillable: true, emit_null: false)]
    property market_category_id : Int32?

    # Цена предложения без скидки.
    @[JSON::Field(key: "preDiscountPrice", type: Float64?, nillable: true, emit_null: false)]
    property pre_discount_price : Float64?

    # Скидка на предложение в процентах.
    @[JSON::Field(key: "discount", type: Int32?, nillable: true, emit_null: false)]
    property discount : Int32?

    # Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
    @[JSON::Field(key: "cutPrice", type: Bool?, nillable: true, emit_null: false)]
    property cut_price : Bool?

    # URL-адрес предложения на сайте магазина.
    @[JSON::Field(key: "url", type: String?, nillable: true, emit_null: false)]
    property url : String?

    # Наименование предложения.
    @[JSON::Field(key: "name", type: String?, nillable: true, emit_null: false)]
    property name : String?

    @[JSON::Field(key: "currency", type: CurrencyType?, nillable: true, emit_null: false)]
    property currency : CurrencyType?

    # {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
    @[JSON::Field(key: "bid", type: Float64?, nillable: true, emit_null: false)]
    property bid : Float64?

    # {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
    @[JSON::Field(key: "cbid", type: Float64?, nillable: true, emit_null: false)]
    property cbid : Float64?

    # {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
    @[JSON::Field(key: "fee", type: Float64?, nillable: true, emit_null: false)]
    property fee : Float64?

    # Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
    @[JSON::Field(key: "blocked", type: Bool?, nillable: true, emit_null: false)]
    property blocked : Bool?

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
    def initialize(@model_id : Int64, @price : Float64?, @feed_id : Int64?, @id : String?, @shop_category_id : String?, @market_category_id : Int32?, @pre_discount_price : Float64?, @discount : Int32?, @cut_price : Bool?, @url : String?, @name : String?, @currency : CurrencyType?, @bid : Float64?, @cbid : Float64?, @fee : Float64?, @blocked : Bool?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          price == o.price &&
          feed_id == o.feed_id &&
          id == o.id &&
          shop_category_id == o.shop_category_id &&
          market_category_id == o.market_category_id &&
          pre_discount_price == o.pre_discount_price &&
          discount == o.discount &&
          cut_price == o.cut_price &&
          url == o.url &&
          model_id == o.model_id &&
          name == o.name &&
          currency == o.currency &&
          bid == o.bid &&
          cbid == o.cbid &&
          fee == o.fee &&
          blocked == o.blocked
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [price, feed_id, id, shop_category_id, market_category_id, pre_discount_price, discount, cut_price, url, model_id, name, currency, bid, cbid, fee, blocked].hash
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
