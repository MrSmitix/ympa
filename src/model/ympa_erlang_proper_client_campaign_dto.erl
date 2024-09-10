-module(ympa_erlang_proper_client_campaign_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_campaign_dto/0]).

-export([ympa_erlang_proper_client_campaign_dto/1]).

-export_type([ympa_erlang_proper_client_campaign_dto/0]).

-type ympa_erlang_proper_client_campaign_dto() ::
  [ {'domain', binary() }
  | {'id', integer() }
  | {'clientId', integer() }
  | {'business', ympa_erlang_proper_client_business_dto:ympa_erlang_proper_client_business_dto() }
  | {'placementType', ympa_erlang_proper_client_placement_type:ympa_erlang_proper_client_placement_type() }
  ].


ympa_erlang_proper_client_campaign_dto() ->
    ympa_erlang_proper_client_campaign_dto([]).

ympa_erlang_proper_client_campaign_dto(Fields) ->
  Default = [ {'domain', binary() }
            , {'id', integer() }
            , {'clientId', integer() }
            , {'business', ympa_erlang_proper_client_business_dto:ympa_erlang_proper_client_business_dto() }
            , {'placementType', ympa_erlang_proper_client_placement_type:ympa_erlang_proper_client_placement_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

