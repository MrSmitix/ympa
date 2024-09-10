-module(ympa_erlang_proper_client_offer_card_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_card_dto/0]).

-export([ympa_erlang_proper_client_offer_card_dto/1]).

-export_type([ympa_erlang_proper_client_offer_card_dto/0]).

-type ympa_erlang_proper_client_offer_card_dto() ::
  [ {'offerId', binary() }
  | {'mapping', ympa_erlang_proper_client_get_mapping_dto:ympa_erlang_proper_client_get_mapping_dto() }
  | {'parameterValues', list(ympa_erlang_proper_client_parameter_value_dto:ympa_erlang_proper_client_parameter_value_dto()) }
  | {'cardStatus', ympa_erlang_proper_client_offer_card_status_type:ympa_erlang_proper_client_offer_card_status_type() }
  | {'contentRating', integer() }
  | {'recommendations', list(ympa_erlang_proper_client_offer_card_recommendation_dto:ympa_erlang_proper_client_offer_card_recommendation_dto()) }
  | {'errors', list(ympa_erlang_proper_client_offer_error_dto:ympa_erlang_proper_client_offer_error_dto()) }
  | {'warnings', list(ympa_erlang_proper_client_offer_error_dto:ympa_erlang_proper_client_offer_error_dto()) }
  ].


ympa_erlang_proper_client_offer_card_dto() ->
    ympa_erlang_proper_client_offer_card_dto([]).

ympa_erlang_proper_client_offer_card_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'mapping', ympa_erlang_proper_client_get_mapping_dto:ympa_erlang_proper_client_get_mapping_dto() }
            , {'parameterValues', list(ympa_erlang_proper_client_parameter_value_dto:ympa_erlang_proper_client_parameter_value_dto()) }
            , {'cardStatus', ympa_erlang_proper_client_offer_card_status_type:ympa_erlang_proper_client_offer_card_status_type() }
            , {'contentRating', integer() }
            , {'recommendations', list(ympa_erlang_proper_client_offer_card_recommendation_dto:ympa_erlang_proper_client_offer_card_recommendation_dto()) }
            , {'errors', list(ympa_erlang_proper_client_offer_error_dto:ympa_erlang_proper_client_offer_error_dto()) }
            , {'warnings', list(ympa_erlang_proper_client_offer_error_dto:ympa_erlang_proper_client_offer_error_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

