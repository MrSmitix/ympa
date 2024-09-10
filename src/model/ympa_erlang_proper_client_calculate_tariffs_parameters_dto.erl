-module(ympa_erlang_proper_client_calculate_tariffs_parameters_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_calculate_tariffs_parameters_dto/0]).

-export([ympa_erlang_proper_client_calculate_tariffs_parameters_dto/1]).

-export_type([ympa_erlang_proper_client_calculate_tariffs_parameters_dto/0]).

-type ympa_erlang_proper_client_calculate_tariffs_parameters_dto() ::
  [ {'campaignId', integer() }
  | {'sellingProgram', ympa_erlang_proper_client_selling_program_type:ympa_erlang_proper_client_selling_program_type() }
  | {'frequency', ympa_erlang_proper_client_payment_frequency_type:ympa_erlang_proper_client_payment_frequency_type() }
  ].


ympa_erlang_proper_client_calculate_tariffs_parameters_dto() ->
    ympa_erlang_proper_client_calculate_tariffs_parameters_dto([]).

ympa_erlang_proper_client_calculate_tariffs_parameters_dto(Fields) ->
  Default = [ {'campaignId', integer() }
            , {'sellingProgram', ympa_erlang_proper_client_selling_program_type:ympa_erlang_proper_client_selling_program_type() }
            , {'frequency', ympa_erlang_proper_client_payment_frequency_type:ympa_erlang_proper_client_payment_frequency_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

