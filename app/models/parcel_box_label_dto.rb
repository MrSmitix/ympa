=begin
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class ParcelBoxLabelDTO < ApplicationRecord
  validates_presence_of :url
  validates_presence_of :supplier_name
  validates_presence_of :delivery_service_name
  validates_presence_of :order_id
  validates_presence_of :order_num
  validates_presence_of :recipient_name
  validates_presence_of :box_id
  validates_presence_of :fulfilment_id
  validates_presence_of :place
  validates_presence_of :weight
  validates_presence_of :delivery_service_id

end
