-module(ympa_erlang_proper_client_orders_stats_commission_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_commission_dto/0]).

-export([ympa_erlang_proper_client_orders_stats_commission_dto/1]).

-export_type([ympa_erlang_proper_client_orders_stats_commission_dto/0]).

-type ympa_erlang_proper_client_orders_stats_commission_dto() ::
  [ {'type', ympa_erlang_proper_client_orders_stats_commission_type:ympa_erlang_proper_client_orders_stats_commission_type() }
  | {'actual', integer() }
  ].


ympa_erlang_proper_client_orders_stats_commission_dto() ->
    ympa_erlang_proper_client_orders_stats_commission_dto([]).

ympa_erlang_proper_client_orders_stats_commission_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_orders_stats_commission_type:ympa_erlang_proper_client_orders_stats_commission_type() }
            , {'actual', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

