-module(ympa_erlang_client_get_promo_offers_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_offers_request/0]).

-type ympa_erlang_client_get_promo_offers_request() ::
    #{ 'promoId' := binary(),
       'statusType' => ympa_erlang_client_promo_offer_participation_status_filter_type:ympa_erlang_client_promo_offer_participation_status_filter_type()
     }.

encode(#{ 'promoId' := PromoId,
          'statusType' := StatusType
        }) ->
    #{ 'promoId' => PromoId,
       'statusType' => StatusType
     }.
