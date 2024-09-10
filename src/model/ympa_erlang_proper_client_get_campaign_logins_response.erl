-module(ympa_erlang_proper_client_get_campaign_logins_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_campaign_logins_response/0]).

-export([ympa_erlang_proper_client_get_campaign_logins_response/1]).

-export_type([ympa_erlang_proper_client_get_campaign_logins_response/0]).

-type ympa_erlang_proper_client_get_campaign_logins_response() ::
  [ {'logins', list(binary()) }
  ].


ympa_erlang_proper_client_get_campaign_logins_response() ->
    ympa_erlang_proper_client_get_campaign_logins_response([]).

ympa_erlang_proper_client_get_campaign_logins_response(Fields) ->
  Default = [ {'logins', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

