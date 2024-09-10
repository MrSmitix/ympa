-module(ympa_erlang_client_delete_promo_offers_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_promo_offers_result_dto/0]).

-type ympa_erlang_client_delete_promo_offers_result_dto() ::
    #{ 'rejectedOffers' => list()
     }.

encode(#{ 'rejectedOffers' := RejectedOffers
        }) ->
    #{ 'rejectedOffers' => RejectedOffers
     }.
