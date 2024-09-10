-module(ympa_erlang_proper_client_get_campaign_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_campaign_response/0]).

-export([ympa_erlang_proper_client_get_campaign_response/1]).

-export_type([ympa_erlang_proper_client_get_campaign_response/0]).

-type ympa_erlang_proper_client_get_campaign_response() ::
  [ {'campaign', ympa_erlang_proper_client_campaign_dto:ympa_erlang_proper_client_campaign_dto() }
  ].


ympa_erlang_proper_client_get_campaign_response() ->
    ympa_erlang_proper_client_get_campaign_response([]).

ympa_erlang_proper_client_get_campaign_response(Fields) ->
  Default = [ {'campaign', ympa_erlang_proper_client_campaign_dto:ympa_erlang_proper_client_campaign_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

