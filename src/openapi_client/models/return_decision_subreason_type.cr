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
  class ReturnDecisionSubreasonType
    USER_DID_NOT_LIKE = "USER_DID_NOT_LIKE"
  
    USER_CHANGED_MIND = "USER_CHANGED_MIND"
  
    DELIVERED_TOO_LONG = "DELIVERED_TOO_LONG"
  
    BAD_PACKAGE = "BAD_PACKAGE"
  
    DAMAGED = "DAMAGED"
  
    NOT_WORKING = "NOT_WORKING"
  
    INCOMPLETENESS = "INCOMPLETENESS"
  
    WRONG_ITEM = "WRONG_ITEM"
  
    WRONG_COLOR = "WRONG_COLOR"
  
    DID_NOT_MATCH_DESCRIPTION = "DID_NOT_MATCH_DESCRIPTION"
  
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
      when "USER_DID_NOT_LIKE"
        USER_DID_NOT_LIKE
      when "USER_CHANGED_MIND"
        USER_CHANGED_MIND
      when "DELIVERED_TOO_LONG"
        DELIVERED_TOO_LONG
      when "BAD_PACKAGE"
        BAD_PACKAGE
      when "DAMAGED"
        DAMAGED
      when "NOT_WORKING"
        NOT_WORKING
      when "INCOMPLETENESS"
        INCOMPLETENESS
      when "WRONG_ITEM"
        WRONG_ITEM
      when "WRONG_COLOR"
        WRONG_COLOR
      when "DID_NOT_MATCH_DESCRIPTION"
        DID_NOT_MATCH_DESCRIPTION
      when "UNKNOWN"
        UNKNOWN
      else
        raise "Invalid ENUM value #{value} for class #ReturnDecisionSubreasonType"
      end
    end
  end
end
