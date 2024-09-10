=begin
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class OrdersShipmentInfoDTO < ApplicationRecord
  validates_presence_of :order_ids_with_labels
  validates_presence_of :order_ids_without_labels

  serialize :order_ids_with_labels, Array
  serialize :order_ids_without_labels, Array
end
