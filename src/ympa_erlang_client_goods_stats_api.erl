-module(ympa_erlang_client_goods_stats_api).

-export([get_goods_stats/3, get_goods_stats/4]).

-define(BASE_URL, <<"">>).

%% @doc Отчет по товарам
%% Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec get_goods_stats(ctx:ctx(), integer(), ympa_erlang_client_get_goods_stats_request:ympa_erlang_client_get_goods_stats_request()) -> {ok, ympa_erlang_client_get_goods_stats_response:ympa_erlang_client_get_goods_stats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_stats(Ctx, CampaignId, YmpaErlangClientGetGoodsStatsRequest) ->
    get_goods_stats(Ctx, CampaignId, YmpaErlangClientGetGoodsStatsRequest, #{}).

-spec get_goods_stats(ctx:ctx(), integer(), ympa_erlang_client_get_goods_stats_request:ympa_erlang_client_get_goods_stats_request(), maps:map()) -> {ok, ympa_erlang_client_get_goods_stats_response:ympa_erlang_client_get_goods_stats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_stats(Ctx, CampaignId, YmpaErlangClientGetGoodsStatsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/stats/skus"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetGoodsStatsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


