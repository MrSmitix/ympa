require 'json'


MyApp.add_route('GET', '/warehouses', {
  "resourcePath" => "/Warehouses",
  "summary" => "Идентификаторы складов Маркета (FBY)",
  "nickname" => "get_fulfillment_warehouses",
  "responseClass" => "GetFulfillmentWarehousesResponse",
  "endpoint" => "/warehouses",
  "notes" => "Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/businesses/{businessId}/warehouses', {
  "resourcePath" => "/Warehouses",
  "summary" => "Список складов и групп складов",
  "nickname" => "get_warehouses",
  "responseClass" => "GetWarehousesResponse",
  "endpoint" => "/businesses/{businessId}/warehouses",
  "notes" => "Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| ",
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

