-module(ympa_erlang_client_update_promo_offers_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_promo_offers_result_dto/0]).

-type ympa_erlang_client_update_promo_offers_result_dto() ::
    #{ 'rejectedOffers' => list(),
       'warningOffers' => list()
     }.

encode(#{ 'rejectedOffers' := RejectedOffers,
          'warningOffers' := WarningOffers
        }) ->
    #{ 'rejectedOffers' => RejectedOffers,
       'warningOffers' => WarningOffers
     }.
