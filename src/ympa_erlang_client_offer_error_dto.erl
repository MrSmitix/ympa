-module(ympa_erlang_client_offer_error_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_error_dto/0]).

-type ympa_erlang_client_offer_error_dto() ::
    #{ 'message' => binary(),
       'comment' => binary()
     }.

encode(#{ 'message' := Message,
          'comment' := Comment
        }) ->
    #{ 'message' => Message,
       'comment' => Comment
     }.
