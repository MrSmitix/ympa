
# Table `GetPromoBestsellerInfoDTO`
(mapped from: GetPromoBestsellerInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bestseller** | bestseller | boolean NOT NULL |  | **kotlin.Boolean** | Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). | 
**entryDeadline** | entryDeadline | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  |  [optional]




