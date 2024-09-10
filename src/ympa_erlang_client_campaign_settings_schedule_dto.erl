-module(ympa_erlang_client_campaign_settings_schedule_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_campaign_settings_schedule_dto/0]).

-type ympa_erlang_client_campaign_settings_schedule_dto() ::
    #{ 'availableOnHolidays' => boolean(),
       'customHolidays' := list(),
       'customWorkingDays' := list(),
       'period' => ympa_erlang_client_campaign_settings_time_period_dto:ympa_erlang_client_campaign_settings_time_period_dto(),
       'totalHolidays' := list(),
       'weeklyHolidays' := list()
     }.

encode(#{ 'availableOnHolidays' := AvailableOnHolidays,
          'customHolidays' := CustomHolidays,
          'customWorkingDays' := CustomWorkingDays,
          'period' := Period,
          'totalHolidays' := TotalHolidays,
          'weeklyHolidays' := WeeklyHolidays
        }) ->
    #{ 'availableOnHolidays' => AvailableOnHolidays,
       'customHolidays' => CustomHolidays,
       'customWorkingDays' => CustomWorkingDays,
       'period' => Period,
       'totalHolidays' => TotalHolidays,
       'weeklyHolidays' => WeeklyHolidays
     }.
