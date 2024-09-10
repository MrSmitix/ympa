-module(ympa_erlang_proper_client_get_goods_stats_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_goods_stats_request/0]).

-export([ympa_erlang_proper_client_get_goods_stats_request/1]).

-export_type([ympa_erlang_proper_client_get_goods_stats_request/0]).

-type ympa_erlang_proper_client_get_goods_stats_request() ::
  [ {'shopSkus', list(binary()) }
  ].


ympa_erlang_proper_client_get_goods_stats_request() ->
    ympa_erlang_proper_client_get_goods_stats_request([]).

ympa_erlang_proper_client_get_goods_stats_request(Fields) ->
  Default = [ {'shopSkus', list(binary(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

