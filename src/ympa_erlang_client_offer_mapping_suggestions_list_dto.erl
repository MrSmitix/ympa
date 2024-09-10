-module(ympa_erlang_client_offer_mapping_suggestions_list_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_mapping_suggestions_list_dto/0]).

-type ympa_erlang_client_offer_mapping_suggestions_list_dto() ::
    #{ 'offers' := list()
     }.

encode(#{ 'offers' := Offers
        }) ->
    #{ 'offers' => Offers
     }.
