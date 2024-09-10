-module(ympa_erlang_client_warning_promo_offer_update_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_warning_promo_offer_update_dto/0]).

-type ympa_erlang_client_warning_promo_offer_update_dto() ::
    #{ 'offerId' := binary(),
       'warnings' := list()
     }.

encode(#{ 'offerId' := OfferId,
          'warnings' := Warnings
        }) ->
    #{ 'offerId' => OfferId,
       'warnings' => Warnings
     }.
