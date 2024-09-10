-module(ympa_erlang_proper_client_order_boxes_layout_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_boxes_layout_dto/0]).

-export([ympa_erlang_proper_client_order_boxes_layout_dto/1]).

-export_type([ympa_erlang_proper_client_order_boxes_layout_dto/0]).

-type ympa_erlang_proper_client_order_boxes_layout_dto() ::
  [ {'boxes', list(ympa_erlang_proper_client_enriched_order_box_layout_dto:ympa_erlang_proper_client_enriched_order_box_layout_dto()) }
  ].


ympa_erlang_proper_client_order_boxes_layout_dto() ->
    ympa_erlang_proper_client_order_boxes_layout_dto([]).

ympa_erlang_proper_client_order_boxes_layout_dto(Fields) ->
  Default = [ {'boxes', list(ympa_erlang_proper_client_enriched_order_box_layout_dto:ympa_erlang_proper_client_enriched_order_box_layout_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

