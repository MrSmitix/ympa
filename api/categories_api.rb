require 'json'


MyApp.add_route('POST', '/categories/max-sale-quantum', {
  "resourcePath" => "/Categories",
  "summary" => "Лимит на установку кванта продажи и минимального количества товаров в заказе",
  "nickname" => "get_categories_max_sale_quantum",
  "responseClass" => "GetCategoriesMaxSaleQuantumResponse",
  "endpoint" => "/categories/max-sale-quantum",
  "notes" => "Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GetCategoriesMaxSaleQuantumRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/categories/tree', {
  "resourcePath" => "/Categories",
  "summary" => "Дерево категорий",
  "nickname" => "get_categories_tree",
  "responseClass" => "GetCategoriesResponse",
  "endpoint" => "/categories/tree",
  "notes" => "Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GetCategoriesRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

