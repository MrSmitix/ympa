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
  class OrderDeliveryEacType
    MERCHANT_TO_COURIER = "MERCHANT_TO_COURIER"
  
    COURIER_TO_MERCHANT = "COURIER_TO_MERCHANT"
  
    CHECKING_BY_MERCHANT = "CHECKING_BY_MERCHANT"
   
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
      when "MERCHANT_TO_COURIER"
        MERCHANT_TO_COURIER
      when "COURIER_TO_MERCHANT"
        COURIER_TO_MERCHANT
      when "CHECKING_BY_MERCHANT"
        CHECKING_BY_MERCHANT
      else
        raise "Invalid ENUM value #{value} for class #OrderDeliveryEacType"
      end
    end
  end
end
