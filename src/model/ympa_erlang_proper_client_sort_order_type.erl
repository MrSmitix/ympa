-module(ympa_erlang_proper_client_sort_order_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_sort_order_type/0]).

-export_type([ympa_erlang_proper_client_sort_order_type/0]).

-type ympa_erlang_proper_client_sort_order_type() ::
  binary().

ympa_erlang_proper_client_sort_order_type() ->
  elements([<<"ASC">>, <<"DESC">>]).

