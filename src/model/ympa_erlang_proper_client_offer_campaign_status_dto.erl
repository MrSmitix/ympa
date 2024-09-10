-module(ympa_erlang_proper_client_offer_campaign_status_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_campaign_status_dto/0]).

-export([ympa_erlang_proper_client_offer_campaign_status_dto/1]).

-export_type([ympa_erlang_proper_client_offer_campaign_status_dto/0]).

-type ympa_erlang_proper_client_offer_campaign_status_dto() ::
  [ {'campaignId', integer() }
  | {'status', ympa_erlang_proper_client_offer_campaign_status_type:ympa_erlang_proper_client_offer_campaign_status_type() }
  ].


ympa_erlang_proper_client_offer_campaign_status_dto() ->
    ympa_erlang_proper_client_offer_campaign_status_dto([]).

ympa_erlang_proper_client_offer_campaign_status_dto(Fields) ->
  Default = [ {'campaignId', integer() }
            , {'status', ympa_erlang_proper_client_offer_campaign_status_type:ympa_erlang_proper_client_offer_campaign_status_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

