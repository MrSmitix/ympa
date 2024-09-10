-module(ympa_erlang_proper_client_get_campaigns_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_campaigns_response/0]).

-export([ympa_erlang_proper_client_get_campaigns_response/1]).

-export_type([ympa_erlang_proper_client_get_campaigns_response/0]).

-type ympa_erlang_proper_client_get_campaigns_response() ::
  [ {'campaigns', list(ympa_erlang_proper_client_campaign_dto:ympa_erlang_proper_client_campaign_dto()) }
  | {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
  ].


ympa_erlang_proper_client_get_campaigns_response() ->
    ympa_erlang_proper_client_get_campaigns_response([]).

ympa_erlang_proper_client_get_campaigns_response(Fields) ->
  Default = [ {'campaigns', list(ympa_erlang_proper_client_campaign_dto:ympa_erlang_proper_client_campaign_dto()) }
            , {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

