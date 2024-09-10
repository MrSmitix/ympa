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
  class ShipmentActionType
    CONFIRM = "CONFIRM"
  
    DOWNLOAD_ACT = "DOWNLOAD_ACT"
  
    DOWNLOAD_INBOUND_ACT = "DOWNLOAD_INBOUND_ACT"
  
    DOWNLOAD_DISCREPANCY_ACT = "DOWNLOAD_DISCREPANCY_ACT"
  
    CHANGE_PALLETS_COUNT = "CHANGE_PALLETS_COUNT"
   
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
      when "CONFIRM"
        CONFIRM
      when "DOWNLOAD_ACT"
        DOWNLOAD_ACT
      when "DOWNLOAD_INBOUND_ACT"
        DOWNLOAD_INBOUND_ACT
      when "DOWNLOAD_DISCREPANCY_ACT"
        DOWNLOAD_DISCREPANCY_ACT
      when "CHANGE_PALLETS_COUNT"
        CHANGE_PALLETS_COUNT
      else
        raise "Invalid ENUM value #{value} for class #ShipmentActionType"
      end
    end
  end
end
