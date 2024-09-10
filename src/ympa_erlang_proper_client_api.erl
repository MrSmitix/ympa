-module(ympa_erlang_proper_client_api).

-export([ get_fulfillment_warehouses/0
        , get_warehouses/1
        ]).

-define(BASE_URL, "").

%% @doc Идентификаторы складов Маркета (FBY)
%% Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec get_fulfillment_warehouses() ->
  ympa_erlang_proper_client_utils:response().
get_fulfillment_warehouses() ->
  Method      = get,
  Host        = application:get_env(ympa_erlang_proper_client, host, "http://localhost:8080"),
  Path        = ["/warehouses"],

  ympa_erlang_proper_client_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Список складов и групп складов
%% Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec get_warehouses(integer()) ->
  ympa_erlang_proper_client_utils:response().
get_warehouses(BusinessId) ->
  Method      = get,
  Host        = application:get_env(ympa_erlang_proper_client, host, "http://localhost:8080"),
  Path        = ["/businesses/", BusinessId, "/warehouses"],

  ympa_erlang_proper_client_utils:request(Method, [Host, ?BASE_URL, Path]).

