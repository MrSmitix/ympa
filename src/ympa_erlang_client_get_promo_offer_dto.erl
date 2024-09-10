-module(ympa_erlang_client_get_promo_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_offer_dto/0]).

-type ympa_erlang_client_get_promo_offer_dto() ::
    #{ 'offerId' := binary(),
       'status' := ympa_erlang_client_promo_offer_participation_status_type:ympa_erlang_client_promo_offer_participation_status_type(),
       'params' := ympa_erlang_client_promo_offer_params_dto:ympa_erlang_client_promo_offer_params_dto(),
       'autoParticipatingDetails' => ympa_erlang_client_promo_offer_auto_participating_details_dto:ympa_erlang_client_promo_offer_auto_participating_details_dto()
     }.

encode(#{ 'offerId' := OfferId,
          'status' := Status,
          'params' := Params,
          'autoParticipatingDetails' := AutoParticipatingDetails
        }) ->
    #{ 'offerId' => OfferId,
       'status' => Status,
       'params' => Params,
       'autoParticipatingDetails' => AutoParticipatingDetails
     }.
