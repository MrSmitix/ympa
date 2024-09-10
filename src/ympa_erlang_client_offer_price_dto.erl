-module(ympa_erlang_client_offer_price_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_price_dto/0]).

-type ympa_erlang_client_offer_price_dto() ::
    #{ 'offerId' => binary(),
       'price' => ympa_erlang_client_price_dto:ympa_erlang_client_price_dto()
     }.

encode(#{ 'offerId' := OfferId,
          'price' := Price
        }) ->
    #{ 'offerId' => OfferId,
       'price' => Price
     }.
