-module(ympa_erlang_proper_client_get_campaign_region_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_campaign_region_response/0]).

-export([ympa_erlang_proper_client_get_campaign_region_response/1]).

-export_type([ympa_erlang_proper_client_get_campaign_region_response/0]).

-type ympa_erlang_proper_client_get_campaign_region_response() ::
  [ {'region', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
  ].


ympa_erlang_proper_client_get_campaign_region_response() ->
    ympa_erlang_proper_client_get_campaign_region_response([]).

ympa_erlang_proper_client_get_campaign_region_response(Fields) ->
  Default = [ {'region', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

