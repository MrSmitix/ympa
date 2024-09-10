-module(ympa_erlang_proper_client_generate_stocks_on_warehouses_report_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_stocks_on_warehouses_report_request/0]).

-export([ympa_erlang_proper_client_generate_stocks_on_warehouses_report_request/1]).

-export_type([ympa_erlang_proper_client_generate_stocks_on_warehouses_report_request/0]).

-type ympa_erlang_proper_client_generate_stocks_on_warehouses_report_request() ::
  [ {'campaignId', integer() }
  | {'warehouseIds', list(integer()) }
  | {'reportDate', date() }
  | {'categoryIds', list(integer()) }
  | {'hasStocks', boolean() }
  ].


ympa_erlang_proper_client_generate_stocks_on_warehouses_report_request() ->
    ympa_erlang_proper_client_generate_stocks_on_warehouses_report_request([]).

ympa_erlang_proper_client_generate_stocks_on_warehouses_report_request(Fields) ->
  Default = [ {'campaignId', integer() }
            , {'warehouseIds', list(integer()) }
            , {'reportDate', date() }
            , {'categoryIds', list(integer()) }
            , {'hasStocks', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

