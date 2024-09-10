-module(ympa_erlang_proper_client_campaign_settings_schedule_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_campaign_settings_schedule_dto/0]).

-export([ympa_erlang_proper_client_campaign_settings_schedule_dto/1]).

-export_type([ympa_erlang_proper_client_campaign_settings_schedule_dto/0]).

-type ympa_erlang_proper_client_campaign_settings_schedule_dto() ::
  [ {'availableOnHolidays', boolean() }
  | {'customHolidays', list(binary()) }
  | {'customWorkingDays', list(binary()) }
  | {'period', ympa_erlang_proper_client_campaign_settings_time_period_dto:ympa_erlang_proper_client_campaign_settings_time_period_dto() }
  | {'totalHolidays', list(binary()) }
  | {'weeklyHolidays', list(integer(1, 7)) }
  ].


ympa_erlang_proper_client_campaign_settings_schedule_dto() ->
    ympa_erlang_proper_client_campaign_settings_schedule_dto([]).

ympa_erlang_proper_client_campaign_settings_schedule_dto(Fields) ->
  Default = [ {'availableOnHolidays', boolean() }
            , {'customHolidays', list(binary()) }
            , {'customWorkingDays', list(binary()) }
            , {'period', ympa_erlang_proper_client_campaign_settings_time_period_dto:ympa_erlang_proper_client_campaign_settings_time_period_dto() }
            , {'totalHolidays', list(binary()) }
            , {'weeklyHolidays', list(integer(1, 7)) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

