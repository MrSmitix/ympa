-module(ympa_erlang_client_api_error_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_api_error_dto/0]).

-type ympa_erlang_client_api_error_dto() ::
    #{ 'code' := binary(),
       'message' => binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
