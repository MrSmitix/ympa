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
  class LogisticPointType
    WAREHOUSE = "WAREHOUSE"
  
    PICKUP_POINT = "PICKUP_POINT"
  
    PICKUP_TERMINAL = "PICKUP_TERMINAL"
  
    PICKUP_POST_OFFICE = "PICKUP_POST_OFFICE"
  
    PICKUP_MIXED = "PICKUP_MIXED"
  
    PICKUP_RETAIL = "PICKUP_RETAIL"
  
    UNKNOWN = "UNKNOWN"
   
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
      when "WAREHOUSE"
        WAREHOUSE
      when "PICKUP_POINT"
        PICKUP_POINT
      when "PICKUP_TERMINAL"
        PICKUP_TERMINAL
      when "PICKUP_POST_OFFICE"
        PICKUP_POST_OFFICE
      when "PICKUP_MIXED"
        PICKUP_MIXED
      when "PICKUP_RETAIL"
        PICKUP_RETAIL
      when "UNKNOWN"
        UNKNOWN
      else
        raise "Invalid ENUM value #{value} for class #LogisticPointType"
      end
    end
  end
end
