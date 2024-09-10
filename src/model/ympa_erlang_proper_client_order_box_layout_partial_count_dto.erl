-module(ympa_erlang_proper_client_order_box_layout_partial_count_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_box_layout_partial_count_dto/0]).

-export([ympa_erlang_proper_client_order_box_layout_partial_count_dto/1]).

-export_type([ympa_erlang_proper_client_order_box_layout_partial_count_dto/0]).

-type ympa_erlang_proper_client_order_box_layout_partial_count_dto() ::
  [ {'current', integer() }
  | {'total', integer() }
  ].


ympa_erlang_proper_client_order_box_layout_partial_count_dto() ->
    ympa_erlang_proper_client_order_box_layout_partial_count_dto([]).

ympa_erlang_proper_client_order_box_layout_partial_count_dto(Fields) ->
  Default = [ {'current', integer(1) }
            , {'total', integer(2) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

