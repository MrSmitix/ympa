-module(ympa_erlang_proper_client_order_item_subsidy_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_item_subsidy_type/0]).

-export_type([ympa_erlang_proper_client_order_item_subsidy_type/0]).

-type ympa_erlang_proper_client_order_item_subsidy_type() ::
  binary().

ympa_erlang_proper_client_order_item_subsidy_type() ->
  elements([<<"YANDEX_CASHBACK">>, <<"SUBSIDY">>]).

