-module(ympa_erlang_proper_client_get_campaign_settings_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_campaign_settings_response/0]).

-export([ympa_erlang_proper_client_get_campaign_settings_response/1]).

-export_type([ympa_erlang_proper_client_get_campaign_settings_response/0]).

-type ympa_erlang_proper_client_get_campaign_settings_response() ::
  [ {'settings', ympa_erlang_proper_client_campaign_settings_dto:ympa_erlang_proper_client_campaign_settings_dto() }
  ].


ympa_erlang_proper_client_get_campaign_settings_response() ->
    ympa_erlang_proper_client_get_campaign_settings_response([]).

ympa_erlang_proper_client_get_campaign_settings_response(Fields) ->
  Default = [ {'settings', ympa_erlang_proper_client_campaign_settings_dto:ympa_erlang_proper_client_campaign_settings_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

