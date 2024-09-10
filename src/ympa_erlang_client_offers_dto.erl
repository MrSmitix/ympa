-module(ympa_erlang_client_offers_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offers_dto/0]).

-type ympa_erlang_client_offers_dto() ::
    #{ 'offers' := list()
     }.

encode(#{ 'offers' := Offers
        }) ->
    #{ 'offers' => Offers
     }.
