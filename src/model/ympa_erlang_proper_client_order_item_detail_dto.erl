-module(ympa_erlang_proper_client_order_item_detail_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_item_detail_dto/0]).

-export([ympa_erlang_proper_client_order_item_detail_dto/1]).

-export_type([ympa_erlang_proper_client_order_item_detail_dto/0]).

-type ympa_erlang_proper_client_order_item_detail_dto() ::
  [ {'itemCount', integer() }
  | {'itemStatus', ympa_erlang_proper_client_order_item_status_type:ympa_erlang_proper_client_order_item_status_type() }
  | {'updateDate', binary() }
  ].


ympa_erlang_proper_client_order_item_detail_dto() ->
    ympa_erlang_proper_client_order_item_detail_dto([]).

ympa_erlang_proper_client_order_item_detail_dto(Fields) ->
  Default = [ {'itemCount', integer() }
            , {'itemStatus', ympa_erlang_proper_client_order_item_status_type:ympa_erlang_proper_client_order_item_status_type() }
            , {'updateDate', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

