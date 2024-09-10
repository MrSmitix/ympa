-module(ympa_erlang_client_age_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_age_dto/0]).

-type ympa_erlang_client_age_dto() ::
    #{ 'value' := integer(),
       'ageUnit' := ympa_erlang_client_age_unit_type:ympa_erlang_client_age_unit_type()
     }.

encode(#{ 'value' := Value,
          'ageUnit' := AgeUnit
        }) ->
    #{ 'value' => Value,
       'ageUnit' => AgeUnit
     }.
