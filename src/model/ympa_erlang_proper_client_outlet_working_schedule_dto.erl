-module(ympa_erlang_proper_client_outlet_working_schedule_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_outlet_working_schedule_dto/0]).

-export([ympa_erlang_proper_client_outlet_working_schedule_dto/1]).

-export_type([ympa_erlang_proper_client_outlet_working_schedule_dto/0]).

-type ympa_erlang_proper_client_outlet_working_schedule_dto() ::
  [ {'workInHoliday', boolean() }
  | {'scheduleItems', list(ympa_erlang_proper_client_outlet_working_schedule_item_dto:ympa_erlang_proper_client_outlet_working_schedule_item_dto()) }
  ].


ympa_erlang_proper_client_outlet_working_schedule_dto() ->
    ympa_erlang_proper_client_outlet_working_schedule_dto([]).

ympa_erlang_proper_client_outlet_working_schedule_dto(Fields) ->
  Default = [ {'workInHoliday', boolean() }
            , {'scheduleItems', list(ympa_erlang_proper_client_outlet_working_schedule_item_dto:ympa_erlang_proper_client_outlet_working_schedule_item_dto(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

