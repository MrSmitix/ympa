-module(ympa_erlang_client_get_suggested_offer_mappings_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_suggested_offer_mappings_result_dto/0]).

-type ympa_erlang_client_get_suggested_offer_mappings_result_dto() ::
    #{ 'offers' := list()
     }.

encode(#{ 'offers' := Offers
        }) ->
    #{ 'offers' => Offers
     }.
