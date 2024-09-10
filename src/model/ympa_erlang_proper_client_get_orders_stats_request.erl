-module(ympa_erlang_proper_client_get_orders_stats_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_orders_stats_request/0]).

-export([ympa_erlang_proper_client_get_orders_stats_request/1]).

-export_type([ympa_erlang_proper_client_get_orders_stats_request/0]).

-type ympa_erlang_proper_client_get_orders_stats_request() ::
  [ {'dateFrom', date() }
  | {'dateTo', date() }
  | {'updateFrom', date() }
  | {'updateTo', date() }
  | {'orders', list(integer()) }
  | {'statuses', list(ympa_erlang_proper_client_order_stats_status_type:ympa_erlang_proper_client_order_stats_status_type()) }
  | {'hasCis', boolean() }
  ].


ympa_erlang_proper_client_get_orders_stats_request() ->
    ympa_erlang_proper_client_get_orders_stats_request([]).

ympa_erlang_proper_client_get_orders_stats_request(Fields) ->
  Default = [ {'dateFrom', date() }
            , {'dateTo', date() }
            , {'updateFrom', date() }
            , {'updateTo', date() }
            , {'orders', list(integer()) }
            , {'statuses', list(ympa_erlang_proper_client_order_stats_status_type:ympa_erlang_proper_client_order_stats_status_type()) }
            , {'hasCis', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

