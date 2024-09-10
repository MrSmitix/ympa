-module(ympa_erlang_client_goods_feedback_api).

-export([delete_goods_feedback_comment/3, delete_goods_feedback_comment/4,
         get_goods_feedback_comments/3, get_goods_feedback_comments/4,
         get_goods_feedbacks/3, get_goods_feedbacks/4,
         skip_goods_feedbacks_reaction/3, skip_goods_feedbacks_reaction/4,
         update_goods_feedback_comment/3, update_goods_feedback_comment/4]).

-define(BASE_URL, <<"">>).

%% @doc Удаление комментария к отзыву
%% Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec delete_goods_feedback_comment(ctx:ctx(), integer(), ympa_erlang_client_delete_goods_feedback_comment_request:ympa_erlang_client_delete_goods_feedback_comment_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientDeleteGoodsFeedbackCommentRequest) ->
    delete_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientDeleteGoodsFeedbackCommentRequest, #{}).

-spec delete_goods_feedback_comment(ctx:ctx(), integer(), ympa_erlang_client_delete_goods_feedback_comment_request:ympa_erlang_client_delete_goods_feedback_comment_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientDeleteGoodsFeedbackCommentRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback/comments/delete"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeleteGoodsFeedbackCommentRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение комментариев к отзыву
%% Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec get_goods_feedback_comments(ctx:ctx(), integer(), ympa_erlang_client_get_goods_feedback_comments_request:ympa_erlang_client_get_goods_feedback_comments_request()) -> {ok, ympa_erlang_client_get_goods_feedback_comments_response:ympa_erlang_client_get_goods_feedback_comments_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_feedback_comments(Ctx, BusinessId, YmpaErlangClientGetGoodsFeedbackCommentsRequest) ->
    get_goods_feedback_comments(Ctx, BusinessId, YmpaErlangClientGetGoodsFeedbackCommentsRequest, #{}).

-spec get_goods_feedback_comments(ctx:ctx(), integer(), ympa_erlang_client_get_goods_feedback_comments_request:ympa_erlang_client_get_goods_feedback_comments_request(), maps:map()) -> {ok, ympa_erlang_client_get_goods_feedback_comments_response:ympa_erlang_client_get_goods_feedback_comments_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_feedback_comments(Ctx, BusinessId, YmpaErlangClientGetGoodsFeedbackCommentsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback/comments"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetGoodsFeedbackCommentsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение отзывов о товарах продавца
%% Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec get_goods_feedbacks(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_goods_feedback_response:ympa_erlang_client_get_goods_feedback_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_feedbacks(Ctx, BusinessId) ->
    get_goods_feedbacks(Ctx, BusinessId, #{}).

-spec get_goods_feedbacks(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_goods_feedback_response:ympa_erlang_client_get_goods_feedback_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_feedbacks(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetGoodsFeedbackRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отказ от ответа на отзывы
%% Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec skip_goods_feedbacks_reaction(ctx:ctx(), integer(), ympa_erlang_client_skip_goods_feedback_reaction_request:ympa_erlang_client_skip_goods_feedback_reaction_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
skip_goods_feedbacks_reaction(Ctx, BusinessId, YmpaErlangClientSkipGoodsFeedbackReactionRequest) ->
    skip_goods_feedbacks_reaction(Ctx, BusinessId, YmpaErlangClientSkipGoodsFeedbackReactionRequest, #{}).

-spec skip_goods_feedbacks_reaction(ctx:ctx(), integer(), ympa_erlang_client_skip_goods_feedback_reaction_request:ympa_erlang_client_skip_goods_feedback_reaction_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
skip_goods_feedbacks_reaction(Ctx, BusinessId, YmpaErlangClientSkipGoodsFeedbackReactionRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback/skip-reaction"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSkipGoodsFeedbackReactionRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Добавление нового или изменение созданного комментария
%% Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec update_goods_feedback_comment(ctx:ctx(), integer(), ympa_erlang_client_update_goods_feedback_comment_request:ympa_erlang_client_update_goods_feedback_comment_request()) -> {ok, ympa_erlang_client_update_goods_feedback_comment_response:ympa_erlang_client_update_goods_feedback_comment_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientUpdateGoodsFeedbackCommentRequest) ->
    update_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientUpdateGoodsFeedbackCommentRequest, #{}).

-spec update_goods_feedback_comment(ctx:ctx(), integer(), ympa_erlang_client_update_goods_feedback_comment_request:ympa_erlang_client_update_goods_feedback_comment_request(), maps:map()) -> {ok, ympa_erlang_client_update_goods_feedback_comment_response:ympa_erlang_client_update_goods_feedback_comment_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientUpdateGoodsFeedbackCommentRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback/comments/update"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateGoodsFeedbackCommentRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


