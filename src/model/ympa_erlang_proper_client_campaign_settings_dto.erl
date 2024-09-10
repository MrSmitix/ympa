-module(ympa_erlang_proper_client_campaign_settings_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_campaign_settings_dto/0]).

-export([ympa_erlang_proper_client_campaign_settings_dto/1]).

-export_type([ympa_erlang_proper_client_campaign_settings_dto/0]).

-type ympa_erlang_proper_client_campaign_settings_dto() ::
  [ {'countryRegion', integer() }
  | {'shopName', binary() }
  | {'showInContext', boolean() }
  | {'showInPremium', boolean() }
  | {'useOpenStat', boolean() }
  | {'localRegion', ympa_erlang_proper_client_campaign_settings_local_region_dto:ympa_erlang_proper_client_campaign_settings_local_region_dto() }
  ].


ympa_erlang_proper_client_campaign_settings_dto() ->
    ympa_erlang_proper_client_campaign_settings_dto([]).

ympa_erlang_proper_client_campaign_settings_dto(Fields) ->
  Default = [ {'countryRegion', integer() }
            , {'shopName', binary() }
            , {'showInContext', boolean() }
            , {'showInPremium', boolean() }
            , {'useOpenStat', boolean() }
            , {'localRegion', ympa_erlang_proper_client_campaign_settings_local_region_dto:ympa_erlang_proper_client_campaign_settings_local_region_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

