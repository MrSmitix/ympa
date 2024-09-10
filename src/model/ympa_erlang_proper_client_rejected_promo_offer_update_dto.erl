-module(ympa_erlang_proper_client_rejected_promo_offer_update_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_rejected_promo_offer_update_dto/0]).

-export([ympa_erlang_proper_client_rejected_promo_offer_update_dto/1]).

-export_type([ympa_erlang_proper_client_rejected_promo_offer_update_dto/0]).

-type ympa_erlang_proper_client_rejected_promo_offer_update_dto() ::
  [ {'offerId', binary() }
  | {'reason', ympa_erlang_proper_client_rejected_promo_offer_update_reason_type:ympa_erlang_proper_client_rejected_promo_offer_update_reason_type() }
  ].


ympa_erlang_proper_client_rejected_promo_offer_update_dto() ->
    ympa_erlang_proper_client_rejected_promo_offer_update_dto([]).

ympa_erlang_proper_client_rejected_promo_offer_update_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'reason', ympa_erlang_proper_client_rejected_promo_offer_update_reason_type:ympa_erlang_proper_client_rejected_promo_offer_update_reason_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

