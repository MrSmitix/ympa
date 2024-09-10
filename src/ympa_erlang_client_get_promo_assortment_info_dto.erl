-module(ympa_erlang_client_get_promo_assortment_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_assortment_info_dto/0]).

-type ympa_erlang_client_get_promo_assortment_info_dto() ::
    #{ 'activeOffers' := integer(),
       'potentialOffers' => integer(),
       'processing' => boolean()
     }.

encode(#{ 'activeOffers' := ActiveOffers,
          'potentialOffers' := PotentialOffers,
          'processing' := Processing
        }) ->
    #{ 'activeOffers' => ActiveOffers,
       'potentialOffers' => PotentialOffers,
       'processing' => Processing
     }.
