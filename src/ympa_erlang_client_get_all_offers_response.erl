-module(ympa_erlang_client_get_all_offers_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_all_offers_response/0]).

-type ympa_erlang_client_get_all_offers_response() ::
    #{ 'offers' := list()
     }.

encode(#{ 'offers' := Offers
        }) ->
    #{ 'offers' => Offers
     }.
