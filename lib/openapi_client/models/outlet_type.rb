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
  class OutletType
    DEPOT = "DEPOT".freeze
    MIXED = "MIXED".freeze
    RETAIL = "RETAIL".freeze
    NOT_DEFINED = "NOT_DEFINED".freeze

    def self.all_vars
      @all_vars ||= [DEPOT, MIXED, RETAIL, NOT_DEFINED].freeze
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def self.build_from_hash(value)
      new.build_from_hash(value)
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      return value if OutletType.all_vars.include?(value)
      raise "Invalid ENUM value #{value} for class #OutletType"
    end
  end
end
