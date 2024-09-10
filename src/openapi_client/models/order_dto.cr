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
  # Заказ.
  class OrderDTO
    include JSON::Serializable

    # Required properties
    # Список товаров в заказе.
    @[JSON::Field(key: "items", type: Array(OrderItemDTO), nillable: false, emit_null: false)]
    property items : Array(OrderItemDTO)

    # Optional properties
    # Идентификатор заказа.
    @[JSON::Field(key: "id", type: Int64?, nillable: true, emit_null: false)]
    property id : Int64?

    @[JSON::Field(key: "status", type: OrderStatusType?, nillable: true, emit_null: false)]
    property status : OrderStatusType?

    @[JSON::Field(key: "substatus", type: OrderSubstatusType?, nillable: true, emit_null: false)]
    property substatus : OrderSubstatusType?

    @[JSON::Field(key: "creationDate", type: String?, nillable: true, emit_null: false)]
    property creation_date : String?

    @[JSON::Field(key: "updatedAt", type: String?, nillable: true, emit_null: false)]
    property updated_at : String?

    @[JSON::Field(key: "currency", type: CurrencyType?, nillable: true, emit_null: false)]
    property currency : CurrencyType?

    # Платеж покупателя. 
    @[JSON::Field(key: "itemsTotal", type: Float64?, nillable: true, emit_null: false)]
    property items_total : Float64?

    # Стоимость доставки. 
    @[JSON::Field(key: "deliveryTotal", type: Float64?, nillable: true, emit_null: false)]
    property delivery_total : Float64?

    # {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
    @[JSON::Field(key: "buyerItemsTotal", type: Float64?, nillable: true, emit_null: false)]
    property buyer_items_total : Float64?

    # {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
    @[JSON::Field(key: "buyerTotal", type: Float64?, nillable: true, emit_null: false)]
    property buyer_total : Float64?

    # Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
    @[JSON::Field(key: "buyerItemsTotalBeforeDiscount", type: Float64?, nillable: true, emit_null: false)]
    property buyer_items_total_before_discount : Float64?

    # {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
    @[JSON::Field(key: "buyerTotalBeforeDiscount", type: Float64?, nillable: true, emit_null: false)]
    property buyer_total_before_discount : Float64?

    @[JSON::Field(key: "paymentType", type: OrderPaymentType?, nillable: true, emit_null: false)]
    property payment_type : OrderPaymentType?

    @[JSON::Field(key: "paymentMethod", type: OrderPaymentMethodType?, nillable: true, emit_null: false)]
    property payment_method : OrderPaymentMethodType?

    # Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
    @[JSON::Field(key: "fake", type: Bool?, nillable: true, emit_null: false)]
    property fake : Bool?

    # Список субсидий по типам.
    @[JSON::Field(key: "subsidies", type: Array(OrderSubsidyDTO)?, nillable: true, emit_null: false)]
    property subsidies : Array(OrderSubsidyDTO)?

    @[JSON::Field(key: "delivery", type: OrderDeliveryDTO?, nillable: true, emit_null: false)]
    property delivery : OrderDeliveryDTO?

    @[JSON::Field(key: "buyer", type: OrderBuyerDTO?, nillable: true, emit_null: false)]
    property buyer : OrderBuyerDTO?

    # Комментарий к заказу.
    @[JSON::Field(key: "notes", type: String?, nillable: true, emit_null: false)]
    property notes : String?

    @[JSON::Field(key: "taxSystem", type: OrderTaxSystemType?, nillable: true, emit_null: false)]
    property tax_system : OrderTaxSystemType?

    # **Только для модели DBS**  Запрошена ли отмена. 
    @[JSON::Field(key: "cancelRequested", type: Bool?, nillable: true, emit_null: false)]
    property cancel_requested : Bool?

    @[JSON::Field(key: "expiryDate", type: String?, nillable: true, emit_null: false)]
    property expiry_date : String?

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
    def initialize(@items : Array(OrderItemDTO), @id : Int64?, @status : OrderStatusType?, @substatus : OrderSubstatusType?, @creation_date : String?, @updated_at : String?, @currency : CurrencyType?, @items_total : Float64?, @delivery_total : Float64?, @buyer_items_total : Float64?, @buyer_total : Float64?, @buyer_items_total_before_discount : Float64?, @buyer_total_before_discount : Float64?, @payment_type : OrderPaymentType?, @payment_method : OrderPaymentMethodType?, @fake : Bool?, @subsidies : Array(OrderSubsidyDTO)?, @delivery : OrderDeliveryDTO?, @buyer : OrderBuyerDTO?, @notes : String?, @tax_system : OrderTaxSystemType?, @cancel_requested : Bool?, @expiry_date : String?)
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
          id == o.id &&
          status == o.status &&
          substatus == o.substatus &&
          creation_date == o.creation_date &&
          updated_at == o.updated_at &&
          currency == o.currency &&
          items_total == o.items_total &&
          delivery_total == o.delivery_total &&
          buyer_items_total == o.buyer_items_total &&
          buyer_total == o.buyer_total &&
          buyer_items_total_before_discount == o.buyer_items_total_before_discount &&
          buyer_total_before_discount == o.buyer_total_before_discount &&
          payment_type == o.payment_type &&
          payment_method == o.payment_method &&
          fake == o.fake &&
          items == o.items &&
          subsidies == o.subsidies &&
          delivery == o.delivery &&
          buyer == o.buyer &&
          notes == o.notes &&
          tax_system == o.tax_system &&
          cancel_requested == o.cancel_requested &&
          expiry_date == o.expiry_date
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [id, status, substatus, creation_date, updated_at, currency, items_total, delivery_total, buyer_items_total, buyer_total, buyer_items_total_before_discount, buyer_total_before_discount, payment_type, payment_method, fake, items, subsidies, delivery, buyer, notes, tax_system, cancel_requested, expiry_date].hash
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
