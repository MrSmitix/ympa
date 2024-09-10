-module(ympa_erlang_proper_client_order_item_instance_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_item_instance_type/0]).

-export_type([ympa_erlang_proper_client_order_item_instance_type/0]).

-type ympa_erlang_proper_client_order_item_instance_type() ::
  binary().

ympa_erlang_proper_client_order_item_instance_type() ->
  elements([<<"CIS">>, <<"UIN">>, <<"RNPT">>, <<"GTD">>]).

