-module(ympa_erlang_proper_client_order_status_change_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_status_change_dto/0]).

-export([ympa_erlang_proper_client_order_status_change_dto/1]).

-export_type([ympa_erlang_proper_client_order_status_change_dto/0]).

-type ympa_erlang_proper_client_order_status_change_dto() ::
  [ {'status', ympa_erlang_proper_client_order_status_type:ympa_erlang_proper_client_order_status_type() }
  | {'substatus', ympa_erlang_proper_client_order_substatus_type:ympa_erlang_proper_client_order_substatus_type() }
  | {'delivery', ympa_erlang_proper_client_order_status_change_delivery_dto:ympa_erlang_proper_client_order_status_change_delivery_dto() }
  ].


ympa_erlang_proper_client_order_status_change_dto() ->
    ympa_erlang_proper_client_order_status_change_dto([]).

ympa_erlang_proper_client_order_status_change_dto(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_order_status_type:ympa_erlang_proper_client_order_status_type() }
            , {'substatus', ympa_erlang_proper_client_order_substatus_type:ympa_erlang_proper_client_order_substatus_type() }
            , {'delivery', ympa_erlang_proper_client_order_status_change_delivery_dto:ympa_erlang_proper_client_order_status_change_delivery_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

