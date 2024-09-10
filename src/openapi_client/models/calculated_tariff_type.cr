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
  class CalculatedTariffType
    AGENCY_COMMISSION = "AGENCY_COMMISSION"
  
    PAYMENT_TRANSFER = "PAYMENT_TRANSFER"
  
    FEE = "FEE"
  
    DELIVERY_TO_CUSTOMER = "DELIVERY_TO_CUSTOMER"
  
    CROSSREGIONAL_DELIVERY = "CROSSREGIONAL_DELIVERY"
  
    EXPRESS_DELIVERY = "EXPRESS_DELIVERY"
  
    SORTING = "SORTING"
  
    MIDDLE_MILE = "MIDDLE_MILE"
   
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
      case value
      when "AGENCY_COMMISSION"
        AGENCY_COMMISSION
      when "PAYMENT_TRANSFER"
        PAYMENT_TRANSFER
      when "FEE"
        FEE
      when "DELIVERY_TO_CUSTOMER"
        DELIVERY_TO_CUSTOMER
      when "CROSSREGIONAL_DELIVERY"
        CROSSREGIONAL_DELIVERY
      when "EXPRESS_DELIVERY"
        EXPRESS_DELIVERY
      when "SORTING"
        SORTING
      when "MIDDLE_MILE"
        MIDDLE_MILE
      else
        raise "Invalid ENUM value #{value} for class #CalculatedTariffType"
      end
    end
  end
end
