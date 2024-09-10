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
  class OrderPaymentMethodType
    CASH_ON_DELIVERY = "CASH_ON_DELIVERY"
  
    CARD_ON_DELIVERY = "CARD_ON_DELIVERY"
  
    BOUND_CARD_ON_DELIVERY = "BOUND_CARD_ON_DELIVERY"
  
    YANDEX = "YANDEX"
  
    APPLE_PAY = "APPLE_PAY"
  
    EXTERNAL_CERTIFICATE = "EXTERNAL_CERTIFICATE"
  
    CREDIT = "CREDIT"
  
    GOOGLE_PAY = "GOOGLE_PAY"
  
    TINKOFF_CREDIT = "TINKOFF_CREDIT"
  
    SBP = "SBP"
  
    TINKOFF_INSTALLMENTS = "TINKOFF_INSTALLMENTS"
  
    B2_B_ACCOUNT_PREPAYMENT = "B2B_ACCOUNT_PREPAYMENT"
  
    B2_B_ACCOUNT_POSTPAYMENT = "B2B_ACCOUNT_POSTPAYMENT"
  
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
      when "CASH_ON_DELIVERY"
        CASH_ON_DELIVERY
      when "CARD_ON_DELIVERY"
        CARD_ON_DELIVERY
      when "BOUND_CARD_ON_DELIVERY"
        BOUND_CARD_ON_DELIVERY
      when "YANDEX"
        YANDEX
      when "APPLE_PAY"
        APPLE_PAY
      when "EXTERNAL_CERTIFICATE"
        EXTERNAL_CERTIFICATE
      when "CREDIT"
        CREDIT
      when "GOOGLE_PAY"
        GOOGLE_PAY
      when "TINKOFF_CREDIT"
        TINKOFF_CREDIT
      when "SBP"
        SBP
      when "TINKOFF_INSTALLMENTS"
        TINKOFF_INSTALLMENTS
      when "B2B_ACCOUNT_PREPAYMENT"
        B2_B_ACCOUNT_PREPAYMENT
      when "B2B_ACCOUNT_POSTPAYMENT"
        B2_B_ACCOUNT_POSTPAYMENT
      when "UNKNOWN"
        UNKNOWN
      else
        raise "Invalid ENUM value #{value} for class #OrderPaymentMethodType"
      end
    end
  end
end
