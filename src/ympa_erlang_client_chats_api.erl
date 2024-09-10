-module(ympa_erlang_client_chats_api).

-export([create_chat/3, create_chat/4,
         get_chat_history/4, get_chat_history/5,
         get_chats/3, get_chats/4,
         send_file_to_chat/4, send_file_to_chat/5,
         send_message_to_chat/4, send_message_to_chat/5]).

-define(BASE_URL, <<"">>).

%% @doc Создание нового чата с покупателем
%% Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec create_chat(ctx:ctx(), integer(), ympa_erlang_client_create_chat_request:ympa_erlang_client_create_chat_request()) -> {ok, ympa_erlang_client_create_chat_response:ympa_erlang_client_create_chat_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
create_chat(Ctx, BusinessId, YmpaErlangClientCreateChatRequest) ->
    create_chat(Ctx, BusinessId, YmpaErlangClientCreateChatRequest, #{}).

-spec create_chat(ctx:ctx(), integer(), ympa_erlang_client_create_chat_request:ympa_erlang_client_create_chat_request(), maps:map()) -> {ok, ympa_erlang_client_create_chat_response:ympa_erlang_client_create_chat_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
create_chat(Ctx, BusinessId, YmpaErlangClientCreateChatRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats/new"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientCreateChatRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение истории сообщений в чате
%% Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec get_chat_history(ctx:ctx(), integer(), integer(), ympa_erlang_client_get_chat_history_request:ympa_erlang_client_get_chat_history_request()) -> {ok, ympa_erlang_client_get_chat_history_response:ympa_erlang_client_get_chat_history_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_chat_history(Ctx, BusinessId, ChatId, YmpaErlangClientGetChatHistoryRequest) ->
    get_chat_history(Ctx, BusinessId, ChatId, YmpaErlangClientGetChatHistoryRequest, #{}).

-spec get_chat_history(ctx:ctx(), integer(), integer(), ympa_erlang_client_get_chat_history_request:ympa_erlang_client_get_chat_history_request(), maps:map()) -> {ok, ympa_erlang_client_get_chat_history_response:ympa_erlang_client_get_chat_history_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_chat_history(Ctx, BusinessId, ChatId, YmpaErlangClientGetChatHistoryRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats/history"],
    QS = lists:flatten([{<<"chatId">>, ChatId}])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetChatHistoryRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение доступных чатов
%% Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec get_chats(ctx:ctx(), integer(), ympa_erlang_client_get_chats_request:ympa_erlang_client_get_chats_request()) -> {ok, ympa_erlang_client_get_chats_response:ympa_erlang_client_get_chats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_chats(Ctx, BusinessId, YmpaErlangClientGetChatsRequest) ->
    get_chats(Ctx, BusinessId, YmpaErlangClientGetChatsRequest, #{}).

-spec get_chats(ctx:ctx(), integer(), ympa_erlang_client_get_chats_request:ympa_erlang_client_get_chats_request(), maps:map()) -> {ok, ympa_erlang_client_get_chats_response:ympa_erlang_client_get_chats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_chats(Ctx, BusinessId, YmpaErlangClientGetChatsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetChatsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отправка файла в чат
%% Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec send_file_to_chat(ctx:ctx(), integer(), integer(), binary()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
send_file_to_chat(Ctx, BusinessId, ChatId, File) ->
    send_file_to_chat(Ctx, BusinessId, ChatId, File, #{}).

-spec send_file_to_chat(ctx:ctx(), integer(), integer(), binary(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
send_file_to_chat(Ctx, BusinessId, ChatId, File, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats/file/send"],
    QS = lists:flatten([{<<"chatId">>, ChatId}])++ympa_erlang_client_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = {form, [{<<"file">>, File}]++ympa_erlang_client_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отправка сообщения в чат
%% Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec send_message_to_chat(ctx:ctx(), integer(), integer(), ympa_erlang_client_send_message_to_chat_request:ympa_erlang_client_send_message_to_chat_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
send_message_to_chat(Ctx, BusinessId, ChatId, YmpaErlangClientSendMessageToChatRequest) ->
    send_message_to_chat(Ctx, BusinessId, ChatId, YmpaErlangClientSendMessageToChatRequest, #{}).

-spec send_message_to_chat(ctx:ctx(), integer(), integer(), ympa_erlang_client_send_message_to_chat_request:ympa_erlang_client_send_message_to_chat_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
send_message_to_chat(Ctx, BusinessId, ChatId, YmpaErlangClientSendMessageToChatRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats/message"],
    QS = lists:flatten([{<<"chatId">>, ChatId}])++ympa_erlang_client_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientSendMessageToChatRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


