-module(ympa_erlang_proper_client_generate_goods_realization_report_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_goods_realization_report_request/0]).

-export([ympa_erlang_proper_client_generate_goods_realization_report_request/1]).

-export_type([ympa_erlang_proper_client_generate_goods_realization_report_request/0]).

-type ympa_erlang_proper_client_generate_goods_realization_report_request() ::
  [ {'campaignId', integer() }
  | {'year', integer() }
  | {'month', integer() }
  ].


ympa_erlang_proper_client_generate_goods_realization_report_request() ->
    ympa_erlang_proper_client_generate_goods_realization_report_request([]).

ympa_erlang_proper_client_generate_goods_realization_report_request(Fields) ->
  Default = [ {'campaignId', integer() }
            , {'year', integer() }
            , {'month', integer(1, 12) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

