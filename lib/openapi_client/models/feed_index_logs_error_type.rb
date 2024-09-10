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
  class FeedIndexLogsErrorType
    DOWNLOAD_ERROR = "DOWNLOAD_ERROR".freeze
    DOWNLOAD_HTTP_ERROR = "DOWNLOAD_HTTP_ERROR".freeze
    PARSE_ERROR = "PARSE_ERROR".freeze
    PARSE_XML_ERROR = "PARSE_XML_ERROR".freeze
    TOO_MANY_REJECTED_OFFERS = "TOO_MANY_REJECTED_OFFERS".freeze
    NOT_INDEXED = "NOT_INDEXED".freeze

    def self.all_vars
      @all_vars ||= [DOWNLOAD_ERROR, DOWNLOAD_HTTP_ERROR, PARSE_ERROR, PARSE_XML_ERROR, TOO_MANY_REJECTED_OFFERS, NOT_INDEXED].freeze
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
      return value if FeedIndexLogsErrorType.all_vars.include?(value)
      raise "Invalid ENUM value #{value} for class #FeedIndexLogsErrorType"
    end
  end
end
