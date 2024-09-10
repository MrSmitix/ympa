-module(ympa_erlang_proper_client_generate_goods_feedback_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_goods_feedback_request/0]).

-export([ympa_erlang_proper_client_generate_goods_feedback_request/1]).

-export_type([ympa_erlang_proper_client_generate_goods_feedback_request/0]).

-type ympa_erlang_proper_client_generate_goods_feedback_request() ::
  [ {'businessId', integer() }
  ].


ympa_erlang_proper_client_generate_goods_feedback_request() ->
    ympa_erlang_proper_client_generate_goods_feedback_request([]).

ympa_erlang_proper_client_generate_goods_feedback_request(Fields) ->
  Default = [ {'businessId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

