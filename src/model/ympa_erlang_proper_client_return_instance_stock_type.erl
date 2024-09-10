-module(ympa_erlang_proper_client_return_instance_stock_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_instance_stock_type/0]).

-export_type([ympa_erlang_proper_client_return_instance_stock_type/0]).

-type ympa_erlang_proper_client_return_instance_stock_type() ::
  binary().

ympa_erlang_proper_client_return_instance_stock_type() ->
  elements([<<"FIT">>, <<"DEFECT">>, <<"ANOMALY">>, <<"SURPLUS">>, <<"EXPIRED">>, <<"MISGRADING">>, <<"UNDEFINED">>, <<"INCORRECT_IMEI">>, <<"INCORRECT_SERIAL_NUMBER">>, <<"INCORRECT_CIS">>, <<"PART_MISSING">>, <<"NON_COMPLIENT">>, <<"NOT_ACCEPTABLE">>, <<"SERVICE">>, <<"MARKDOWN">>, <<"DEMO">>, <<"REPAIR">>, <<"FIRMWARE">>, <<"UNKNOWN">>]).

