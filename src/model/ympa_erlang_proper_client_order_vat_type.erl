-module(ympa_erlang_proper_client_order_vat_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_vat_type/0]).

-export_type([ympa_erlang_proper_client_order_vat_type/0]).

-type ympa_erlang_proper_client_order_vat_type() ::
  binary().

ympa_erlang_proper_client_order_vat_type() ->
  elements([<<"NO_VAT">>, <<"VAT_0">>, <<"VAT_10">>, <<"VAT_10_110">>, <<"VAT_20">>, <<"VAT_20_120">>, <<"VAT_18">>, <<"VAT_18_118">>, <<"UNKNOWN_VALUE">>]).

