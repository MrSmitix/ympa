-module(ympa_erlang_proper_client_category_parameter_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_category_parameter_dto/0]).

-export([ympa_erlang_proper_client_category_parameter_dto/1]).

-export_type([ympa_erlang_proper_client_category_parameter_dto/0]).

-type ympa_erlang_proper_client_category_parameter_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'type', ympa_erlang_proper_client_parameter_type:ympa_erlang_proper_client_parameter_type() }
  | {'unit', ympa_erlang_proper_client_category_parameter_unit_dto:ympa_erlang_proper_client_category_parameter_unit_dto() }
  | {'description', binary() }
  | {'recommendationTypes', list(ympa_erlang_proper_client_offer_card_recommendation_type:ympa_erlang_proper_client_offer_card_recommendation_type()) }
  | {'required', boolean() }
  | {'filtering', boolean() }
  | {'distinctive', boolean() }
  | {'multivalue', boolean() }
  | {'allowCustomValues', boolean() }
  | {'values', list(ympa_erlang_proper_client_parameter_value_option_dto:ympa_erlang_proper_client_parameter_value_option_dto()) }
  | {'constraints', ympa_erlang_proper_client_parameter_value_constraints_dto:ympa_erlang_proper_client_parameter_value_constraints_dto() }
  | {'valueRestrictions', list(ympa_erlang_proper_client_value_restriction_dto:ympa_erlang_proper_client_value_restriction_dto()) }
  ].


ympa_erlang_proper_client_category_parameter_dto() ->
    ympa_erlang_proper_client_category_parameter_dto([]).

ympa_erlang_proper_client_category_parameter_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'type', ympa_erlang_proper_client_parameter_type:ympa_erlang_proper_client_parameter_type() }
            , {'unit', ympa_erlang_proper_client_category_parameter_unit_dto:ympa_erlang_proper_client_category_parameter_unit_dto() }
            , {'description', binary() }
            , {'recommendationTypes', list(ympa_erlang_proper_client_offer_card_recommendation_type:ympa_erlang_proper_client_offer_card_recommendation_type()) }
            , {'required', boolean() }
            , {'filtering', boolean() }
            , {'distinctive', boolean() }
            , {'multivalue', boolean() }
            , {'allowCustomValues', boolean() }
            , {'values', list(ympa_erlang_proper_client_parameter_value_option_dto:ympa_erlang_proper_client_parameter_value_option_dto()) }
            , {'constraints', ympa_erlang_proper_client_parameter_value_constraints_dto:ympa_erlang_proper_client_parameter_value_constraints_dto() }
            , {'valueRestrictions', list(ympa_erlang_proper_client_value_restriction_dto:ympa_erlang_proper_client_value_restriction_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

