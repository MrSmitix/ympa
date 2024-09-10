-module(ympa_erlang_proper_client_promo_offer_update_warning_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_promo_offer_update_warning_dto/0]).

-export([ympa_erlang_proper_client_promo_offer_update_warning_dto/1]).

-export_type([ympa_erlang_proper_client_promo_offer_update_warning_dto/0]).

-type ympa_erlang_proper_client_promo_offer_update_warning_dto() ::
  [ {'code', ympa_erlang_proper_client_promo_offer_update_warning_code_type:ympa_erlang_proper_client_promo_offer_update_warning_code_type() }
  | {'campaignIds', list(integer()) }
  ].


ympa_erlang_proper_client_promo_offer_update_warning_dto() ->
    ympa_erlang_proper_client_promo_offer_update_warning_dto([]).

ympa_erlang_proper_client_promo_offer_update_warning_dto(Fields) ->
  Default = [ {'code', ympa_erlang_proper_client_promo_offer_update_warning_code_type:ympa_erlang_proper_client_promo_offer_update_warning_code_type() }
            , {'campaignIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

