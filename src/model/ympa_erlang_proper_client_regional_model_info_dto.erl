-module(ympa_erlang_proper_client_regional_model_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_regional_model_info_dto/0]).

-export([ympa_erlang_proper_client_regional_model_info_dto/1]).

-export_type([ympa_erlang_proper_client_regional_model_info_dto/0]).

-type ympa_erlang_proper_client_regional_model_info_dto() ::
  [ {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
  | {'regionId', integer() }
  ].


ympa_erlang_proper_client_regional_model_info_dto() ->
    ympa_erlang_proper_client_regional_model_info_dto([]).

ympa_erlang_proper_client_regional_model_info_dto(Fields) ->
  Default = [ {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
            , {'regionId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

