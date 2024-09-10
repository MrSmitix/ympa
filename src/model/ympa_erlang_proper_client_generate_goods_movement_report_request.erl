-module(ympa_erlang_proper_client_generate_goods_movement_report_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_goods_movement_report_request/0]).

-export([ympa_erlang_proper_client_generate_goods_movement_report_request/1]).

-export_type([ympa_erlang_proper_client_generate_goods_movement_report_request/0]).

-type ympa_erlang_proper_client_generate_goods_movement_report_request() ::
  [ {'campaignId', integer() }
  | {'dateFrom', date() }
  | {'dateTo', date() }
  | {'shopSku', binary() }
  ].


ympa_erlang_proper_client_generate_goods_movement_report_request() ->
    ympa_erlang_proper_client_generate_goods_movement_report_request([]).

ympa_erlang_proper_client_generate_goods_movement_report_request(Fields) ->
  Default = [ {'campaignId', integer() }
            , {'dateFrom', date() }
            , {'dateTo', date() }
            , {'shopSku', binary(1, 255) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

