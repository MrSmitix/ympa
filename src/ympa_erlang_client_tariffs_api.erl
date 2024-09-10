-module(ympa_erlang_client_tariffs_api).

-export([calculate_tariffs/2, calculate_tariffs/3]).

-define(BASE_URL, <<"">>).

%% @doc Калькулятор стоимости услуг
%% Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec calculate_tariffs(ctx:ctx(), ympa_erlang_client_calculate_tariffs_request:ympa_erlang_client_calculate_tariffs_request()) -> {ok, ympa_erlang_client_calculate_tariffs_response:ympa_erlang_client_calculate_tariffs_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
calculate_tariffs(Ctx, YmpaErlangClientCalculateTariffsRequest) ->
    calculate_tariffs(Ctx, YmpaErlangClientCalculateTariffsRequest, #{}).

-spec calculate_tariffs(ctx:ctx(), ympa_erlang_client_calculate_tariffs_request:ympa_erlang_client_calculate_tariffs_request(), maps:map()) -> {ok, ympa_erlang_client_calculate_tariffs_response:ympa_erlang_client_calculate_tariffs_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
calculate_tariffs(Ctx, YmpaErlangClientCalculateTariffsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/tariffs/calculate"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientCalculateTariffsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


