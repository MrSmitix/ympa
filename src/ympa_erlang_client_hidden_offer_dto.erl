-module(ympa_erlang_client_hidden_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_hidden_offer_dto/0]).

-type ympa_erlang_client_hidden_offer_dto() ::
    #{ 'offerId' := binary()
     }.

encode(#{ 'offerId' := OfferId
        }) ->
    #{ 'offerId' => OfferId
     }.
