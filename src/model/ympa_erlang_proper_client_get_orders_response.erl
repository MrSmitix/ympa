-module(ympa_erlang_proper_client_get_orders_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_orders_response/0]).

-export([ympa_erlang_proper_client_get_orders_response/1]).

-export_type([ympa_erlang_proper_client_get_orders_response/0]).

-type ympa_erlang_proper_client_get_orders_response() ::
  [ {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
  | {'orders', list(ympa_erlang_proper_client_order_dto:ympa_erlang_proper_client_order_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_get_orders_response() ->
    ympa_erlang_proper_client_get_orders_response([]).

ympa_erlang_proper_client_get_orders_response(Fields) ->
  Default = [ {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
            , {'orders', list(ympa_erlang_proper_client_order_dto:ympa_erlang_proper_client_order_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

