=begin
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CampaignsQualityRatingDTO < ApplicationRecord
  validates_presence_of :campaign_ratings

  serialize :campaign_ratings, Array
end
