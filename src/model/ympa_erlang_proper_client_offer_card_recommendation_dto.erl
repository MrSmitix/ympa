-module(ympa_erlang_proper_client_offer_card_recommendation_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_card_recommendation_dto/0]).

-export([ympa_erlang_proper_client_offer_card_recommendation_dto/1]).

-export_type([ympa_erlang_proper_client_offer_card_recommendation_dto/0]).

-type ympa_erlang_proper_client_offer_card_recommendation_dto() ::
  [ {'type', ympa_erlang_proper_client_offer_card_recommendation_type:ympa_erlang_proper_client_offer_card_recommendation_type() }
  | {'percent', integer() }
  ].


ympa_erlang_proper_client_offer_card_recommendation_dto() ->
    ympa_erlang_proper_client_offer_card_recommendation_dto([]).

ympa_erlang_proper_client_offer_card_recommendation_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_offer_card_recommendation_type:ympa_erlang_proper_client_offer_card_recommendation_type() }
            , {'percent', integer(0, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

