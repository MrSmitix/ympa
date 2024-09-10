-module(ympa_erlang_proper_client_warning_promo_offer_update_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_warning_promo_offer_update_dto/0]).

-export([ympa_erlang_proper_client_warning_promo_offer_update_dto/1]).

-export_type([ympa_erlang_proper_client_warning_promo_offer_update_dto/0]).

-type ympa_erlang_proper_client_warning_promo_offer_update_dto() ::
  [ {'offerId', binary() }
  | {'warnings', list(ympa_erlang_proper_client_promo_offer_update_warning_dto:ympa_erlang_proper_client_promo_offer_update_warning_dto()) }
  ].


ympa_erlang_proper_client_warning_promo_offer_update_dto() ->
    ympa_erlang_proper_client_warning_promo_offer_update_dto([]).

ympa_erlang_proper_client_warning_promo_offer_update_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'warnings', list(ympa_erlang_proper_client_promo_offer_update_warning_dto:ympa_erlang_proper_client_promo_offer_update_warning_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

