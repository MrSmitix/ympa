-module(ympa_erlang_proper_client_offer_content_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_content_dto/0]).

-export([ympa_erlang_proper_client_offer_content_dto/1]).

-export_type([ympa_erlang_proper_client_offer_content_dto/0]).

-type ympa_erlang_proper_client_offer_content_dto() ::
  [ {'offerId', binary() }
  | {'categoryId', integer() }
  | {'parameterValues', list(ympa_erlang_proper_client_parameter_value_dto:ympa_erlang_proper_client_parameter_value_dto()) }
  ].


ympa_erlang_proper_client_offer_content_dto() ->
    ympa_erlang_proper_client_offer_content_dto([]).

ympa_erlang_proper_client_offer_content_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'categoryId', integer() }
            , {'parameterValues', list(ympa_erlang_proper_client_parameter_value_dto:ympa_erlang_proper_client_parameter_value_dto(), 1, 300) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

