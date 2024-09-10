=begin
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CategoryParameterDTO < ApplicationRecord
  validates_presence_of :id
  validates_presence_of :type
  validates_presence_of :required
  validates_presence_of :filtering
  validates_presence_of :distinctive
  validates_presence_of :multivalue
  validates_presence_of :allow_custom_values

  serialize :recommendation_types, Array
  serialize :values, Array
  serialize :value_restrictions, Array
end
