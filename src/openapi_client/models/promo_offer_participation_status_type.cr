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
  class PromoOfferParticipationStatusType
    AUTO = "AUTO"
  
    PARTIALLY_AUTO = "PARTIALLY_AUTO"
  
    MANUAL = "MANUAL"
  
    NOT_PARTICIPATING = "NOT_PARTICIPATING"
   
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
      when "AUTO"
        AUTO
      when "PARTIALLY_AUTO"
        PARTIALLY_AUTO
      when "MANUAL"
        MANUAL
      when "NOT_PARTICIPATING"
        NOT_PARTICIPATING
      else
        raise "Invalid ENUM value #{value} for class #PromoOfferParticipationStatusType"
      end
    end
  end
end
