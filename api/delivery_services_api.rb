require 'json'


MyApp.add_route('GET', '/delivery/services', {
  "resourcePath" => "/DeliveryServices",
  "summary" => "Справочник служб доставки",
  "nickname" => "get_delivery_services",
  "responseClass" => "GetDeliveryServicesResponse",
  "endpoint" => "/delivery/services",
  "notes" => "Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

