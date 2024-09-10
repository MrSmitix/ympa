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
  class ReturnRequestDecisionType
    REFUND_MONEY = "REFUND_MONEY".freeze
    REFUND_MONEY_INCLUDING_SHIPMENT = "REFUND_MONEY_INCLUDING_SHIPMENT".freeze
    REPAIR = "REPAIR".freeze
    REPLACE = "REPLACE".freeze
    SEND_TO_EXAMINATION = "SEND_TO_EXAMINATION".freeze
    DECLINE_REFUND = "DECLINE_REFUND".freeze
    OTHER_DECISION = "OTHER_DECISION".freeze

    def self.all_vars
      @all_vars ||= [REFUND_MONEY, REFUND_MONEY_INCLUDING_SHIPMENT, REPAIR, REPLACE, SEND_TO_EXAMINATION, DECLINE_REFUND, OTHER_DECISION].freeze
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
      return value if ReturnRequestDecisionType.all_vars.include?(value)
      raise "Invalid ENUM value #{value} for class #ReturnRequestDecisionType"
    end
  end
end
