-module(ympa_erlang_proper_client_generate_goods_turnover_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_goods_turnover_request/0]).

-export([ympa_erlang_proper_client_generate_goods_turnover_request/1]).

-export_type([ympa_erlang_proper_client_generate_goods_turnover_request/0]).

-type ympa_erlang_proper_client_generate_goods_turnover_request() ::
  [ {'campaignId', integer() }
  | {'date', date() }
  ].


ympa_erlang_proper_client_generate_goods_turnover_request() ->
    ympa_erlang_proper_client_generate_goods_turnover_request([]).

ympa_erlang_proper_client_generate_goods_turnover_request(Fields) ->
  Default = [ {'campaignId', integer() }
            , {'date', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

