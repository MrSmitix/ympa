require 'json'


MyApp.add_route('POST', '/businesses/{businessId}/settings', {
  "resourcePath" => "/Businesses",
  "summary" => "Настройки кабинета",
  "nickname" => "get_business_settings",
  "responseClass" => "GetBusinessSettingsResponse",
  "endpoint" => "/businesses/{businessId}/settings",
  "notes" => "Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

