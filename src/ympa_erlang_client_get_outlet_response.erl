-module(ympa_erlang_client_get_outlet_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_outlet_response/0]).

-type ympa_erlang_client_get_outlet_response() ::
    #{ 'outlet' => ympa_erlang_client_full_outlet_dto:ympa_erlang_client_full_outlet_dto()
     }.

encode(#{ 'outlet' := Outlet
        }) ->
    #{ 'outlet' => Outlet
     }.
