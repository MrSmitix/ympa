require 'json'


MyApp.add_route('POST', '/tariffs/calculate', {
  "resourcePath" => "/Tariffs",
  "summary" => "Калькулятор стоимости услуг",
  "nickname" => "calculate_tariffs",
  "responseClass" => "CalculateTariffsResponse",
  "endpoint" => "/tariffs/calculate",
  "notes" => "Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| ",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CalculateTariffsRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

