-module(ympa_erlang_proper_client_campaign_settings_schedule_source_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_campaign_settings_schedule_source_type/0]).

-export_type([ympa_erlang_proper_client_campaign_settings_schedule_source_type/0]).

-type ympa_erlang_proper_client_campaign_settings_schedule_source_type() ::
  binary().

ympa_erlang_proper_client_campaign_settings_schedule_source_type() ->
  elements([<<"WEB">>, <<"YML">>]).

