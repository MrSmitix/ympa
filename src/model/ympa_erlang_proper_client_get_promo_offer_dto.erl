-module(ympa_erlang_proper_client_get_promo_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_promo_offer_dto/0]).

-export([ympa_erlang_proper_client_get_promo_offer_dto/1]).

-export_type([ympa_erlang_proper_client_get_promo_offer_dto/0]).

-type ympa_erlang_proper_client_get_promo_offer_dto() ::
  [ {'offerId', binary() }
  | {'status', ympa_erlang_proper_client_promo_offer_participation_status_type:ympa_erlang_proper_client_promo_offer_participation_status_type() }
  | {'params', ympa_erlang_proper_client_promo_offer_params_dto:ympa_erlang_proper_client_promo_offer_params_dto() }
  | {'autoParticipatingDetails', ympa_erlang_proper_client_promo_offer_auto_participating_details_dto:ympa_erlang_proper_client_promo_offer_auto_participating_details_dto() }
  ].


ympa_erlang_proper_client_get_promo_offer_dto() ->
    ympa_erlang_proper_client_get_promo_offer_dto([]).

ympa_erlang_proper_client_get_promo_offer_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'status', ympa_erlang_proper_client_promo_offer_participation_status_type:ympa_erlang_proper_client_promo_offer_participation_status_type() }
            , {'params', ympa_erlang_proper_client_promo_offer_params_dto:ympa_erlang_proper_client_promo_offer_params_dto() }
            , {'autoParticipatingDetails', ympa_erlang_proper_client_promo_offer_auto_participating_details_dto:ympa_erlang_proper_client_promo_offer_auto_participating_details_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

