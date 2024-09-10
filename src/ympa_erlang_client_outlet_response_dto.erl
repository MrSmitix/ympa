-module(ympa_erlang_client_outlet_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_outlet_response_dto/0]).

-type ympa_erlang_client_outlet_response_dto() ::
    #{ 'id' => integer()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
