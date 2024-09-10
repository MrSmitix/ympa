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
  class RegionType
    OTHER = "OTHER"
  
    CONTINENT = "CONTINENT"
  
    REGION = "REGION"
  
    COUNTRY = "COUNTRY"
  
    COUNTRY_DISTRICT = "COUNTRY_DISTRICT"
  
    REPUBLIC = "REPUBLIC"
  
    CITY = "CITY"
  
    VILLAGE = "VILLAGE"
  
    CITY_DISTRICT = "CITY_DISTRICT"
  
    SUBWAY_STATION = "SUBWAY_STATION"
  
    REPUBLIC_AREA = "REPUBLIC_AREA"
   
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
      when "OTHER"
        OTHER
      when "CONTINENT"
        CONTINENT
      when "REGION"
        REGION
      when "COUNTRY"
        COUNTRY
      when "COUNTRY_DISTRICT"
        COUNTRY_DISTRICT
      when "REPUBLIC"
        REPUBLIC
      when "CITY"
        CITY
      when "VILLAGE"
        VILLAGE
      when "CITY_DISTRICT"
        CITY_DISTRICT
      when "SUBWAY_STATION"
        SUBWAY_STATION
      when "REPUBLIC_AREA"
        REPUBLIC_AREA
      else
        raise "Invalid ENUM value #{value} for class #RegionType"
      end
    end
  end
end
