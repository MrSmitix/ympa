-module(ympa_erlang_proper_client_offer_recommendation_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_recommendation_dto/0]).

-export([ympa_erlang_proper_client_offer_recommendation_dto/1]).

-export_type([ympa_erlang_proper_client_offer_recommendation_dto/0]).

-type ympa_erlang_proper_client_offer_recommendation_dto() ::
  [ {'offer', ympa_erlang_proper_client_offer_for_recommendation_dto:ympa_erlang_proper_client_offer_for_recommendation_dto() }
  | {'recommendation', ympa_erlang_proper_client_offer_recommendation_info_dto:ympa_erlang_proper_client_offer_recommendation_info_dto() }
  ].


ympa_erlang_proper_client_offer_recommendation_dto() ->
    ympa_erlang_proper_client_offer_recommendation_dto([]).

ympa_erlang_proper_client_offer_recommendation_dto(Fields) ->
  Default = [ {'offer', ympa_erlang_proper_client_offer_for_recommendation_dto:ympa_erlang_proper_client_offer_for_recommendation_dto() }
            , {'recommendation', ympa_erlang_proper_client_offer_recommendation_info_dto:ympa_erlang_proper_client_offer_recommendation_info_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

