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
  # Адрес точки продаж. 
  class OutletAddressDTO
    # Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
    attr_accessor :region_id

    # Улица.
    attr_accessor :street

    # Номер дома.
    attr_accessor :number

    # Номер строения.
    attr_accessor :building

    # Номер владения.
    attr_accessor :estate

    # Номер корпуса.
    attr_accessor :block

    # Дополнительная информация.
    attr_accessor :additional

    # Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
    attr_accessor :km

    # {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
    attr_accessor :city

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'region_id' => :'regionId',
        :'street' => :'street',
        :'number' => :'number',
        :'building' => :'building',
        :'estate' => :'estate',
        :'block' => :'block',
        :'additional' => :'additional',
        :'km' => :'km',
        :'city' => :'city'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'region_id' => :'Integer',
        :'street' => :'String',
        :'number' => :'String',
        :'building' => :'String',
        :'estate' => :'String',
        :'block' => :'String',
        :'additional' => :'String',
        :'km' => :'Integer',
        :'city' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::OutletAddressDTO` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::OutletAddressDTO`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'region_id')
        self.region_id = attributes[:'region_id']
      else
        self.region_id = nil
      end

      if attributes.key?(:'street')
        self.street = attributes[:'street']
      end

      if attributes.key?(:'number')
        self.number = attributes[:'number']
      end

      if attributes.key?(:'building')
        self.building = attributes[:'building']
      end

      if attributes.key?(:'estate')
        self.estate = attributes[:'estate']
      end

      if attributes.key?(:'block')
        self.block = attributes[:'block']
      end

      if attributes.key?(:'additional')
        self.additional = attributes[:'additional']
      end

      if attributes.key?(:'km')
        self.km = attributes[:'km']
      end

      if attributes.key?(:'city')
        self.city = attributes[:'city']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @region_id.nil?
        invalid_properties.push('invalid value for "region_id", region_id cannot be nil.')
      end

      if !@street.nil? && @street.to_s.length > 512
        invalid_properties.push('invalid value for "street", the character length must be smaller than or equal to 512.')
      end

      if !@number.nil? && @number.to_s.length > 256
        invalid_properties.push('invalid value for "number", the character length must be smaller than or equal to 256.')
      end

      if !@building.nil? && @building.to_s.length > 16
        invalid_properties.push('invalid value for "building", the character length must be smaller than or equal to 16.')
      end

      if !@estate.nil? && @estate.to_s.length > 16
        invalid_properties.push('invalid value for "estate", the character length must be smaller than or equal to 16.')
      end

      if !@block.nil? && @block.to_s.length > 16
        invalid_properties.push('invalid value for "block", the character length must be smaller than or equal to 16.')
      end

      if !@city.nil? && @city.to_s.length > 200
        invalid_properties.push('invalid value for "city", the character length must be smaller than or equal to 200.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @region_id.nil?
      return false if !@street.nil? && @street.to_s.length > 512
      return false if !@number.nil? && @number.to_s.length > 256
      return false if !@building.nil? && @building.to_s.length > 16
      return false if !@estate.nil? && @estate.to_s.length > 16
      return false if !@block.nil? && @block.to_s.length > 16
      return false if !@city.nil? && @city.to_s.length > 200
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] street Value to be assigned
    def street=(street)
      if street.nil?
        fail ArgumentError, 'street cannot be nil'
      end

      if street.to_s.length > 512
        fail ArgumentError, 'invalid value for "street", the character length must be smaller than or equal to 512.'
      end

      @street = street
    end

    # Custom attribute writer method with validation
    # @param [Object] number Value to be assigned
    def number=(number)
      if number.nil?
        fail ArgumentError, 'number cannot be nil'
      end

      if number.to_s.length > 256
        fail ArgumentError, 'invalid value for "number", the character length must be smaller than or equal to 256.'
      end

      @number = number
    end

    # Custom attribute writer method with validation
    # @param [Object] building Value to be assigned
    def building=(building)
      if building.nil?
        fail ArgumentError, 'building cannot be nil'
      end

      if building.to_s.length > 16
        fail ArgumentError, 'invalid value for "building", the character length must be smaller than or equal to 16.'
      end

      @building = building
    end

    # Custom attribute writer method with validation
    # @param [Object] estate Value to be assigned
    def estate=(estate)
      if estate.nil?
        fail ArgumentError, 'estate cannot be nil'
      end

      if estate.to_s.length > 16
        fail ArgumentError, 'invalid value for "estate", the character length must be smaller than or equal to 16.'
      end

      @estate = estate
    end

    # Custom attribute writer method with validation
    # @param [Object] block Value to be assigned
    def block=(block)
      if block.nil?
        fail ArgumentError, 'block cannot be nil'
      end

      if block.to_s.length > 16
        fail ArgumentError, 'invalid value for "block", the character length must be smaller than or equal to 16.'
      end

      @block = block
    end

    # Custom attribute writer method with validation
    # @param [Object] city Value to be assigned
    def city=(city)
      if city.nil?
        fail ArgumentError, 'city cannot be nil'
      end

      if city.to_s.length > 200
        fail ArgumentError, 'invalid value for "city", the character length must be smaller than or equal to 200.'
      end

      @city = city
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          region_id == o.region_id &&
          street == o.street &&
          number == o.number &&
          building == o.building &&
          estate == o.estate &&
          block == o.block &&
          additional == o.additional &&
          km == o.km &&
          city == o.city
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [region_id, street, number, building, estate, block, additional, km, city].hash
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
