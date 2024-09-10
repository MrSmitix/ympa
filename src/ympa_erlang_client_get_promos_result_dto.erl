-module(ympa_erlang_client_get_promos_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promos_result_dto/0]).

-type ympa_erlang_client_get_promos_result_dto() ::
    #{ 'promos' := list()
     }.

encode(#{ 'promos' := Promos
        }) ->
    #{ 'promos' => Promos
     }.
