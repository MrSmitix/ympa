-module(ympa_erlang_proper_client_goods_stats_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_stats_dto/0]).

-export([ympa_erlang_proper_client_goods_stats_dto/1]).

-export_type([ympa_erlang_proper_client_goods_stats_dto/0]).

-type ympa_erlang_proper_client_goods_stats_dto() ::
  [ {'shopSkus', list(ympa_erlang_proper_client_goods_stats_goods_dto:ympa_erlang_proper_client_goods_stats_goods_dto()) }
  ].


ympa_erlang_proper_client_goods_stats_dto() ->
    ympa_erlang_proper_client_goods_stats_dto([]).

ympa_erlang_proper_client_goods_stats_dto(Fields) ->
  Default = [ {'shopSkus', list(ympa_erlang_proper_client_goods_stats_goods_dto:ympa_erlang_proper_client_goods_stats_goods_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

