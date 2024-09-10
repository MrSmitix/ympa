-module(ympa_erlang_client_update_business_offer_price_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_business_offer_price_dto/0]).

-type ympa_erlang_client_update_business_offer_price_dto() ::
    #{ 'offerId' := binary(),
       'price' := ympa_erlang_client_update_price_with_discount_dto:ympa_erlang_client_update_price_with_discount_dto()
     }.

encode(#{ 'offerId' := OfferId,
          'price' := Price
        }) ->
    #{ 'offerId' => OfferId,
       'price' => Price
     }.
