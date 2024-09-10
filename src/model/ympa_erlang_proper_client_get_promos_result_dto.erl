-module(ympa_erlang_proper_client_get_promos_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_promos_result_dto/0]).

-export([ympa_erlang_proper_client_get_promos_result_dto/1]).

-export_type([ympa_erlang_proper_client_get_promos_result_dto/0]).

-type ympa_erlang_proper_client_get_promos_result_dto() ::
  [ {'promos', list(ympa_erlang_proper_client_get_promo_dto:ympa_erlang_proper_client_get_promo_dto()) }
  ].


ympa_erlang_proper_client_get_promos_result_dto() ->
    ympa_erlang_proper_client_get_promos_result_dto([]).

ympa_erlang_proper_client_get_promos_result_dto(Fields) ->
  Default = [ {'promos', list(ympa_erlang_proper_client_get_promo_dto:ympa_erlang_proper_client_get_promo_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

