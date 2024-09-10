-module(ympa_erlang_proper_client_category_content_parameters_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_category_content_parameters_dto/0]).

-export([ympa_erlang_proper_client_category_content_parameters_dto/1]).

-export_type([ympa_erlang_proper_client_category_content_parameters_dto/0]).

-type ympa_erlang_proper_client_category_content_parameters_dto() ::
  [ {'categoryId', integer() }
  | {'parameters', list(ympa_erlang_proper_client_category_parameter_dto:ympa_erlang_proper_client_category_parameter_dto()) }
  ].


ympa_erlang_proper_client_category_content_parameters_dto() ->
    ympa_erlang_proper_client_category_content_parameters_dto([]).

ympa_erlang_proper_client_category_content_parameters_dto(Fields) ->
  Default = [ {'categoryId', integer() }
            , {'parameters', list(ympa_erlang_proper_client_category_parameter_dto:ympa_erlang_proper_client_category_parameter_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

