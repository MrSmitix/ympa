-module(ympa_erlang_client_eac_verification_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_eac_verification_result_dto/0]).

-type ympa_erlang_client_eac_verification_result_dto() ::
    #{ 'verificationResult' => ympa_erlang_client_eac_verification_status_type:ympa_erlang_client_eac_verification_status_type(),
       'attemptsLeft' => integer()
     }.

encode(#{ 'verificationResult' := VerificationResult,
          'attemptsLeft' := AttemptsLeft
        }) ->
    #{ 'verificationResult' => VerificationResult,
       'attemptsLeft' => AttemptsLeft
     }.
