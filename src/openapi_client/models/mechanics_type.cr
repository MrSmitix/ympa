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
  class MechanicsType
    DIRECT_DISCOUNT = "DIRECT_DISCOUNT"
  
    BLUE_FLASH = "BLUE_FLASH"
  
    MARKET_PROMOCODE = "MARKET_PROMOCODE"
   
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
      when "DIRECT_DISCOUNT"
        DIRECT_DISCOUNT
      when "BLUE_FLASH"
        BLUE_FLASH
      when "MARKET_PROMOCODE"
        MARKET_PROMOCODE
      else
        raise "Invalid ENUM value #{value} for class #MechanicsType"
      end
    end
  end
end
