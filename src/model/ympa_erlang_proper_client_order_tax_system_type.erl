-module(ympa_erlang_proper_client_order_tax_system_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_tax_system_type/0]).

-export_type([ympa_erlang_proper_client_order_tax_system_type/0]).

-type ympa_erlang_proper_client_order_tax_system_type() ::
  binary().

ympa_erlang_proper_client_order_tax_system_type() ->
  elements([<<"OSN">>, <<"USN">>, <<"USN_MINUS_COST">>, <<"ENVD">>, <<"ECHN">>, <<"PSN">>, <<"NPD">>, <<"UNKNOWN_VALUE">>]).

