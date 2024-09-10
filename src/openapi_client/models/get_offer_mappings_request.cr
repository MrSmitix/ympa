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
  class GetOfferMappingsRequest
    include JSON::Serializable

    # Optional properties
    # Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
    @[JSON::Field(key: "offerIds", type: Array(String)?, nillable: true, emit_null: false)]
    property offer_ids : Array(String)?

    # Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
    @[JSON::Field(key: "cardStatuses", type: Array(OfferCardStatusType)?, nillable: true, emit_null: false)]
    property card_statuses : Array(OfferCardStatusType)?

    # Фильтр по категориям на Маркете.
    @[JSON::Field(key: "categoryIds", type: Array(Int32)?, nillable: true, emit_null: false)]
    property category_ids : Array(Int32)?

    # Фильтр по брендам.
    @[JSON::Field(key: "vendorNames", type: Array(String)?, nillable: true, emit_null: false)]
    property vendor_names : Array(String)?

    # Фильтр по тегам.
    @[JSON::Field(key: "tags", type: Array(String)?, nillable: true, emit_null: false)]
    property tags : Array(String)?

    # Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
    @[JSON::Field(key: "archived", type: Bool?, nillable: true, emit_null: false)]
    property archived : Bool?

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@offer_ids : Array(String)?, @card_statuses : Array(OfferCardStatusType)?, @category_ids : Array(Int32)?, @vendor_names : Array(String)?, @tags : Array(String)?, @archived : Bool?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@offer_ids.nil? && @offer_ids.size > 200
        invalid_properties.push("invalid value for \"offer_ids\", number of items must be less than or equal to 200."
      end

      if !@offer_ids.nil? && @offer_ids.size < 1
        invalid_properties.push("invalid value for \"offer_ids\", number of items must be greater than or equal to 1."
      end

      if !@card_statuses.nil? && @card_statuses.size < 1
        invalid_properties.push("invalid value for \"card_statuses\", number of items must be greater than or equal to 1."
      end

      if !@category_ids.nil? && @category_ids.size < 1
        invalid_properties.push("invalid value for \"category_ids\", number of items must be greater than or equal to 1."
      end

      if !@vendor_names.nil? && @vendor_names.size < 1
        invalid_properties.push("invalid value for \"vendor_names\", number of items must be greater than or equal to 1."
      end

      if !@tags.nil? && @tags.size < 1
        invalid_properties.push("invalid value for \"tags\", number of items must be greater than or equal to 1."
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@offer_ids.nil? && @offer_ids.size > 200
      return false if !@offer_ids.nil? && @offer_ids.size < 1
      return false if !@card_statuses.nil? && @card_statuses.size < 1
      return false if !@category_ids.nil? && @category_ids.size < 1
      return false if !@vendor_names.nil? && @vendor_names.size < 1
      return false if !@tags.nil? && @tags.size < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] offer_ids Value to be assigned
    def offer_ids=(offer_ids)
      if !offer_ids.nil? && offer_ids.size > 200
        raise ArgumentError.new("invalid value for \"offer_ids\", number of items must be less than or equal to 200.")
      end

      if !offer_ids.nil? && offer_ids.size < 1
        raise ArgumentError.new("invalid value for \"offer_ids\", number of items must be greater than or equal to 1.")
      end

      @offer_ids = offer_ids
    end

    # Custom attribute writer method with validation
    # @param [Object] card_statuses Value to be assigned
    def card_statuses=(card_statuses)
      if !card_statuses.nil? && card_statuses.size < 1
        raise ArgumentError.new("invalid value for \"card_statuses\", number of items must be greater than or equal to 1.")
      end

      @card_statuses = card_statuses
    end

    # Custom attribute writer method with validation
    # @param [Object] category_ids Value to be assigned
    def category_ids=(category_ids)
      if !category_ids.nil? && category_ids.size < 1
        raise ArgumentError.new("invalid value for \"category_ids\", number of items must be greater than or equal to 1.")
      end

      @category_ids = category_ids
    end

    # Custom attribute writer method with validation
    # @param [Object] vendor_names Value to be assigned
    def vendor_names=(vendor_names)
      if !vendor_names.nil? && vendor_names.size < 1
        raise ArgumentError.new("invalid value for \"vendor_names\", number of items must be greater than or equal to 1.")
      end

      @vendor_names = vendor_names
    end

    # Custom attribute writer method with validation
    # @param [Object] tags Value to be assigned
    def tags=(tags)
      if !tags.nil? && tags.size < 1
        raise ArgumentError.new("invalid value for \"tags\", number of items must be greater than or equal to 1.")
      end

      @tags = tags
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          offer_ids == o.offer_ids &&
          card_statuses == o.card_statuses &&
          category_ids == o.category_ids &&
          vendor_names == o.vendor_names &&
          tags == o.tags &&
          archived == o.archived
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [offer_ids, card_statuses, category_ids, vendor_names, tags, archived].hash
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
