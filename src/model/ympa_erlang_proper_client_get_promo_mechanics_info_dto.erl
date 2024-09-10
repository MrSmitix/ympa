-module(ympa_erlang_proper_client_get_promo_mechanics_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_promo_mechanics_info_dto/0]).

-export([ympa_erlang_proper_client_get_promo_mechanics_info_dto/1]).

-export_type([ympa_erlang_proper_client_get_promo_mechanics_info_dto/0]).

-type ympa_erlang_proper_client_get_promo_mechanics_info_dto() ::
  [ {'type', ympa_erlang_proper_client_mechanics_type:ympa_erlang_proper_client_mechanics_type() }
  | {'promocodeInfo', ympa_erlang_proper_client_get_promo_promocode_info_dto:ympa_erlang_proper_client_get_promo_promocode_info_dto() }
  ].


ympa_erlang_proper_client_get_promo_mechanics_info_dto() ->
    ympa_erlang_proper_client_get_promo_mechanics_info_dto([]).

ympa_erlang_proper_client_get_promo_mechanics_info_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_mechanics_type:ympa_erlang_proper_client_mechanics_type() }
            , {'promocodeInfo', ympa_erlang_proper_client_get_promo_promocode_info_dto:ympa_erlang_proper_client_get_promo_promocode_info_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

