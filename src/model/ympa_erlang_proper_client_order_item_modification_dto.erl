-module(ympa_erlang_proper_client_order_item_modification_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_item_modification_dto/0]).

-export([ympa_erlang_proper_client_order_item_modification_dto/1]).

-export_type([ympa_erlang_proper_client_order_item_modification_dto/0]).

-type ympa_erlang_proper_client_order_item_modification_dto() ::
  [ {'id', integer() }
  | {'count', integer() }
  | {'instances', list(ympa_erlang_proper_client_brief_order_item_instance_dto:ympa_erlang_proper_client_brief_order_item_instance_dto()) }
  ].


ympa_erlang_proper_client_order_item_modification_dto() ->
    ympa_erlang_proper_client_order_item_modification_dto([]).

ympa_erlang_proper_client_order_item_modification_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'count', integer(0) }
            , {'instances', list(ympa_erlang_proper_client_brief_order_item_instance_dto:ympa_erlang_proper_client_brief_order_item_instance_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

