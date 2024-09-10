-module(ympa_erlang_server_default_logic_handler).

-behaviour(ympa_erlang_server_logic_handler).

-export([handle_request/3]).


-spec handle_request(
    OperationID :: ympa_erlang_server_api:operation_id(),
    Req :: cowboy_req:req(),
    Context :: #{}
) ->
    {Status :: cowboy:http_status(), Headers :: cowboy:http_headers(), Body :: jsx:json_term()}.

handle_request(OperationID, Req, Context) ->
    error_logger:error_msg(
        "Got not implemented request to process: ~p~n",
        [{OperationID, Req, Context}]
    ),
    {501, #{}, #{}}.
