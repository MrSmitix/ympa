-module(ympa_erlang_client_outlet_working_schedule_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_outlet_working_schedule_dto/0]).

-type ympa_erlang_client_outlet_working_schedule_dto() ::
    #{ 'workInHoliday' => boolean(),
       'scheduleItems' := list()
     }.

encode(#{ 'workInHoliday' := WorkInHoliday,
          'scheduleItems' := ScheduleItems
        }) ->
    #{ 'workInHoliday' => WorkInHoliday,
       'scheduleItems' => ScheduleItems
     }.
