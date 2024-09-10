-module(ympa_erlang_proper_client_campaign_quality_rating_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_campaign_quality_rating_dto/0]).

-export([ympa_erlang_proper_client_campaign_quality_rating_dto/1]).

-export_type([ympa_erlang_proper_client_campaign_quality_rating_dto/0]).

-type ympa_erlang_proper_client_campaign_quality_rating_dto() ::
  [ {'campaignId', integer() }
  | {'ratings', list(ympa_erlang_proper_client_quality_rating_dto:ympa_erlang_proper_client_quality_rating_dto()) }
  ].


ympa_erlang_proper_client_campaign_quality_rating_dto() ->
    ympa_erlang_proper_client_campaign_quality_rating_dto([]).

ympa_erlang_proper_client_campaign_quality_rating_dto(Fields) ->
  Default = [ {'campaignId', integer() }
            , {'ratings', list(ympa_erlang_proper_client_quality_rating_dto:ympa_erlang_proper_client_quality_rating_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

