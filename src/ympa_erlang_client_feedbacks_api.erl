-module(ympa_erlang_client_feedbacks_api).

-export([get_feedback_and_comment_updates/2, get_feedback_and_comment_updates/3]).

-define(BASE_URL, <<"">>).

%% @doc Новые и обновленные отзывы о магазине
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec get_feedback_and_comment_updates(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_feedback_list_response:ympa_erlang_client_get_feedback_list_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feedback_and_comment_updates(Ctx, CampaignId) ->
    get_feedback_and_comment_updates(Ctx, CampaignId, #{}).

-spec get_feedback_and_comment_updates(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_feedback_list_response:ympa_erlang_client_get_feedback_list_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feedback_and_comment_updates(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/feedback/updates"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit', 'from_date'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


