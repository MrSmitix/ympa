-module(ympa_erlang_proper_client_outlet_working_schedule_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_outlet_working_schedule_item_dto/0]).

-export([ympa_erlang_proper_client_outlet_working_schedule_item_dto/1]).

-export_type([ympa_erlang_proper_client_outlet_working_schedule_item_dto/0]).

-type ympa_erlang_proper_client_outlet_working_schedule_item_dto() ::
  [ {'startDay', ympa_erlang_proper_client_day_of_week_type:ympa_erlang_proper_client_day_of_week_type() }
  | {'endDay', ympa_erlang_proper_client_day_of_week_type:ympa_erlang_proper_client_day_of_week_type() }
  | {'startTime', binary() }
  | {'endTime', binary() }
  ].


ympa_erlang_proper_client_outlet_working_schedule_item_dto() ->
    ympa_erlang_proper_client_outlet_working_schedule_item_dto([]).

ympa_erlang_proper_client_outlet_working_schedule_item_dto(Fields) ->
  Default = [ {'startDay', ympa_erlang_proper_client_day_of_week_type:ympa_erlang_proper_client_day_of_week_type() }
            , {'endDay', ympa_erlang_proper_client_day_of_week_type:ympa_erlang_proper_client_day_of_week_type() }
            , {'startTime', binary(1) }
            , {'endTime', binary(1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

