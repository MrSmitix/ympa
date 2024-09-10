-module(ympa_erlang_proper_client_set_order_box_layout_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_set_order_box_layout_request/0]).

-export([ympa_erlang_proper_client_set_order_box_layout_request/1]).

-export_type([ympa_erlang_proper_client_set_order_box_layout_request/0]).

-type ympa_erlang_proper_client_set_order_box_layout_request() ::
  [ {'boxes', list(ympa_erlang_proper_client_order_box_layout_dto:ympa_erlang_proper_client_order_box_layout_dto()) }
  | {'allowRemove', boolean() }
  ].


ympa_erlang_proper_client_set_order_box_layout_request() ->
    ympa_erlang_proper_client_set_order_box_layout_request([]).

ympa_erlang_proper_client_set_order_box_layout_request(Fields) ->
  Default = [ {'boxes', list(ympa_erlang_proper_client_order_box_layout_dto:ympa_erlang_proper_client_order_box_layout_dto(), 1) }
            , {'allowRemove', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

