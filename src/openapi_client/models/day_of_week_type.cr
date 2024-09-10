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
  class DayOfWeekType
    MONDAY = "MONDAY"
  
    TUESDAY = "TUESDAY"
  
    WEDNESDAY = "WEDNESDAY"
  
    THURSDAY = "THURSDAY"
  
    FRIDAY = "FRIDAY"
  
    SATURDAY = "SATURDAY"
  
    SUNDAY = "SUNDAY"
   
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
      when "MONDAY"
        MONDAY
      when "TUESDAY"
        TUESDAY
      when "WEDNESDAY"
        WEDNESDAY
      when "THURSDAY"
        THURSDAY
      when "FRIDAY"
        FRIDAY
      when "SATURDAY"
        SATURDAY
      when "SUNDAY"
        SUNDAY
      else
        raise "Invalid ENUM value #{value} for class #DayOfWeekType"
      end
    end
  end
end
