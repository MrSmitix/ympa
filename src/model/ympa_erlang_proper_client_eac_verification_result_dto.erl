-module(ympa_erlang_proper_client_eac_verification_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_eac_verification_result_dto/0]).

-export([ympa_erlang_proper_client_eac_verification_result_dto/1]).

-export_type([ympa_erlang_proper_client_eac_verification_result_dto/0]).

-type ympa_erlang_proper_client_eac_verification_result_dto() ::
  [ {'verificationResult', ympa_erlang_proper_client_eac_verification_status_type:ympa_erlang_proper_client_eac_verification_status_type() }
  | {'attemptsLeft', integer() }
  ].


ympa_erlang_proper_client_eac_verification_result_dto() ->
    ympa_erlang_proper_client_eac_verification_result_dto([]).

ympa_erlang_proper_client_eac_verification_result_dto(Fields) ->
  Default = [ {'verificationResult', ympa_erlang_proper_client_eac_verification_status_type:ympa_erlang_proper_client_eac_verification_status_type() }
            , {'attemptsLeft', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

