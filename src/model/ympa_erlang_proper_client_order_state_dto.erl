-module(ympa_erlang_proper_client_order_state_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_state_dto/0]).

-export([ympa_erlang_proper_client_order_state_dto/1]).

-export_type([ympa_erlang_proper_client_order_state_dto/0]).

-type ympa_erlang_proper_client_order_state_dto() ::
  [ {'id', integer() }
  | {'status', ympa_erlang_proper_client_order_status_type:ympa_erlang_proper_client_order_status_type() }
  | {'substatus', ympa_erlang_proper_client_order_substatus_type:ympa_erlang_proper_client_order_substatus_type() }
  ].


ympa_erlang_proper_client_order_state_dto() ->
    ympa_erlang_proper_client_order_state_dto([]).

ympa_erlang_proper_client_order_state_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'status', ympa_erlang_proper_client_order_status_type:ympa_erlang_proper_client_order_status_type() }
            , {'substatus', ympa_erlang_proper_client_order_substatus_type:ympa_erlang_proper_client_order_substatus_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

