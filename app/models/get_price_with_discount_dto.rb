=begin
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class GetPriceWithDiscountDTO < ApplicationRecord
  validates_presence_of :value
  validates_presence_of :currency_id
  validates_presence_of :updated_at

end
