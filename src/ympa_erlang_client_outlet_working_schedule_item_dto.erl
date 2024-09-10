-module(ympa_erlang_client_outlet_working_schedule_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_outlet_working_schedule_item_dto/0]).

-type ympa_erlang_client_outlet_working_schedule_item_dto() ::
    #{ 'startDay' := ympa_erlang_client_day_of_week_type:ympa_erlang_client_day_of_week_type(),
       'endDay' := ympa_erlang_client_day_of_week_type:ympa_erlang_client_day_of_week_type(),
       'startTime' := binary(),
       'endTime' := binary()
     }.

encode(#{ 'startDay' := StartDay,
          'endDay' := EndDay,
          'startTime' := StartTime,
          'endTime' := EndTime
        }) ->
    #{ 'startDay' => StartDay,
       'endDay' => EndDay,
       'startTime' => StartTime,
       'endTime' => EndTime
     }.
