-module(ympa_erlang_proper_client_feedback_order_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feedback_order_dto/0]).

-export([ympa_erlang_proper_client_feedback_order_dto/1]).

-export_type([ympa_erlang_proper_client_feedback_order_dto/0]).

-type ympa_erlang_proper_client_feedback_order_dto() ::
  [ {'shopOrderId', binary() }
  | {'delivery', ympa_erlang_proper_client_feedback_delivery_type:ympa_erlang_proper_client_feedback_delivery_type() }
  ].


ympa_erlang_proper_client_feedback_order_dto() ->
    ympa_erlang_proper_client_feedback_order_dto([]).

ympa_erlang_proper_client_feedback_order_dto(Fields) ->
  Default = [ {'shopOrderId', binary() }
            , {'delivery', ympa_erlang_proper_client_feedback_delivery_type:ympa_erlang_proper_client_feedback_delivery_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

