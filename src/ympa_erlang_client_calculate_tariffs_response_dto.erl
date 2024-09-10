-module(ympa_erlang_client_calculate_tariffs_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_calculate_tariffs_response_dto/0]).

-type ympa_erlang_client_calculate_tariffs_response_dto() ::
    #{ 'offers' := list()
     }.

encode(#{ 'offers' := Offers
        }) ->
    #{ 'offers' => Offers
     }.
