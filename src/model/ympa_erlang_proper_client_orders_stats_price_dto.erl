-module(ympa_erlang_proper_client_orders_stats_price_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_price_dto/0]).

-export([ympa_erlang_proper_client_orders_stats_price_dto/1]).

-export_type([ympa_erlang_proper_client_orders_stats_price_dto/0]).

-type ympa_erlang_proper_client_orders_stats_price_dto() ::
  [ {'type', ympa_erlang_proper_client_orders_stats_price_type:ympa_erlang_proper_client_orders_stats_price_type() }
  | {'costPerItem', integer() }
  | {'total', integer() }
  ].


ympa_erlang_proper_client_orders_stats_price_dto() ->
    ympa_erlang_proper_client_orders_stats_price_dto([]).

ympa_erlang_proper_client_orders_stats_price_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_orders_stats_price_type:ympa_erlang_proper_client_orders_stats_price_type() }
            , {'costPerItem', integer() }
            , {'total', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

