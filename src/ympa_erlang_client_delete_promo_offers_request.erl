-module(ympa_erlang_client_delete_promo_offers_request).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_promo_offers_request/0]).

-type ympa_erlang_client_delete_promo_offers_request() ::
    #{ 'promoId' := binary(),
       'deleteAllOffers' => boolean(),
       'offerIds' => list()
     }.

encode(#{ 'promoId' := PromoId,
          'deleteAllOffers' := DeleteAllOffers,
          'offerIds' := OfferIds
        }) ->
    #{ 'promoId' => PromoId,
       'deleteAllOffers' => DeleteAllOffers,
       'offerIds' => OfferIds
     }.
