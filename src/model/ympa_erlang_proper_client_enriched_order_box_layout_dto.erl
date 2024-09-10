-module(ympa_erlang_proper_client_enriched_order_box_layout_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_enriched_order_box_layout_dto/0]).

-export([ympa_erlang_proper_client_enriched_order_box_layout_dto/1]).

-export_type([ympa_erlang_proper_client_enriched_order_box_layout_dto/0]).

-type ympa_erlang_proper_client_enriched_order_box_layout_dto() ::
  [ {'items', list(ympa_erlang_proper_client_order_box_layout_item_dto:ympa_erlang_proper_client_order_box_layout_item_dto()) }
  | {'boxId', integer() }
  ].


ympa_erlang_proper_client_enriched_order_box_layout_dto() ->
    ympa_erlang_proper_client_enriched_order_box_layout_dto([]).

ympa_erlang_proper_client_enriched_order_box_layout_dto(Fields) ->
  Default = [ {'items', list(ympa_erlang_proper_client_order_box_layout_item_dto:ympa_erlang_proper_client_order_box_layout_item_dto(), 1) }
            , {'boxId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

