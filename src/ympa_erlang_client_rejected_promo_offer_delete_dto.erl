-module(ympa_erlang_client_rejected_promo_offer_delete_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_rejected_promo_offer_delete_dto/0]).

-type ympa_erlang_client_rejected_promo_offer_delete_dto() ::
    #{ 'offerId' := binary(),
       'reason' := ympa_erlang_client_rejected_promo_offer_delete_reason_type:ympa_erlang_client_rejected_promo_offer_delete_reason_type()
     }.

encode(#{ 'offerId' := OfferId,
          'reason' := Reason
        }) ->
    #{ 'offerId' => OfferId,
       'reason' => Reason
     }.
